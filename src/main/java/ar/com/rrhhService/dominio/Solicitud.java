package ar.com.rrhhService.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="solicitud")
public class Solicitud {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_solicitud", unique = true, nullable = false)
	private int id_solicitud;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_empleado", nullable = false)
	private Empleado empleado;
	@Column(name = "fecha_realizado")
	@Temporal(TemporalType.DATE)
	private Date fecha_realizado;
	@Column(name = "licencia_inicio")
	@Temporal(TemporalType.DATE)
	private Date licencia_inicio;
	@Column(name = "licencia_fin")
	@Temporal(TemporalType.DATE)
	private Date licencia_fin;
	@Column(name = "motivo")
	private String motivo;
	@Column(name="solicitud")
	private String solicitud;

	public int getId_solicitud() {
		return id_solicitud;
	}

	public void setId_solicitud(int id_solicitud) {
		this.id_solicitud = id_solicitud;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Date getFecha_realizado() {
		return fecha_realizado;
	}

	public void setFecha_realizado(Date fecha_realizado) {
		this.fecha_realizado = fecha_realizado;
	}

	public Date getLicencia_inicio() {
		return licencia_inicio;
	}

	public void setLicencia_inicio(Date licencia_inicio) {
		this.licencia_inicio = licencia_inicio;
	}

	public Date getLicencia_fin() {
		return licencia_fin;
	}

	public void setLicencia_fin(Date licencia_fin) {
		this.licencia_fin = licencia_fin;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

}
