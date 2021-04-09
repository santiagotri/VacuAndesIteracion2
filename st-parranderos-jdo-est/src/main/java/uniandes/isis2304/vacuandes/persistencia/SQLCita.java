package uniandes.isis2304.vacuandes.persistencia;

import java.sql.Date;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.vacuandes.negocio.Cita;
import uniandes.isis2304.vacuandes.negocio.Ciudadano;

public class SQLCita {
	
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
	public SQLCita (PersistenciaVacuandes pp)
	{
		this.pp = pp;
	}
	
	public long adicionarCita(PersistenceManager pm, Date fecha, long ciudadano, long punto_vacunacion, long vacuna)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaCita() + "(fecha, ciudadano, punto_vacunacion, vacuna) values (?, ?, ?, ?)");
		q.setParameters(fecha, ciudadano, punto_vacunacion, vacuna); 
		return (long) q.executeUnique();	
	}
	
	public long eliminarTodasLasCitas(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCita());
		return (long) q.executeUnique(); 
	}
	
	public long eliminarCitaPorCiudadano(PersistenceManager pm, long ciudadano)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCita() + " WHERE ciudadano = ?");
        q.setParameters(ciudadano);
        return (long) q.executeUnique();
	}
	
	public long eliminarCitaPorPuntoVacunacion(PersistenceManager pm, long punto_Vacunacion)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCita() + " WHERE PUNTO_VACUNACION = ?");
        q.setParameters(punto_Vacunacion);
        return (long) q.executeUnique();
	}
	
	public List<Cita> darListaCitas(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaCita());
		q.setResultClass(Cita.class);
		return (List<Cita>) q.execute();
	}
	
	public Cita darCitaPorCiudadanoYFecha(PersistenceManager pm, Date fecha, long ciudadano)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaCita() + " WHERE fecha = ? AND ciudadano = ?");
		q.setResultClass(Cita.class);
		q.setParameters(fecha, ciudadano);
		return (Cita) q.executeUnique();
	}

}
