package uniandes.isis2304.vacuandes.negocio;

import java.sql.Date;

/**
 * Intrefaz para los metodos de Plan de vacunación
 * @author j.ramirezb
 *
 */
public interface VOPlanDeVacunacion {

	public long getIdPlanDeVacunacion();
	
	public String getNombre(); 
	
	public String getDescripcion(); 
	
	public Date getFechaActualizacion(); 
	
	@Override
	public String toString(); 
	
}
