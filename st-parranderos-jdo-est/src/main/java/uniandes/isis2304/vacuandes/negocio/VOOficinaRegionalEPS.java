package uniandes.isis2304.vacuandes.negocio;

public interface VOOficinaRegionalEPS {

	/**
	 * @return the region
	 */
	public String getRegion() ;

	/**
	 * @return the username
	 */
	public String getUsername();

	/**
	 * @return the cantidadVacunasActuales
	 */
	public int getCantidadVacunasActuales();
	/**
	 * @return the planDeVacunacion
	 */
	public long getPlanDeVacunacion() ;
	
	@Override
	public String toString();
}
