package ar.com.rrhhService.dto;

import java.util.Date;

public class SolicitarPermisoDTO {

	private Date fechaDesde;
	private Date fechaHasta;
	private String motivo;
	private String textoSolicitud;

	
	

	public String getTextoSolicitud() {
		return textoSolicitud;
	}

	public void setTextoSolicitud(String textoSolicitud) {
		this.textoSolicitud = textoSolicitud;
	}

	public Date getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Date getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}
