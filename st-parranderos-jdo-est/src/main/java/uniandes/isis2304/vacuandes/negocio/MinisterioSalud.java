package uniandes.isis2304.vacuandes.negocio;

public class MinisterioSalud implements VOMinisterioSalud{
	private long idMinisterio;
	private long planDeVacunacion;
	/**
	 * @param idMinisterio
	 * @param planDeVacunacion
	 */
	public MinisterioSalud(long idMinisterio, long planDeVacunacion) {
		this.idMinisterio = idMinisterio;
		this.planDeVacunacion = planDeVacunacion;
	}
	/**
	 * @return the idMinisterio
	 */
	public long getIdMinisterio() {
		return idMinisterio;
	}
	/**
	 * @return the planDeVacunacion
	 */
	public long getPlanDeVacunacion() {
		return planDeVacunacion;
	}
	/**
	 * @param idMinisterio the idMinisterio to set
	 */
	public void setIdMinisterio(long idMinisterio) {
		this.idMinisterio = idMinisterio;
	}
	/**
	 * @param planDeVacunacion the planDeVacunacion to set
	 */
	public void setPlanDeVacunacion(long planDeVacunacion) {
		this.planDeVacunacion = planDeVacunacion;
	}
	@Override
	public String toString() {
		return "MinisterioSalud [idMinisterio=" + idMinisterio + ", planDeVacunacion=" + planDeVacunacion + "]";
	}
	
	
}
