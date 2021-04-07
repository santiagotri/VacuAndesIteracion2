package uniandes.isis2304.vacuandes.negocio;

public class Ciudadano implements VOCiudadano{
	
	private long cedula; 
	private String nombreCompleto;
	private String deseaSerVacunado;
	private long planDeVacunacion;
	private long puntoVacunacion;
	private long oficinaRegionalAsignada;
	
	
	
	
	/**
	 * @param cedula
	 * @param nombreCompleto
	 * @param deseaSerVacunado
	 * @param planDeVacunacion
	 * @param puntoVacunacion
	 * @param oficinaRegionalAsignada
	 */
	public Ciudadano(long cedula, String nombreCompleto, String deseaSerVacunado, long planDeVacunacion,
			long puntoVacunacion, long oficinaRegionalAsignada) {
		this.cedula = cedula;
		this.nombreCompleto = nombreCompleto;
		this.deseaSerVacunado = deseaSerVacunado;
		this.planDeVacunacion = planDeVacunacion;
		this.puntoVacunacion = puntoVacunacion;
		this.oficinaRegionalAsignada = oficinaRegionalAsignada;
	}
	/**
	 * @return the cedula
	 */
	public long getCedula() {
		return cedula;
	}
	/**
	 * @return the nombreCompleto
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	/**
	 * @return the deseaSerVacunado
	 */
	public String getDeseaSerVacunado() {
		return deseaSerVacunado;
	}
	/**
	 * @return the planDeVacunacion
	 */
	public long getPlanDeVacunacion() {
		return planDeVacunacion;
	}
	/**
	 * @return the puntoVacunacion
	 */
	public long getPuntoVacunacion() {
		return puntoVacunacion;
	}
	/**
	 * @return the oficinaRegionalAsignada
	 */
	public long getOficinaRegionalAsignada() {
		return oficinaRegionalAsignada;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(long cedula) {
		cedula = cedula;
	}
	/**
	 * @param nombreCompleto the nombreCompleto to set
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	/**
	 * @param deseaSerVacunado the deseaSerVacunado to set
	 */
	public void setDeseaSerVacunado(String deseaSerVacunado) {
		this.deseaSerVacunado = deseaSerVacunado;
	}
	/**
	 * @param planDeVacunacion the planDeVacunacion to set
	 */
	public void setPlanDeVacunacion(long planDeVacunacion) {
		this.planDeVacunacion = planDeVacunacion;
	}
	/**
	 * @param puntoVacunacion the puntoVacunacion to set
	 */
	public void setPuntoVacunacion(long puntoVacunacion) {
		this.puntoVacunacion = puntoVacunacion;
	}
	/**
	 * @param oficinaRegionalAsignada the oficinaRegionalAsignada to set
	 */
	public void setOficinaRegionalAsignada(long oficinaRegionalAsignada) {
		this.oficinaRegionalAsignada = oficinaRegionalAsignada;
	}
	
	
	@Override
	public String toString() {
		return "Ciudadano [Cedula=" + cedula + ", nombreCompleto=" + nombreCompleto + ", deseaSerVacunado="
				+ deseaSerVacunado + ", planDeVacunacion=" + planDeVacunacion + ", puntoVacunacion=" + puntoVacunacion
				+ ", oficinaRegionalAsignada=" + oficinaRegionalAsignada + "]";
	}
	
	
	
	
	
}
