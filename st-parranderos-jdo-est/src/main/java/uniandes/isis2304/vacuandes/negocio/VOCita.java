package uniandes.isis2304.vacuandes.negocio;

import java.util.Date;

public interface VOCita {

	/**
	 * @return the fecha
	 */
	public Date getFecha();
	/**
	 * @return the ciudadano
	 */
	public long getCiudadano() ;
	/**
	 * @return the punto_Vacunacion
	 */
	public long getPunto_Vacunacion() ;
	/**
	 * @return the vacuna
	 */
	public long getVacuna() ;
	
	@Override
	public String toString();
}
