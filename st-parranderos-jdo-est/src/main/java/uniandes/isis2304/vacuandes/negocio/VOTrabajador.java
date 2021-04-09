package uniandes.isis2304.vacuandes.negocio;

public interface VOTrabajador {
	/**
	 * @return the cedula
	 */
	public long getCedula();
	/**
	 * @return the trabajo
	 */
	public String getTrabajo();
	/**
	 * @return the administradorVacuandes
	 */
	public int getAdministrador_Vacuandes();
	
	@Override
	public String toString();
	
}
