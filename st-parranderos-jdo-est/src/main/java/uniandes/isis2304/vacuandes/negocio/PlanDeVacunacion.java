package uniandes.isis2304.vacuandes.negocio;

import java.sql.Date;

public class PlanDeVacunacion implements VOPlanDeVacunacion {

	private long idPlandDeVacunacion; 
	private String nombre; 
	private String descripcion; 
	private Date fechaActualizacion;
	
	public PlanDeVacunacion() {
		this.idPlandDeVacunacion = 0;
		this.nombre = "";
		this.descripcion = "";
		this.fechaActualizacion = new Date(0); 
	}
	
	public PlanDeVacunacion(long idPlandDeVacunacion, String nombre, String descripcion, Date fechaActualizacion)
	{
		this.idPlandDeVacunacion = idPlandDeVacunacion;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaActualizacion = fechaActualizacion; 
	}
	
	@Override
	public long getIdPlanDeVacunacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getFechaActualizacion() {
		// TODO Auto-generated method stub
		return null;
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

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	@Override
	public String toString() {
		return "PlanDeVacunacion [idPlandDeVacunacion=" + idPlandDeVacunacion + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", fechaActualizacion=" + fechaActualizacion + "]";
	}
	
}
