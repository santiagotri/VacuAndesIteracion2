package uniandes.isis2304.vacuandes.negocio;

public interface VOUsuario {
	/**
	 * @return the username
	 */
	public String getUsername();
	/**
	 * @return the contrasena
	 */
	public String getContrasena() ;
	/**
	 * @return the correo
	 */
	public String getCorreo() ;
	/**
	 * @return the planDeVacunacion
	 */
	public long getPlanDeVacunacion();
	/**
	 * @return the ciudadano
	 */
	public long getCiudadano();
	
	@Override
	public String toString();
}
