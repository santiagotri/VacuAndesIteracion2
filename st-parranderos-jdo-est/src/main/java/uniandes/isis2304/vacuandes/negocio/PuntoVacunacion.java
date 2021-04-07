package uniandes.isis2304.vacuandes.negocio;

public class PuntoVacunacion implements VOPuntoVacunacion{

	private long idPuntoVacunacion;
	private String localizacion;
	private int capacidadAtencionSimultanea;
	private int capacidadAtencionTotalDiaria;
	private String infraestructuraParaDosis;
	private int cantidadVacunasEnviables;
	private int cantidadVacunasActuales;
	private String tipoPuntoVacunacion;
	private String administrador;
	
	
	
	/**
	 * @param idPuntoVacunacion
	 * @param localizacion
	 * @param capacidadAtencionSimultanea
	 * @param capacidadAtencionTotalDiaria
	 * @param infraestructuraParaDosis
	 * @param cantidadVacunasEnviables
	 * @param cantidadVacunasActuales
	 * @param tipoPuntoVacunacion
	 * @param administrador
	 */
	public PuntoVacunacion(long idPuntoVacunacion, String localizacion, int capacidadAtencionSimultanea,
			int capacidadAtencionTotalDiaria, String infraestructuraParaDosis, int cantidadVacunasEnviables,
			int cantidadVacunasActuales, String tipoPuntoVacunacion, String administrador) {
		
		this.idPuntoVacunacion = idPuntoVacunacion;
		this.localizacion = localizacion;
		this.capacidadAtencionSimultanea = capacidadAtencionSimultanea;
		this.capacidadAtencionTotalDiaria = capacidadAtencionTotalDiaria;
		this.infraestructuraParaDosis = infraestructuraParaDosis;
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
	 * @return the infraestructuraParaDosis
	 */
	public String getInfraestructuraParaDosis() {
		return infraestructuraParaDosis;
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
	public String getAdministrador() {
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
	 * @param infraestructuraParaDosis the infraestructuraParaDosis to set
	 */
	public void setInfraestructuraParaDosis(String infraestructuraParaDosis) {
		this.infraestructuraParaDosis = infraestructuraParaDosis;
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
	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}
	@Override
	public String toString() {
		return "PuntoVacunacion [idPuntoVacunacion=" + idPuntoVacunacion + ", localizacion=" + localizacion
				+ ", capacidadAtencionSimultanea=" + capacidadAtencionSimultanea + ", capacidadAtencionTotalDiaria="
				+ capacidadAtencionTotalDiaria + ", infraestructuraParaDosis=" + infraestructuraParaDosis
				+ ", cantidadVacunasEnviables=" + cantidadVacunasEnviables + ", cantidadVacunasActuales="
				+ cantidadVacunasActuales + ", tipoPuntoVacunacion=" + tipoPuntoVacunacion + ", administrador="
				+ administrador + "]";
	}
	
	
	
}
