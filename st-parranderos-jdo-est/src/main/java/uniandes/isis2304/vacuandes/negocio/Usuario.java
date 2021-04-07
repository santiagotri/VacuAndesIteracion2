package uniandes.isis2304.vacuandes.negocio;

public class Usuario implements VOUsuario {
	
	private String username;
	private String contrasena;
	private String correo; 
	private long planDeVacunacion;
	private long ciudadano;
	
	
	/**
	 * @param username
	 * @param contrasena
	 * @param correo
	 * @param planDeVacunacion
	 * @param ciudadano
	 */
	public Usuario(String username, String contrasena, String correo, long planDeVacunacion, long ciudadano) {
		super();
		this.username = username;
		this.contrasena = contrasena;
		this.correo = correo;
		this.planDeVacunacion = planDeVacunacion;
		this.ciudadano = ciudadano;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * @return the planDeVacunacion
	 */
	public long getPlanDeVacunacion() {
		return planDeVacunacion;
	}
	/**
	 * @return the ciudadano
	 */
	public long getCiudadano() {
		return ciudadano;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * @param planDeVacunacion the planDeVacunacion to set
	 */
	public void setPlanDeVacunacion(long planDeVacunacion) {
		this.planDeVacunacion = planDeVacunacion;
	}
	/**
	 * @param ciudadano the ciudadano to set
	 */
	public void setCiudadano(long ciudadano) {
		this.ciudadano = ciudadano;
	}
	@Override
	public String toString() {
		return "Usuario [username=" + username + ", contrasena=" + contrasena + ", correo=" + correo
				+ ", planDeVacunacion=" + planDeVacunacion + ", ciudadano=" + ciudadano + "]";
	}
	

}
