package uniandes.isis2304.vacuandes.negocio;

public interface VOPuntoVacunacion {
	
	/**
	 * @return the idPuntoVacunacion
	 */
	public long getIdPuntoVacunacion();
	/**
	 * @return the localizacion
	 */
	public String getLocalizacion();
	/**
	 * @return the capacidadAtencionSimultanea
	 */
	public int getCapacidadAtencionSimultanea() ;
	/**
	 * @return the capacidadAtencionTotalDiaria
	 */
	public int getCapacidadAtencionTotalDiaria() ;
	/**
	 * @return the infraestructuraParaDoosis
	 */
	public String getInfraestructuraParaDoosis() ;
	/**
	 * @return the cantidadVacunasEnviables
	 */
	public int getCantidadVacunasEnviables() ;
	
	/**
	 * @return the cantidadVacunasActuales
	 */
	public int getCantidadVacunasActuales() ;
	/**
	 * @return the tipoPuntoVacunacion
	 */
	public String getTipoPuntoVacunacion();
	/**
	 * @return the administrador
	 */
	public long getAdministrador();
	
	@Override
	public String toString();
}
