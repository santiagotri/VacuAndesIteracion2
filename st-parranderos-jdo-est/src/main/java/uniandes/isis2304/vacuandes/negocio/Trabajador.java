package uniandes.isis2304.vacuandes.negocio;

public class Trabajador implements VOTrabajador{
	
	private long cedula;
	private String trabajo;
	private boolean administradorVacuandes;
	
	/**
	 * @param cedula
	 * @param trabajo
	 * @param administradorVacuandes
	 */
	public Trabajador(long cedula, String trabajo, boolean administradorVacuandes) {
		this.cedula = cedula;
		this.trabajo = trabajo;
		this.administradorVacuandes = administradorVacuandes;
	}
	
	/**
	 * @return the cedula
	 */
	public long getCedula() {
		return cedula;
	}
	/**
	 * @return the trabajo
	 */
	public String getTrabajo() {
		return trabajo;
	}
	/**
	 * @return the administradorVacuandes
	 */
	public boolean isAdministradorVacuandes() {
		return administradorVacuandes;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}
	/**
	 * @param trabajo the trabajo to set
	 */
	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}
	/**
	 * @param administradorVacuandes the administradorVacuandes to set
	 */
	public void setAdministradorVacuandes(boolean administradorVacuandes) {
		this.administradorVacuandes = administradorVacuandes;
	}
	@Override
	public String toString() {
		return "Trabajador [cedula=" + cedula + ", trabajo=" + trabajo + ", administradorVacuandes="
				+ administradorVacuandes + "]";
	}
	
	
}
