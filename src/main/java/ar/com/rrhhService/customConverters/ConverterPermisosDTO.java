package ar.com.rrhhService.customConverters;

import org.dozer.CustomConverter;

import ar.com.rrhhService.dominio.Solicitud;
import ar.com.rrhhService.dto.SolicitarPermisoDTO;

public class ConverterPermisosDTO implements CustomConverter {

	@Override
	public Object convert(Object destination, Object source, Class<?> destClass, Class<?> sourceClass) {
		
		Solicitud solicitud = (Solicitud)destination;
		SolicitarPermisoDTO solicitarPermisoDTO =(SolicitarPermisoDTO)source;
		System.out.println("Llegue a donde tenai que llegar.");
		
		return null;
	}

	
	
	
}
