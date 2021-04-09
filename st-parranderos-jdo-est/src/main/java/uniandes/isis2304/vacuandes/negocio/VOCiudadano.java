package uniandes.isis2304.vacuandes.negocio;

public interface VOCiudadano {
	
	public long getCedula() ;
	public String getNombre_Completo() ;
	public String getEstado_vacunacion();
	public String getRegion();
	public int getDesea_ser_vacunado(); 
	public long getPlan_De_Vacunacion() ;
	public long getPunto_Vacunacion() ;
	public long getOficina_Regional_Asignada() ;
	@Override
	public String toString();
	

}
