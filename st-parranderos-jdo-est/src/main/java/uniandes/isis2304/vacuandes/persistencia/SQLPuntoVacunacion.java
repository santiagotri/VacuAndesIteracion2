package uniandes.isis2304.vacuandes.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.vacuandes.negocio.PlanDeVacunacion;

public class SQLPuntoVacunacion {
	
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
	public SQLPuntoVacunacion (PersistenciaVacuandes pp)
	{
		this.pp = pp;
	}
	
	public long adicionarPuntoVacunacion(PersistenceManager pm, String localizacion, int capacidad_de_atencion_simultanea, int capacidad_de_atencion_total_diaria, String infraestructura_para_dosis, int cantidad_de_vacunas_enviables, int cantidad_de_vacunas_actuales, String tipo_punto_vacunacion, String administrador)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaPuntoVacunacion() + "(localizacion, capacidad_de_atencion_simultanea, capacidad_de_atencion_total_diaria, infraestructura_para_dosis, cantidad_de_vacunas_enviables, cantidad_de_vacunas_actuales, tipo_punto_vacunacion, administrador) values (?, ?, ?, ?, ?, ?, ?, ?)");
		q.setParameters(localizacion, capacidad_de_atencion_simultanea, capacidad_de_atencion_total_diaria, infraestructura_para_dosis, cantidad_de_vacunas_enviables, cantidad_de_vacunas_actuales, tipo_punto_vacunacion, administrador);
		return (long) q.executeUnique(); 
	}

	public long eliminarTodosLosPuntosVacunacion(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaPuntoVacunacion());
		return (long) q.executeUnique();
	}
	
	public long eliminarPuntoVacunacionPorId(PersistenceManager pm, long id_punto_vacunacion)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaPuntoVacunacion() + " WHERE id_punto_vacunacion = ?");
        q.setParameters(id_punto_vacunacion);
        return (long) q.executeUnique();
	}
	
	public long eliminarPuntoVacunacionPorLocalizacion(PersistenceManager pm, long localizacion)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaPuntoVacunacion() + " WHERE localizacion = ?");
        q.setParameters(localizacion);
        return (long) q.executeUnique();
	}
	
	public List<PlanDeVacunacion> darListPuntoVacunacion(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaPlanDeVacunacion());
		q.setResultClass(PlanDeVacunacion.class);
		return (List<PlanDeVacunacion>) q.execute();
	}
}
