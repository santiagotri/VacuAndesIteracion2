package uniandes.isis2304.vacuandes.negocio;

import java.sql.Date;

public interface VOCita {

	/**
	 * @return the idCita
	 */
	public long getIdCita() ;
	/**
	 * @return the fecha
	 */
	public Date getFecha();
	/**
	 * @return the ciudadano
	 */
	public long getCiudadano() ;
	/**
	 * @return the puntoVacunacion
	 */
	public long getPuntoVacunacion() ;
	/**
	 * @return the vacuna
	 */
	public long getVacuna() ;
	
	@Override
	public String toString();
}