package uniandes.isis2304.vacuandes.negocio;

public interface VOCiudadano {
	
	public long getCedula() ;
	public String getNombreCompleto() ;
	public String getDeseaSerVacunado();
	public long getPlanDeVacunacion() ;
	public long getPuntoVacunacion() ;
	public long getOficinaRegionalAsignada() ;
	@Override
	public String toString();
	

}
