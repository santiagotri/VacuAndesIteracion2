package uniandes.isis2304.vacuandes.negocio;

public class Vacuna implements VOVacuna {

	private long idVacuna;
	private String condicionPreservacion;
	private long puntoVacunacion;
	private long planDeVacunacion;
	private long oficinaRegional;
	private boolean utilizada;
	/**
	 * @param idVacuna
	 * @param condicionPreservacion
	 * @param puntoVacunacion
	 * @param planDeVacunacion
	 * @param oficinaRegional
	 * @param utilizada
	 */
	public Vacuna(long idVacuna, String condicionPreservacion, long puntoVacunacion, long planDeVacunacion,
			long oficinaRegional, boolean utilizada) {
		this.idVacuna = idVacuna;
		this.condicionPreservacion = condicionPreservacion;
		this.puntoVacunacion = puntoVacunacion;
		this.planDeVacunacion = planDeVacunacion;
		this.oficinaRegional = oficinaRegional;
		this.utilizada = utilizada;
	}
	/**
	 * @return the idVacuna
	 */
	public long getIdVacuna() {
		return idVacuna;
	}
	/**
	 * @return the condicionPreservacion
	 */
	public String getCondicionPreservacion() {
		return condicionPreservacion;
	}
	/**
	 * @return the puntoVacunacion
	 */
	public long getPuntoVacunacion() {
		return puntoVacunacion;
	}
	/**
	 * @return the planDeVacunacion
	 */
	public long getPlanDeVacunacion() {
		return planDeVacunacion;
	}
	/**
	 * @return the oficinaRegional
	 */
	public long getOficinaRegional() {
		return oficinaRegional;
	}
	/**
	 * @return the utilizada
	 */
	public boolean isUtilizada() {
		return utilizada;
	}
	/**
	 * @param idVacuna the idVacuna to set
	 */
	public void setIdVacuna(long idVacuna) {
		this.idVacuna = idVacuna;
	}
	/**
	 * @param condicionPreservacion the condicionPreservacion to set
	 */
	public void setCondicionPreservacion(String condicionPreservacion) {
		this.condicionPreservacion = condicionPreservacion;
	}
	/**
	 * @param puntoVacunacion the puntoVacunacion to set
	 */
	public void setPuntoVacunacion(long puntoVacunacion) {
		this.puntoVacunacion = puntoVacunacion;
	}
	/**
	 * @param planDeVacunacion the planDeVacunacion to set
	 */
	public void setPlanDeVacunacion(long planDeVacunacion) {
		this.planDeVacunacion = planDeVacunacion;
	}
	/**
	 * @param oficinaRegional the oficinaRegional to set
	 */
	public void setOficinaRegional(long oficinaRegional) {
		this.oficinaRegional = oficinaRegional;
	}
	/**
	 * @param utilizada the utilizada to set
	 */
	public void setUtilizada(boolean utilizada) {
		this.utilizada = utilizada;
	}
	@Override
	public String toString() {
		return "Vacuna [idVacuna=" + idVacuna + ", condicionPreservacion=" + condicionPreservacion
				+ ", puntoVacunacion=" + puntoVacunacion + ", planDeVacunacion=" + planDeVacunacion
				+ ", oficinaRegional=" + oficinaRegional + ", utilizada=" + utilizada + "]";
	}
	
	
}
