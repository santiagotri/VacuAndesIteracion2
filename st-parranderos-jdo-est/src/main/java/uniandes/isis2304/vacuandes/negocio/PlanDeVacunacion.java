package uniandes.isis2304.vacuandes.negocio;

import java.sql.Date;

public class PlanDeVacunacion implements VOPlanDeVacunacion {

	private long idPlandDeVacunacion; 
	private String nombre; 
	private String descripcion; 
	private Date fecha_Actualizacion;
	
	public PlanDeVacunacion() {
		this.idPlandDeVacunacion = 0;
		this.nombre = "";
		this.descripcion = "";
		this.fecha_Actualizacion = new Date(0); 
	}
	
	public PlanDeVacunacion(long idPlandDeVacunacion, String nombre, String descripcion, Date fecha_Actualizacion)
	{
		this.idPlandDeVacunacion = idPlandDeVacunacion;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha_Actualizacion = fecha_Actualizacion; 
	}
	
	@Override
	public long getIdPlanDeVacunacion() {
		// TODO Auto-generated method stub
		return idPlandDeVacunacion;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return descripcion;
	}

	@Override
	public Date getFecha_Actualizacion() {
		// TODO Auto-generated method stub
		return fecha_Actualizacion;
	}
	
	public long getIdPlandDeVacunacion() {
		return idPlandDeVacunacion;
	}

	public void setIdPlandDeVacunacion(long idPlandDeVacunacion) {
		this.idPlandDeVacunacion = idPlandDeVacunacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setFecha_Actualizacion(Date fecha_Actualizacion) {
		this.fecha_Actualizacion = fecha_Actualizacion;
	}

	@Override
	public String toString() {
		return "PlanDeVacunacion [idPlandDeVacunacion=" + idPlandDeVacunacion + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", fecha_Actualizacion=" + fecha_Actualizacion + "]";
	}
	
}
