package uniandes.isis2304.vacuandes.negocio;

public interface VOCiudadano {
	
	public long getCedula() ;
	public String getNombre_Completo() ;
	public String getDesea_Ser_Vacunado();
	public long getPlan_De_Vacunacion() ;
	public long getPunto_Vacunacion() ;
	public long getOficina_Regional_Asignada() ;
	@Override
	public String toString();
	

}
