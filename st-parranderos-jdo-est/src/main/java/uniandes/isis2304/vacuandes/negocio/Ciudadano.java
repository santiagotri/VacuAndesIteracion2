package uniandes.isis2304.vacuandes.negocio;

public class Ciudadano implements VOCiudadano{
	
	private long cedula; 
	private String nombre_Completo;
	private String desea_Ser_Vacunado;
	private long plan_De_Vacunacion;
	private long punto_Vacunacion;
	private long oficina_Regional_Asignada;
	
	public Ciudadano() {
		this.cedula = 0;
		this.nombre_Completo = "";
		this.desea_Ser_Vacunado = "";
		this.plan_De_Vacunacion = 0;
		this.punto_Vacunacion = 0;
		this.oficina_Regional_Asignada = 0;
	}
	
	
	/**
	 * @param cedula
	 * @param nombre_Completo
	 * @param desea_Ser_Vacunado
	 * @param plan_De_Vacunacion
	 * @param punto_Vacunacion
	 * @param oficina_Regional_Asignada
	 */
	public Ciudadano(long cedula, String nombre_Completo, String desea_Ser_Vacunado, long plan_De_Vacunacion,
			long punto_Vacunacion, long oficina_Regional_Asignada) {
		this.cedula = cedula;
		this.nombre_Completo = nombre_Completo;
		this.desea_Ser_Vacunado = desea_Ser_Vacunado;
		this.plan_De_Vacunacion = plan_De_Vacunacion;
		this.punto_Vacunacion = punto_Vacunacion;
		this.oficina_Regional_Asignada = oficina_Regional_Asignada;
	}
	/**
	 * @return the cedula
	 */
	public long getCedula() {
		return cedula;
	}
	/**
	 * @return the nombre_Completo
	 */
	public String getNombre_Completo() {
		return nombre_Completo;
	}
	/**
	 * @return the desea_Ser_Vacunado
	 */
	public String getDesea_Ser_Vacunado() {
		return desea_Ser_Vacunado;
	}
	/**
	 * @return the plan_De_Vacunacion
	 */
	public long getPlan_De_Vacunacion() {
		return plan_De_Vacunacion;
	}
	/**
	 * @return the punto_Vacunacion
	 */
	public long getPunto_Vacunacion() {
		return punto_Vacunacion;
	}
	/**
	 * @return the oficina_Regional_Asignada
	 */
	public long getOficina_Regional_Asignada() {
		return oficina_Regional_Asignada;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(long cedula) {
		cedula = cedula;
	}
	/**
	 * @param nombre_Completo the nombre_Completo to set
	 */
	public void setNombre_Completo(String nombre_Completo) {
		this.nombre_Completo = nombre_Completo;
	}
	/**
	 * @param desea_Ser_Vacunado the desea_Ser_Vacunado to set
	 */
	public void setDesea_Ser_Vacunado(String desea_Ser_Vacunado) {
		this.desea_Ser_Vacunado = desea_Ser_Vacunado;
	}
	/**
	 * @param plan_De_Vacunacion the plan_De_Vacunacion to set
	 */
	public void setPlan_De_Vacunacion(long plan_De_Vacunacion) {
		this.plan_De_Vacunacion = plan_De_Vacunacion;
	}
	/**
	 * @param punto_Vacunacion the punto_Vacunacion to set
	 */
	public void setPunto_Vacunacion(long punto_Vacunacion) {
		this.punto_Vacunacion = punto_Vacunacion;
	}
	/**
	 * @param oficina_Regional_Asignada the oficina_Regional_Asignada to set
	 */
	public void setOficina_Regional_Asignada(long oficina_Regional_Asignada) {
		this.oficina_Regional_Asignada = oficina_Regional_Asignada;
	}
	
	
	@Override
	public String toString() {
		return "Ciudadano [Cedula=" + cedula + ", nombre_Completo=" + nombre_Completo + ", desea_Ser_Vacunado="
				+ desea_Ser_Vacunado + ", plan_De_Vacunacion=" + plan_De_Vacunacion + ", punto_Vacunacion=" + punto_Vacunacion
				+ ", oficina_Regional_Asignada=" + oficina_Regional_Asignada + "]";
	}
	
	
	
	
	
}
