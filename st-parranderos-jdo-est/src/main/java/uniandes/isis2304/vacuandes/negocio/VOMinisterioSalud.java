package uniandes.isis2304.vacuandes.negocio;

public interface VOMinisterioSalud {
	/**
	 * @return the idMinisterio
	 */
	public long getIdMinisterio();
	/**
	 * @return the planDeVacunacion
	 */
	public long getPlanDeVacunacion();
	
	@Override
	public String toString();
}
