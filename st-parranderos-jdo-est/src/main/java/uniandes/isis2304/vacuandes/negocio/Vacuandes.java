package uniandes.isis2304.vacuandes.negocio;

import java.sql.Date;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import org.apache.log4j.Logger;

import com.google.gson.JsonObject;

import uniandes.isis2304.parranderos.negocio.Bebida;
import uniandes.isis2304.parranderos.negocio.TipoBebida;
import uniandes.isis2304.vacuandes.persistencia.PersistenciaVacuandes;

public class Vacuandes {
	
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Logger para escribir la traza de la ejecución
	 */
	private static Logger log = Logger.getLogger(Vacuandes.class.getName());
	
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia
	 */
	private PersistenciaVacuandes pp;
	
	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * El constructor por defecto
	 */
	public Vacuandes ()
	{
		pp = PersistenciaVacuandes.getInstance ();
	}
	
	/**
	 * El constructor qye recibe los nombres de las tablas en tableConfig
	 * @param tableConfig - Objeto Json con los nombres de las tablas y de la unidad de persistencia
	 */
	public Vacuandes (JsonObject tableConfig)
	{
		pp = PersistenciaVacuandes.getInstance (tableConfig);
	}
	
	/**
	 * Cierra la conexión con la base de datos (Unidad de persistencia)
	 */
	public void cerrarUnidadPersistencia ()
	{
		pp.cerrarUnidadPersistencia ();
	}

	public Usuario verificarInicioDeSesion(String username, String contrasena) {
		//PersistenceManager pm = pmf.getPersistenceManager();
		log.info ("Iniciando sesion para usuario " + username);
		Usuario rta = pp.verificarInicioDeSesion (username, contrasena);
        log.info ("Verificado inicio sesion");
        return rta;
	}
	
	/* ****************************************************************
	 * 			Métodos para manejar CITA
	 *****************************************************************/
	
	public Cita agregarCita(Date fecha, long ciudadano, long punto_vacunacion, long vacuna) {
		log.info ("Creando una nueva cita");
		Cita rta = pp.adicionarCita(fecha, ciudadano,punto_vacunacion, vacuna);
        log.info ("Se creo el cita en el punto: " + punto_vacunacion +" para el ciudadano de cedula: " + ciudadano);
        return rta;
	}
	
	/**
	 * 
	public Cita darCitaPorPuntoDeVacunacionYFecha(Date fecha, long punto_vacunacion) {
		log.info ("Buscando cita en la fecha: " + fecha + " del ciudadano con cedula: " + ciudadano);
		Cita rta = pp.buscarCita(fecha, ciudadano);
        log.info ("Trabajo verificado");
        return rta;
	}
	 */
	
	public long agregarACitaCiudadano(long cedula, long punto_vacunacion) {
		long rta = 0;
		log.info ("Actualizando ciudadano de cedula: " + cedula);
		Ciudadano ciudadano = pp.buscarCiudadano(cedula);
		if(ciudadano!=null)
		{
			rta = pp.actualizarCiudadanoPuntoVacunacion(ciudadano.getCedula(), ciudadano.getNombre_Completo(), ciudadano.getEstado_vacunacion(), ciudadano.getRegion(), ciudadano.getDesea_ser_vacunado(), ciudadano.getPlan_De_Vacunacion(), punto_vacunacion, ciudadano.getOficina_Regional_Asignada()); 
		}
		else 
		{
			return 0; 
		}
        log.info ("Trabajo verificado");
        return rta;
	}
	/* ****************************************************************
	 * 			Métodos para manejar CIUDADANO
	 *****************************************************************/
	
	public Ciudadano agregarCiudadano(long cedula, String nombre_completo, String estado_vacunacion, String region, int desea_ser_vacunado, long plan_de_vacunacion, Long punto_vacunacion, Long oficina_regional_asignada) {
		log.info ("Creando un nuevo ciudadano en VacuAndes de cedula: " + cedula);
		Ciudadano rta = pp.adicionarCiudadano(cedula, nombre_completo,estado_vacunacion, region, desea_ser_vacunado, plan_de_vacunacion, punto_vacunacion, oficina_regional_asignada);
        log.info ("Se creo el ciudadano: " + nombre_completo +" de cedula: " + cedula);
        return rta;
	}
	
	public Ciudadano darCiudadanoPorCedula(long cedula) {
		log.info ("Buscando trabjador de cedula: " + cedula);
		Ciudadano rta = pp.buscarCiudadano(cedula);
        log.info ("Trabajo verificado");
        return rta;
	}
	
	public long agregarACiudadanoPuntoDeVacunacion(long cedula, long punto_vacunacion) {
		long rta = 0;
		log.info ("Actualizando ciudadano de cedula: " + cedula);
		Ciudadano ciudadano = pp.buscarCiudadano(cedula);
		if(ciudadano!=null)
		{
			rta = pp.actualizarCiudadanoPuntoVacunacion(ciudadano.getCedula(), ciudadano.getNombre_Completo(), ciudadano.getEstado_vacunacion(), ciudadano.getRegion(), ciudadano.getDesea_ser_vacunado(), ciudadano.getPlan_De_Vacunacion(), punto_vacunacion, ciudadano.getOficina_Regional_Asignada()); 
		}
		else 
		{
			return 0; 
		}
        log.info ("Trabajo verificado");
        return rta;
	}
	
	
	/* ****************************************************************
	 * 			Métodos para manejar LIST_CONDICIONES_CIUDADANO
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar LIST_CONTRAINDICACIONES_CIUDADANO
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar MINISTERIO_SALUD
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar OFICINA_REGIONAL_EPS
	 *****************************************************************/
	
	public OficinaRegionalEPS agregarOficinaRegional(String region, String adminstrador, int cantidad_vacunas_actuales, long plan_de_vacunacion) {
		log.info ("Registrando una nueva oficina regional");
		OficinaRegionalEPS rta = pp.adicionarOficinaRegional(region, adminstrador,cantidad_vacunas_actuales, plan_de_vacunacion);
        log.info ("Se creo la oficina en la region: " + region +" con el administrador: " + adminstrador);
        return rta;
	}
	
	public List<OficinaRegionalEPS> darTodasLasOficinasRegionalEPS() {
		log.info ("Buscando oficinas regionales existentes");
		List<OficinaRegionalEPS> rta = pp.darTodasLasOficinasRegionalEPS();
        log.info ("Se han encontrado: " + rta.size() +" oficinas regionales");
        return rta;
	}
	
	/* ****************************************************************
	 * 			Métodos para manejar PLAN_DE_VACUNACION
	 *****************************************************************/
	
	
	public List<PlanDeVacunacion> darTodosLosPlanesDeVacunacion() {
		log.info ("Buscando planes de vacunacion existentes");
		List<PlanDeVacunacion> rta = pp.darTodosLosPlanesDeVacunacion();
        log.info ("Se han encontrado: " + rta.size() +" planes de vacunacion");
        return rta;
	}
	
	
	/* ****************************************************************
	 * 			Métodos para manejar PUNTO_VACUNACION
	 *****************************************************************/
	
	public PuntoVacunacion agregarPuntoVacunacion(String localizacion, int capacidad_de_atencion_simultanea, int capacidad_de_atencion_total_diaria, String infraestructura_para_dosis, int cantidad_vacunas_enviables, int cantidad_vacunas_actuales, String tipo_punto_vacunacion, String administrador, long oficina_regional_eps) {
		log.info ("Creando un nuevo punto de vacunacion");
		PuntoVacunacion rta = pp.adicionarPuntoVacunacion(localizacion, capacidad_de_atencion_simultanea,capacidad_de_atencion_total_diaria, infraestructura_para_dosis, cantidad_vacunas_enviables,cantidad_vacunas_actuales,tipo_punto_vacunacion,administrador, oficina_regional_eps);
        log.info ("Se creo el punto de vacunacion en la localizacion: " + localizacion);
        return rta;
	}

	public List<PuntoVacunacion> darTodosLosPuntosVacunacion() {
		log.info ("Buscando puntos de vacunacion existentes");
		List<PuntoVacunacion> rta = pp.darTodosLosPuntosVacunacion();
        log.info ("Se han encontrado: " + rta.size() +" puntos vacunacion");
        return rta;
	}
	
	public List<PuntoVacunacion> darTodosLosPuntosVacunacionDeLaRegion(String region) {
		log.info ("Buscando puntos de vacunacion con la region "+ region);
		List<PuntoVacunacion> rta = pp.darTodosLosPuntosVacunacionDeLaRegion(region);
        log.info ("Se han encontrado: " + rta.size() +" puntos vacunacion de la region" + region);
        return rta;
	}
	
	/* ****************************************************************
	 * 			Métodos para manejar TRABAJADOR
	 *****************************************************************/
	
	public Trabajador darTrabajadorPorCedula(long cedula) {
		log.info ("Buscando trabjador de cedula: " + cedula);
		Trabajador rta = pp.buscarTrabajadorPorCedula(cedula);
        log.info ("Trabajo verificado");
        return rta;
	}
	
	/* ****************************************************************
	 * 			Métodos para manejar USUARIO
	 *****************************************************************/
	
	public Usuario agregarUsuarioVacuandes(String username, String contrasena, String correo, long plan_de_vacunacion, long ciudadano) {
		log.info ("Creando un nuevo usuario en VacuAndes");
		Usuario rta = pp.adicionarUsuario(username, contrasena,correo, plan_de_vacunacion, ciudadano);
        log.info ("Se creo el usuario: " + username +" de cedula: " + ciudadano);
        return rta;
	}
	
	/* ****************************************************************
	 * 			Métodos para manejar VACUNA
	 *****************************************************************/
	
	
	/* ****************************************************************
	 * 			Métodos para manejar CONDICION
	 *****************************************************************/
	
	public Condicion agregarCondicion(String condiciones, int etapa) {
		log.info ("Creando una nueva condicion");
		Condicion rta = pp.adicionarCondicion(condiciones, etapa);
        log.info ("Se creo la condicion: " + condiciones +" de etapa numero:" + etapa);
        return rta;
	}
	
	public Condicion getCondicion(String condiciones)
	{
		log.info ("Buscando una condicion");
		Condicion rta = pp.getCondicionPorCondiciones(condiciones);
        if(rta != null)log.info ("Se encontró la condición: " + condiciones);
        else {log.error("No se ha encontrado la condicion " + condiciones);}
        return rta;
	}
	
	public long updateCondicion(String condiciones, int etapa)
	{
		log.info ("Actualizando una condicion");
		long rta = pp.updateCondicionPorCondiciones(condiciones, etapa);
        log.info ("Se actualizo la condicion" + condiciones + " a etapa " + etapa);
        return rta;
	}
	
	public Condicion registrarCondicionesDePriorizacion(String condiciones, int etapa)
	{
		Condicion rta = getCondicion(condiciones);
		if(rta != null)
		{
			updateCondicion(condiciones, etapa); 
		}
		else
		{
			rta = agregarCondicion(condiciones, etapa); 
		}
		
		return rta;
	}

	/* ****************************************************************
	 * 			Métodos para manejar ESTADO_VACUNACION
	 *****************************************************************/
	
	public List<EstadoVacunacion> darTodosLosEstadosVacunacion() {
		log.info ("Buscando estados de vacunacion existentes");
		List<EstadoVacunacion> rta = pp.darTodosLosEstadosVacunacion();
        log.info ("Se han encontrado: " + rta.size() +" estado(s) de vacunacion");
        return rta;
	}

	

	
	

}
