package uniandes.isis2304.vacuandes.negocio;

public class PuntoVacunacion implements VOPuntoVacunacion{

	private long idPuntoVacunacion;
	private String localizacion;
	private int capacidadAtencionSimultanea;
	private int capacidadAtencionTotalDiaria;
	private String infraestructuraParaDoosis;
	private int cantidadVacunasEnviables;
	private int cantidadVacunasActuales;
	private String tipoPuntoVacunacion;
	private long administrador;
	
	
	
	/**
	 * @param idPuntoVacunacion
	 * @param localizacion
	 * @param capacidadAtencionSimultanea
	 * @param capacidadAtencionTotalDiaria
	 * @param infraestructuraParaDoosis
	 * @param cantidadVacunasEnviables
	 * @param cantidadVacunasActuales
	 * @param tipoPuntoVacunacion
	 * @param administrador
	 */
	public PuntoVacunacion(long idPuntoVacunacion, String localizacion, int capacidadAtencionSimultanea,
			int capacidadAtencionTotalDiaria, String infraestructuraParaDoosis, int cantidadVacunasEnviables,
			int cantidadVacunasActuales, String tipoPuntoVacunacion, long administrador) {
		
		this.idPuntoVacunacion = idPuntoVacunacion;
		this.localizacion = localizacion;
		this.capacidadAtencionSimultanea = capacidadAtencionSimultanea;
		this.capacidadAtencionTotalDiaria = capacidadAtencionTotalDiaria;
		this.infraestructuraParaDoosis = infraestructuraParaDoosis;
		this.cantidadVacunasEnviables = cantidadVacunasEnviables;
		this.cantidadVacunasActuales = cantidadVacunasActuales;
		this.tipoPuntoVacunacion = tipoPuntoVacunacion;
		this.administrador = administrador;
	}
	
	
	/**
	 * @return the idPuntoVacunacion
	 */
	public long getIdPuntoVacunacion() {
		return idPuntoVacunacion;
	}
	/**
	 * @return the localizacion
	 */
	public String getLocalizacion() {
		return localizacion;
	}
	/**
	 * @return the capacidadAtencionSimultanea
	 */
	public int getCapacidadAtencionSimultanea() {
		return capacidadAtencionSimultanea;
	}
	/**
	 * @return the capacidadAtencionTotalDiaria
	 */
	public int getCapacidadAtencionTotalDiaria() {
		return capacidadAtencionTotalDiaria;
	}
	/**
	 * @return the infraestructuraParaDoosis
	 */
	public String getInfraestructuraParaDoosis() {
		return infraestructuraParaDoosis;
	}
	/**
	 * @return the cantidadVacunasEnviables
	 */
	public int getCantidadVacunasEnviables() {
		return cantidadVacunasEnviables;
	}
	/**
	 * @return the cantidadVacunasActuales
	 */
	public int getCantidadVacunasActuales() {
		return cantidadVacunasActuales;
	}
	/**
	 * @return the tipoPuntoVacunacion
	 */
	public String getTipoPuntoVacunacion() {
		return tipoPuntoVacunacion;
	}
	/**
	 * @return the administrador
	 */
	public long getAdministrador() {
		return administrador;
	}
	/**
	 * @param idPuntoVacunacion the idPuntoVacunacion to set
	 */
	public void setIdPuntoVacunacion(long idPuntoVacunacion) {
		this.idPuntoVacunacion = idPuntoVacunacion;
	}
	/**
	 * @param localizacion the localizacion to set
	 */
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	/**
	 * @param capacidadAtencionSimultanea the capacidadAtencionSimultanea to set
	 */
	public void setCapacidadAtencionSimultanea(int capacidadAtencionSimultanea) {
		this.capacidadAtencionSimultanea = capacidadAtencionSimultanea;
	}
	/**
	 * @param capacidadAtencionTotalDiaria the capacidadAtencionTotalDiaria to set
	 */
	public void setCapacidadAtencionTotalDiaria(int capacidadAtencionTotalDiaria) {
		this.capacidadAtencionTotalDiaria = capacidadAtencionTotalDiaria;
	}
	/**
	 * @param infraestructuraParaDoosis the infraestructuraParaDoosis to set
	 */
	public void setInfraestructuraParaDoosis(String infraestructuraParaDoosis) {
		this.infraestructuraParaDoosis = infraestructuraParaDoosis;
	}
	/**
	 * @param cantidadVacunasEnviables the cantidadVacunasEnviables to set
	 */
	public void setCantidadVacunasEnviables(int cantidadVacunasEnviables) {
		this.cantidadVacunasEnviables = cantidadVacunasEnviables;
	}
	/**
	 * @param cantidadVacunasActuales the cantidadVacunasActuales to set
	 */
	public void setCantidadVacunasActuales(int cantidadVacunasActuales) {
		this.cantidadVacunasActuales = cantidadVacunasActuales;
	}
	/**
	 * @param tipoPuntoVacunacion the tipoPuntoVacunacion to set
	 */
	public void setTipoPuntoVacunacion(String tipoPuntoVacunacion) {
		this.tipoPuntoVacunacion = tipoPuntoVacunacion;
	}
	/**
	 * @param administrador the administrador to set
	 */
	public void setAdministrador(long administrador) {
		this.administrador = administrador;
	}
	@Override
	public String toString() {
		return "PuntoVacunacion [idPuntoVacunacion=" + idPuntoVacunacion + ", localizacion=" + localizacion
				+ ", capacidadAtencionSimultanea=" + capacidadAtencionSimultanea + ", capacidadAtencionTotalDiaria="
				+ capacidadAtencionTotalDiaria + ", infraestructuraParaDoosis=" + infraestructuraParaDoosis
				+ ", cantidadVacunasEnviables=" + cantidadVacunasEnviables + ", cantidadVacunasActuales="
				+ cantidadVacunasActuales + ", tipoPuntoVacunacion=" + tipoPuntoVacunacion + ", administrador="
				+ administrador + "]";
	}
	
	
	
}
