package uniandes.isis2304.vacuandes.negocio;

public class Trabajador implements VOTrabajador{
	
	private long cedula;
	private String trabajo;
	private int administrador_Vacuandes;
	
	
	public Trabajador() {
		this.cedula = 0;
		this.trabajo = "";
		this.administrador_Vacuandes = 0;
	}
	
	/**
	 * @param cedula
	 * @param trabajo
	 * @param administrador_Vacuandes
	 */
	public Trabajador(long cedula, String trabajo, int administrador_Vacuandes) {
		this.cedula = cedula;
		this.trabajo = trabajo;
		this.administrador_Vacuandes = administrador_Vacuandes;
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
	 * @return the administrador_Vacuandes
	 */
	public int getAdministrador_Vacuandes() {
		return administrador_Vacuandes;
	}

	/**
	 * @param administrador_Vacuandes the administrador_Vacuandes to set
	 */
	public void setAdministrador_Vacuandes(int administrador_Vacuandes) {
		this.administrador_Vacuandes = administrador_Vacuandes;
	}

	@Override
	public String toString() {
		return "Trabajador [cedula=" + cedula + ", trabajo=" + trabajo + ", administrador_Vacuandes="
				+ administrador_Vacuandes + "]";
	}
	
	
}
