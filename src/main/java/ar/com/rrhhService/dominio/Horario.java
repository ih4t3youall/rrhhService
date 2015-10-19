package ar.com.rrhhService.dominio;

import java.sql.Timestamp;
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
@Table(name="horario")
public class Horario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHorarios")
	private int idHorarios;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_empleado", nullable = false)
	private Empleado empleado;
	@Temporal(TemporalType.DATE)
	@Column(name = "entrada")
	private Date entrada;
	@Temporal(TemporalType.DATE)
	@Column(name = "salida")
	private Date salida;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha")
	private Date fecha;
	public int getIdHorarios() {
		return idHorarios;
	}
	public void setIdHorarios(int idHorarios) {
		this.idHorarios = idHorarios;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Date getEntrada() {
		return entrada;
	}
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}
	public Date getSalida() {
		return salida;
	}
	public void setSalida(Date salida) {
		this.salida = salida;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
	
	

}
