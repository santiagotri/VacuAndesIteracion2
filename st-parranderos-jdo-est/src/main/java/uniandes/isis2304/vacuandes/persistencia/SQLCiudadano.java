package uniandes.isis2304.vacuandes.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.vacuandes.negocio.Ciudadano;

public class SQLCiudadano {
	
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra acá para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaVacuandes.SQL;

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	private PersistenciaVacuandes pp;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor
	 * @param pp - El Manejador de persistencia de la aplicación
	 */
	public SQLCiudadano (PersistenciaVacuandes pp)
	{
		this.pp = pp;
	}

	public long adicionarCiudadano(PersistenceManager pm, long cedula, String nombre_completo, String estado_vacunacion, String region, Boolean desea, long plan_de_vacunacion, long punto_vacunacion, long oficina_regional_asignada)
	{
		int desea_ser_vacunado;
		if(desea){ desea_ser_vacunado= 1;} else {desea_ser_vacunado= 0; }
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaCiudadano() + "(cedula, nombre_completo,estado_vacunacion,region,desea_ser_vacunado, plan_de_vacunacion, punto_vacunacion, oficina_regional_asignada) values (?, ? ,? ,? ,? ,? ,? ,?)");
		q.setParameters(cedula, nombre_completo, estado_vacunacion, region, desea_ser_vacunado, plan_de_vacunacion, punto_vacunacion, oficina_regional_asignada);
		return (long) q.executeUnique(); 
	}
	
	public long eliminarTodosLosCiudadanos(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCiudadano());
		return (long) q.executeUnique();	
	}
	
	public long eliminarCiudadanoPorCedula(PersistenceManager pm, long cedula)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCiudadano() + " WHERE cedula = ?");
        q.setParameters(cedula);
        return (long) q.executeUnique();
	}
	
	public List<Ciudadano> darListCiudadanos(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaCiudadano());
		q.setResultClass(Ciudadano.class);
		return (List<Ciudadano>) q.execute();
	}
}
