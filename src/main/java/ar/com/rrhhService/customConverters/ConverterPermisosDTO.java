package ar.com.rrhhService.customConverters;

import org.dozer.CustomConverter;

import ar.com.rrhhService.dominio.Solicitud;
import ar.com.rrhhService.dto.SolicitarPermisoDTO;
import ar.com.rrhhService.utilitys.FechaUtility;

public class ConverterPermisosDTO implements CustomConverter {

	@Override
	public Object convert(Object destination, Object source, Class<?> destClass, Class<?> sourceClass) {
		
		Solicitud solicitud = new Solicitud();
		SolicitarPermisoDTO solicitarPermisoDTO =(SolicitarPermisoDTO)source;
		
		solicitud.setFecha_realizado(FechaUtility.getFechaActual());
		solicitud.setLicencia_inicio(solicitarPermisoDTO.getFechaDesde());
		solicitud.setLicencia_fin(solicitarPermisoDTO.getFechaHasta());
		solicitud.setTextoSolicitud(solicitarPermisoDTO.getTextoSolicitud());
		
		
		
		
		
		return solicitud;
	}

	
	
	
}
