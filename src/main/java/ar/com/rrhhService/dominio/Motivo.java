package ar.com.rrhhService.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="motivo")
public class Motivo {
	
	@GenericGenerator(name = "generator", strategy = "foreign", 
	parameters = @Parameter(name = "property", value = "solicitud"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id_solicitud", unique = true, nullable = false)
	private int id_solicitud;
	@Column(name="motivo")
	private String motivo;
	
	@OneToOne(fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn
	private Solicitud solicitud;
	
	public int getId_solicitud() {
		return id_solicitud;
	}
	public void setId_solicitud(int id_solicitud) {
		this.id_solicitud = id_solicitud;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	
	

}
