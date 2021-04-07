package uniandes.isis2304.vacuandes.negocio;

public interface VOVacuna {
	/**
	 * @return the idVacuna
	 */
	public long getIdVacuna() ;
	/**
	 * @return the condicionPreservacion
	 */
	public String getCondicionPreservacion() ;
	/**
	 * @return the puntoVacunacion
	 */
	public long getPuntoVacunacion();
	/**
	 * @return the planDeVacunacion
	 */
	public long getPlanDeVacunacion();
	/**
	 * @return the oficinaRegional
	 */
	public long getOficinaRegional() ;
	/**
	 * @return the utilizada
	 */
	public boolean isUtilizada() ;
	
	@Override
	public String toString();
}
