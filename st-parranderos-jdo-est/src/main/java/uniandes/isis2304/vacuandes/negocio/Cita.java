package uniandes.isis2304.vacuandes.negocio;

import java.sql.Date;

public class Cita implements VOCita {
	
	private long idCita;
	private Date fecha;
	private long ciudadano;
	private long puntoVacunacion;
	private long vacuna;

	/**
	 * @param idCita
	 * @param fecha
	 * @param ciudadano
	 * @param puntoVacunacion
	 * @param vacuna
	 */
	public Cita(long idCita, Date fecha, long ciudadano, long puntoVacunacion, long vacuna) {
		this.idCita = idCita;
		this.fecha = fecha;
		this.ciudadano = ciudadano;
		this.puntoVacunacion = puntoVacunacion;
		this.vacuna = vacuna;
	}
	
	/**
	 * @return the idCita
	 */
	public long getIdCita() {
		return idCita;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @return the ciudadano
	 */
	public long getCiudadano() {
		return ciudadano;
	}
	/**
	 * @return the puntoVacunacion
	 */
	public long getPuntoVacunacion() {
		return puntoVacunacion;
	}
	/**
	 * @return the vacuna
	 */
	public long getVacuna() {
		return vacuna;
	}
	/**
	 * @param idCita the idCita to set
	 */
	public void setIdCita(long idCita) {
		this.idCita = idCita;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @param ciudadano the ciudadano to set
	 */
	public void setCiudadano(long ciudadano) {
		this.ciudadano = ciudadano;
	}
	/**
	 * @param puntoVacunacion the puntoVacunacion to set
	 */
	public void setPuntoVacunacion(long puntoVacunacion) {
		this.puntoVacunacion = puntoVacunacion;
	}
	/**
	 * @param vacuna the vacuna to set
	 */
	public void setVacuna(long vacuna) {
		this.vacuna = vacuna;
	}
	@Override
	public String toString() {
		return "Cita [idCita=" + idCita + ", fecha=" + fecha + ", ciudadano=" + ciudadano + ", puntoVacunacion="
				+ puntoVacunacion + ", vacuna=" + vacuna + "]";
	}
	
	
}
