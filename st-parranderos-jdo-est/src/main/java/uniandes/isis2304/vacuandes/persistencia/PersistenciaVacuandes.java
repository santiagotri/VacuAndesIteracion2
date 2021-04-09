package uniandes.isis2304.vacuandes.persistencia;

import java.util.LinkedList;
import java.util.List;

import javax.jdo.JDODataStoreException;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import org.apache.log4j.Logger;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import uniandes.isis2304.parranderos.negocio.Bebida;
import uniandes.isis2304.parranderos.negocio.TipoBebida;
import uniandes.isis2304.vacuandes.negocio.ListCondicionesCiudadano;
import uniandes.isis2304.vacuandes.negocio.Trabajador;
import uniandes.isis2304.vacuandes.negocio.Usuario;


public class PersistenciaVacuandes {

	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Logger para escribir la traza de la ejecución
	 */
	private static Logger log = Logger.getLogger(PersistenciaVacuandes.class.getName());

	/**
	 * Cadena para indicar el tipo de sentencias que se va a utilizar en una consulta
	 */
	public final static String SQL = "javax.jdo.query.SQL";

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * Atributo privado que es el único objeto de la clase - Patrón SINGLETON
	 */
	private static PersistenciaVacuandes instance;

	/**
	 * Fábrica de Manejadores de persistencia, para el manejo correcto de las transacciones
	 */
	private PersistenceManagerFactory pmf;

	/**
	 * Arreglo de cadenas con los nombres de las tablas de la base de datos, en su orden:
	 * Secuenciador, Cita, bebida, bar, bebedor, gustan, sirven y visitan
	 */
	private List <String> tablas;

	
	/**
	 * Atributo para el acceso a la tabla Cita de la base de datos
	 */
	private SQLCita sqlCita;

	/**
	 * Atributo para el acceso a la tabla Ciudadano de la base de datos
	 */
	private SQLCiudadano sqlCiudadano;
	
	/**
	 * Atributo para el acceso a la tabla Ciudadano de la base de datos
	 */
	private SQLCondicion sqlCondicion;
	
	/**
	 * Atributo para el acceso a la tabla ListCondicionesCiudadano de la base de datos
	 */
	private SQLListCondicionesCiudadano sqlListCondicionesCiudadano;


	/**
	 * Atributo para el acceso a la tabla ListContraindicacionesVacuna de la base de datos
	 */
	private SQLListContraindicacionesVacuna sqlListContraindicacionesVacuna;

	/**
	 * Atributo para el acceso a la tabla MinisterioSalud de la base de datos
	 */
	private SQLMinisterioSalud sqlMinisterioSalud;

	/**
	 * Atributo para el acceso a la tabla OficinaRegionalEPS de la base de datos
	 */
	private SQLOficinaRegionalEPS sqlOficinaRegionalEPS;

	/**
	 * Atributo para el acceso a la tabla PlanDeVacunacion de la base de datos
	 */
	private SQLPlanDeVacunacion sqlPlanDeVacunacion;

	/**
	 * Atributo para el acceso a la tabla PuntoVacunacion de la base de datos
	 */
	private SQLPuntoVacunacion sqlPuntoVacunacion;

	/**
	 * Atributo para el acceso a la tabla Trabajador de la base de datos
	 */
	private SQLTrabajador sqlTrabajador;

	/**
	 * Atributo para el acceso a la tabla Usuario de la base de datos
	 */
	private SQLUsuario sqlUsuario;

	/**
	 * Atributo para el acceso a la tabla Vacuna de la base de datos
	 */
	private SQLVacuna sqlVacuna;

	private PersistenciaVacuandes ()
	{
		pmf = JDOHelper.getPersistenceManagerFactory("Parranderos");		
		crearClasesSQL ();

		// Define los nombres por defecto de las tablas de la base de datos
		tablas = new LinkedList<String> ();
		tablas.add ("CITA");
		tablas.add ("CIUDADANO");
		tablas.add ("CONDICION");
		tablas.add ("LIST_CONDICIONES_CIUDADANO");
		tablas.add ("LIST_CONTRAINDICACIONES_VACUNA");
		tablas.add ("MINISTERIO_DE_SALUD");
		tablas.add ("OFICINA_REGIONAL_EPS");
		tablas.add ("PLAN_DE_VACUNACION");
		tablas.add ("PUNTO_VACUNACION");
		tablas.add ("TRABAJADOR");
		tablas.add ("USUARIO");
		tablas.add ("VACUNA");
	}
	
	
	/**
	 * Constructor privado, que recibe los nombres de las tablas en un objeto Json - Patrón SINGLETON
	 * @param tableConfig - Objeto Json que contiene los nombres de las tablas y de la unidad de persistencia a manejar
	 */
	private PersistenciaVacuandes (JsonObject tableConfig)
	{
		crearClasesSQL ();
		tablas = leerNombresTablas (tableConfig);
		
		String unidadPersistencia = tableConfig.get ("unidadPersistencia").getAsString ();
		log.trace ("Accediendo unidad de persistencia: " + unidadPersistencia);
		pmf = JDOHelper.getPersistenceManagerFactory (unidadPersistencia);
	}

	/**
	 * @return Retorna el único objeto PersistenciaParranderos existente - Patrón SINGLETON
	 */
	public static PersistenciaVacuandes getInstance ()
	{
		if (instance == null)
		{
			instance = new PersistenciaVacuandes ();
		}
		return instance;
	}
	
	/**
	 * Constructor que toma los nombres de las tablas de la base de datos del objeto tableConfig
	 * @param tableConfig - El objeto JSON con los nombres de las tablas
	 * @return Retorna el único objeto PersistenciaParranderos existente - Patrón SINGLETON
	 */
	public static PersistenciaVacuandes getInstance (JsonObject tableConfig)
	{
		if (instance == null)
		{
			instance = new PersistenciaVacuandes (tableConfig);
		}
		return instance;
	}

	/**
	 * Cierra la conexión con la base de datos
	 */
	public void cerrarUnidadPersistencia ()
	{
		pmf.close ();
		instance = null;
	}
	
	/**
	 * Genera una lista con los nombres de las tablas de la base de datos
	 * @param tableConfig - El objeto Json con los nombres de las tablas
	 * @return La lista con los nombres del secuenciador y de las tablas
	 */
	private List <String> leerNombresTablas (JsonObject tableConfig)
	{
		JsonArray nombres = tableConfig.getAsJsonArray("tablas") ;

		List <String> resp = new LinkedList <String> ();
		for (JsonElement nom : nombres)
		{
			resp.add (nom.getAsString ());
		}
		
		return resp;
	}
	
	/**
	 * Crea los atributos de clases de apoyo SQL
	 */
	private void crearClasesSQL ()
	{
		
		sqlCita = new SQLCita(this);
		sqlCiudadano = new SQLCiudadano(this);
		sqlCondicion = new SQLCondicion(this);
		sqlListCondicionesCiudadano = new SQLListCondicionesCiudadano(this);
		sqlListContraindicacionesVacuna = new SQLListContraindicacionesVacuna(this);
		sqlMinisterioSalud = new SQLMinisterioSalud(this);
		sqlOficinaRegionalEPS = new SQLOficinaRegionalEPS(this);
		sqlPlanDeVacunacion = new SQLPlanDeVacunacion(this);
		sqlPuntoVacunacion = new SQLPuntoVacunacion(this);
		sqlTrabajador = new SQLTrabajador(this);
		sqlUsuario = new SQLUsuario(this);
		sqlVacuna = new SQLVacuna(this);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de Cita de vacuandes
	 */
	public String darTablaCita ()
	{
		return tablas.get (0);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de Ciudadano de vacuandes
	 */
	public String darTablaCiudadano ()
	{
		return tablas.get (1);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de Condicion de vacuandes
	 */
	public String darTablaCondicion()
	{
		return tablas.get (2);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de ListCondicionesCiudadano de vacuandes
	 */
	public String darTablaListCondicionesCiudadano ()
	{
		return tablas.get (3);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de ListContraindicacionesVacuna de vacuandes
	 */
	public String darTablaListContraindicacionesVacuna ()
	{
		return tablas.get (4);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de MinisterioSalud de vacuandes
	 */
	public String darTablaMinisterioSalud ()
	{
		return tablas.get (5);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de OficinaRegionalEPS de vacuandes
	 */
	public String darTablaOficinaRegionalEPS ()
	{
		return tablas.get (6);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de PlanDeVacunacion de vacuandes
	 */
	public String darTablaPlanDeVacunacion ()
	{
		return tablas.get (7);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de PuntoVacunacion de vacuandes
	 */
	public String darTablaPuntoVacunacion ()
	{
		return tablas.get (8);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de Trabajador de vacuandes
	 */
	public String darTablaTrabajador ()
	{
		return tablas.get (9);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de Usuario de vacuandes
	 */
	public String darTablaUsuario ()
	{
		return tablas.get (10);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de Vacuna de vacuandes
	 */
	public String darTablaVacuna ()
	{
		return tablas.get (11);
	}
	
	
	/**
	 * Extrae el mensaje de la exception JDODataStoreException embebido en la Exception e, que da el detalle específico del problema encontrado
	 * @param e - La excepción que ocurrio
	 * @return El mensaje de la excepción JDO
	 */
	private String darDetalleException(Exception e) 
	{
		String resp = "";
		if (e.getClass().getName().equals("javax.jdo.JDODataStoreException"))
		{
			JDODataStoreException je = (javax.jdo.JDODataStoreException) e;
			return je.getNestedExceptions() [0].getMessage();
		}
		return resp;
	}
	
	
	
	public ListCondicionesCiudadano adicionarCondicionCiudadano( String condicion, long cedula) 
	{
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try
        {
            tx.begin();          
            long tuplasInsertadas = sqlListCondicionesCiudadano.adicionarCondicionesCiudadano(pm, condicion, cedula);
            tx.commit();
            
            log.trace ("Inserción condicionCiudadano: " + cedula + ": " + tuplasInsertadas + " tuplas insertadas");
            return new ListCondicionesCiudadano(cedula, condicion);
        }
        catch (Exception e)
        {
//        	e.printStackTrace();
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
        	return null;
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
        
	}

	/* ****************************************************************
	 * 			Métodos para manejar inicio sesion
	 *****************************************************************/
	

	public Usuario verificarInicioDeSesion(String username, String contrasena)
	{
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try
        {
        	log.info ("Buscando usuario \"" + username + "\" con contrasena \""+ contrasena+ "\"");
            tx.begin();
            Usuario usuario = sqlUsuario.darUsuario(pm, username);
            tx.commit();
            log.info ("Usuario buscado \"" + usuario.getUsername() + "\" con contrasena \""+ usuario.getContrasena()+ "\"");
            
            return usuario;
        	
        	
        	
//        	tx.begin();
//        	long rta = sqlMinisterioSalud.agregarMinisterioDeSalud(pm, 1);
//        	System.out.println(rta);
//        	tx.commit();
//        	return null;
        }
        catch (Exception e)
        {
        	e.printStackTrace();
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
        	return null;
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
	}

	/* ****************************************************************
	 * 			Métodos para manejar trabajo
	 *****************************************************************/

	public Trabajador buscarTrabajadorPorCedula(long cedula) {
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try
        {
        	log.info ("Buscando el trabajo de la cedula " + cedula);
            tx.begin();
            Trabajador trabajador = sqlTrabajador.darTrabajador(pm, cedula);
            tx.commit();
            log.info ("Trabajador buscado por cedula " + cedula);
            
            return trabajador;
        	
        }
        catch (Exception e)
        {
        	e.printStackTrace();
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
        	return null;
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
	}
	

}
