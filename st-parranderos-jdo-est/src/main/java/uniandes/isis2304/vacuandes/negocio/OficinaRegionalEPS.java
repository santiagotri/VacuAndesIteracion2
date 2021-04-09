package uniandes.isis2304.vacuandes.negocio;

public class OficinaRegionalEPS implements VOOficinaRegionalEPS{
	
	private String region;
	private String username;
	private int cantidadVacunasActuales;
	private long planDeVacunacion;
	
	/**
	 * @param idOficina
	 * @param region
	 * @param username
	 * @param cantidadVacunasActuales
	 * @param planDeVacunacion
	 */
	public OficinaRegionalEPS(String region, String username, int cantidadVacunasActuales,
			long planDeVacunacion) {
		this.region = region;
		this.username = username;
		this.cantidadVacunasActuales = cantidadVacunasActuales;
		this.planDeVacunacion = planDeVacunacion;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the cantidadVacunasActuales
	 */
	public int getCantidadVacunasActuales() {
		return cantidadVacunasActuales;
	}

	/**
	 * @return the planDeVacunacion
	 */
	public long getPlanDeVacunacion() {
		return planDeVacunacion;
	}


	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @param cantidadVacunasActuales the cantidadVacunasActuales to set
	 */
	public void setCantidadVacunasActuales(int cantidadVacunasActuales) {
		this.cantidadVacunasActuales = cantidadVacunasActuales;
	}

	/**
	 * @param planDeVacunacion the planDeVacunacion to set
	 */
	public void setPlanDeVacunacion(long planDeVacunacion) {
		this.planDeVacunacion = planDeVacunacion;
	}

	@Override
	public String toString() {
		return "OficinaRegionalEPS [region=" + region + ", username=" + username + ", cantidadVacunasActuales="
				+ cantidadVacunasActuales + ", planDeVacunacion=" + planDeVacunacion + "]";
	}
	
	
	
	
	
}
