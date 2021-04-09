package uniandes.isis2304.vacuandes.negocio;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import org.apache.log4j.Logger;

import com.google.gson.JsonObject;

import uniandes.isis2304.parranderos.negocio.Bebida;
import uniandes.isis2304.parranderos.negocio.TipoBebida;
import uniandes.isis2304.vacuandes.persistencia.PersistenciaVacuandes;

public class Vacuandes {
	
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Logger para escribir la traza de la ejecución
	 */
	private static Logger log = Logger.getLogger(Vacuandes.class.getName());
	
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia
	 */
	private PersistenciaVacuandes pp;
	
	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * El constructor por defecto
	 */
	public Vacuandes ()
	{
		pp = PersistenciaVacuandes.getInstance ();
	}
	
	/**
	 * El constructor qye recibe los nombres de las tablas en tableConfig
	 * @param tableConfig - Objeto Json con los nombres de las tablas y de la unidad de persistencia
	 */
	public Vacuandes (JsonObject tableConfig)
	{
		pp = PersistenciaVacuandes.getInstance (tableConfig);
	}
	
	/**
	 * Cierra la conexión con la base de datos (Unidad de persistencia)
	 */
	public void cerrarUnidadPersistencia ()
	{
		pp.cerrarUnidadPersistencia ();
	}

	public Usuario verificarInicioDeSesion(String username, String contrasena) {
		//PersistenceManager pm = pmf.getPersistenceManager();
		log.info ("Iniciando sesion para usuario " + username);
		Usuario rta = pp.verificarInicioDeSesion (username, contrasena);
        log.info ("Verificado inicio sesion");
        return rta;
	}
	
	/* ****************************************************************
	 * 			Métodos para manejar CITA
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar CIUDADANO
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar LIST_CONDICIONES_CIUDADANO
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar LIST_CONTRAINDICACIONES_CIUDADANO
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar MINISTERIO_SALUD
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar OFICINA_REGIONAL_EPS
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar PLAN_DE_VACUNACION
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar PUNTO_VACUNACION
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar TRABAJADOR
	 *****************************************************************/
	
	public Trabajador darTrabajadorPorCedula(long cedula) {
		log.info ("Buscando trabjador de cedula: " + cedula);
		Trabajador rta = pp.buscarTrabajadorPorCedula(cedula);
        log.info ("Trabajo verificado");
        return rta;
	}
	
	/* ****************************************************************
	 * 			Métodos para manejar USUARIO
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar VACUNA
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar CONDICION
	 *****************************************************************/
	
	public Condicion agregarCondicion(String condiciones, int etapa) {
		log.info ("Creando una nueva condicion");
		Condicion rta = pp.adicionarCondicion(condiciones, etapa);
        log.info ("Se creo la condicion: " + condiciones +" de etapa numero:" + etapa);
        return rta;
	}
	
	public Condicion getCondicion(String condiciones)
	{
		log.info ("Buscando una condicion");
		Condicion rta = pp.getCondicionPorCondiciones(condiciones);
        log.info ("Se encontró la condición: " + condiciones);
        return rta;
	}
	
	public Condicion updateCondicion(String condiciones, int etapa)
	{
		log.info ("Actualizando una condicion");
		Condicion rta = pp.updateCondicionPorCondiciones(condiciones, etapa);
        log.info ("Se actualizo la condicion" + condiciones + " a etapa " + etapa);
        return rta;
	}
	
	public Condicion registrarCondicionesDePriorizacion(String condiciones, int etapa)
	{
		Condicion rta = getCondicion(condiciones);
		if(rta != null)
		{
			updateCondicion(condiciones, etapa); 
		}
		else
		{
			agregarCondicion(condiciones, etapa); 
		}
		
		return rta;
	}
	
	

}
