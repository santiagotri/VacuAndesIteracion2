package uniandes.isis2304.vacuandes.negocio;

public class PuntoVacunacion implements VOPuntoVacunacion{

	private long id_Punto_Vacunacion;
	private String localizacion;
	private int capacidad_Atencion_Simultanea;
	private int capacidad_Atencion_Total_Diaria;
	private String infraestructura_Para_Dosis;
	private int cantidad_Vacunas_Enviables;
	private int cantidad_Vacunas_Actuales;
	private String tipo_Punto_Vacunacion;
	private String administrador;
	
	
	public PuntoVacunacion() {
		
		this.id_Punto_Vacunacion = 0;
		this.localizacion = "";
		this.capacidad_Atencion_Simultanea = 0;
		this.capacidad_Atencion_Total_Diaria = 0;
		this.infraestructura_Para_Dosis = "";
		this.cantidad_Vacunas_Enviables = 0;
		this.cantidad_Vacunas_Actuales = 0;
		this.tipo_Punto_Vacunacion = "";
		this.administrador = "";
	}
	
	/**
	 * @param id_Punto_Vacunacion
	 * @param localizacion
	 * @param capacidad_Atencion_Simultanea
	 * @param capacidad_Atencion_Total_Diaria
	 * @param infraestructura_Para_Dosis
	 * @param cantidad_Vacunas_Enviables
	 * @param cantidad_Vacunas_Actuales
	 * @param tipo_Punto_Vacunacion
	 * @param administrador
	 */
	public PuntoVacunacion(long id_Punto_Vacunacion, String localizacion, int capacidad_Atencion_Simultanea,
			int capacidad_Atencion_Total_Diaria, String infraestructura_Para_Dosis, int cantidad_Vacunas_Enviables,
			int cantidad_Vacunas_Actuales, String tipo_Punto_Vacunacion, String administrador) {
		
		this.id_Punto_Vacunacion = id_Punto_Vacunacion;
		this.localizacion = localizacion;
		this.capacidad_Atencion_Simultanea = capacidad_Atencion_Simultanea;
		this.capacidad_Atencion_Total_Diaria = capacidad_Atencion_Total_Diaria;
		this.infraestructura_Para_Dosis = infraestructura_Para_Dosis;
		this.cantidad_Vacunas_Enviables = cantidad_Vacunas_Enviables;
		this.cantidad_Vacunas_Actuales = cantidad_Vacunas_Actuales;
		this.tipo_Punto_Vacunacion = tipo_Punto_Vacunacion;
		this.administrador = administrador;
	}
	
	
	/**
	 * @return the id_Punto_Vacunacion
	 */
	public long getId_Punto_Vacunacion() {
		return id_Punto_Vacunacion;
	}
	/**
	 * @return the localizacion
	 */
	public String getLocalizacion() {
		return localizacion;
	}
	/**
	 * @return the capacidad_Atencion_Simultanea
	 */
	public int getCapacidad_Atencion_Simultanea() {
		return capacidad_Atencion_Simultanea;
	}
	/**
	 * @return the capacidad_Atencion_Total_Diaria
	 */
	public int getCapacidad_Atencion_Total_Diaria() {
		return capacidad_Atencion_Total_Diaria;
	}
	/**
	 * @return the infraestructura_Para_Dosis
	 */
	public String getInfraestructura_Para_Dosis() {
		return infraestructura_Para_Dosis;
	}
	/**
	 * @return the cantidad_Vacunas_Enviables
	 */
	public int getCantidad_Vacunas_Enviables() {
		return cantidad_Vacunas_Enviables;
	}
	/**
	 * @return the cantidad_Vacunas_Actuales
	 */
	public int getCantidad_Vacunas_Actuales() {
		return cantidad_Vacunas_Actuales;
	}
	/**
	 * @return the tipo_Punto_Vacunacion
	 */
	public String getTipo_Punto_Vacunacion() {
		return tipo_Punto_Vacunacion;
	}
	/**
	 * @return the administrador
	 */
	public String getAdministrador() {
		return administrador;
	}
	/**
	 * @param id_Punto_Vacunacion the id_Punto_Vacunacion to set
	 */
	public void setId_Punto_Vacunacion(long id_Punto_Vacunacion) {
		this.id_Punto_Vacunacion = id_Punto_Vacunacion;
	}
	/**
	 * @param localizacion the localizacion to set
	 */
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	/**
	 * @param capacidad_Atencion_Simultanea the capacidad_Atencion_Simultanea to set
	 */
	public void setCapacidad_Atencion_Simultanea(int capacidad_Atencion_Simultanea) {
		this.capacidad_Atencion_Simultanea = capacidad_Atencion_Simultanea;
	}
	/**
	 * @param capacidad_Atencion_Total_Diaria the capacidad_Atencion_Total_Diaria to set
	 */
	public void setCapacidad_Atencion_Total_Diaria(int capacidad_Atencion_Total_Diaria) {
		this.capacidad_Atencion_Total_Diaria = capacidad_Atencion_Total_Diaria;
	}
	/**
	 * @param infraestructura_Para_Dosis the infraestructura_Para_Dosis to set
	 */
	public void setInfraestructura_Para_Dosis(String infraestructura_Para_Dosis) {
		this.infraestructura_Para_Dosis = infraestructura_Para_Dosis;
	}
	/**
	 * @param cantidad_Vacunas_Enviables the cantidad_Vacunas_Enviables to set
	 */
	public void setCantidad_Vacunas_Enviables(int cantidad_Vacunas_Enviables) {
		this.cantidad_Vacunas_Enviables = cantidad_Vacunas_Enviables;
	}
	/**
	 * @param cantidad_Vacunas_Actuales the cantidad_Vacunas_Actuales to set
	 */
	public void setCantidad_Vacunas_Actuales(int cantidad_Vacunas_Actuales) {
		this.cantidad_Vacunas_Actuales = cantidad_Vacunas_Actuales;
	}
	/**
	 * @param tipo_Punto_Vacunacion the tipo_Punto_Vacunacion to set
	 */
	public void setTipo_Punto_Vacunacion(String tipo_Punto_Vacunacion) {
		this.tipo_Punto_Vacunacion = tipo_Punto_Vacunacion;
	}
	/**
	 * @param administrador the administrador to set
	 */
	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}
	@Override
	public String toString() {
		return "PuntoVacunacion [id_Punto_Vacunacion=" + id_Punto_Vacunacion + ", localizacion=" + localizacion
				+ ", capacidad_Atencion_Simultanea=" + capacidad_Atencion_Simultanea + ", capacidad_Atencion_Total_Diaria="
				+ capacidad_Atencion_Total_Diaria + ", infraestructura_Para_Dosis=" + infraestructura_Para_Dosis
				+ ", cantidad_Vacunas_Enviables=" + cantidad_Vacunas_Enviables + ", cantidad_Vacunas_Actuales="
				+ cantidad_Vacunas_Actuales + ", tipo_Punto_Vacunacion=" + tipo_Punto_Vacunacion + ", administrador="
				+ administrador + "]";
	}
	
	
	
}
