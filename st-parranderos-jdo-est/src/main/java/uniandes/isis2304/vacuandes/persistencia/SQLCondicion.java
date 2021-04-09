package uniandes.isis2304.vacuandes.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.vacuandes.negocio.Condicion;

public class SQLCondicion {

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
	public SQLCondicion (PersistenciaVacuandes pp)
	{
		this.pp = pp;
	}

	public long adicionarCondicion(PersistenceManager pm, String condiciones, int etapa) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaCondicion() + "(condiciones, etapa) values (?, ?)");
        q.setParameters(condiciones, etapa);
        return (long) q.executeUnique();
	}
	
	public long eliminarTodasLasCondiciones(PersistenceManager pm) 
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCondicion());
        return (long) q.executeUnique();
	}
	
	public long eliminarCondicionesPorCondicion(PersistenceManager pm, String condicion) 
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCondicion() + " WHERE condicion = ?");
        q.setParameters(condicion);
        return (long) q.executeUnique();
	}
	
	public long eliminarCondicionesPorEtapa(PersistenceManager pm, int etapa) 
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCondicion() + " WHERE etapa = ?");
        q.setParameters(etapa);
        return (long) q.executeUnique();
	}
	
	public List<Condicion> darListCondiciones(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaCondicion());
		q.setResultClass(Condicion.class);
		return (List<Condicion>) q.execute();
	}
}
