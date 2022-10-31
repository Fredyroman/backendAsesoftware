package asesoftware.turno.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "servicios")
public class Servicios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_servicio")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_comercio")
	private Comercios comercios;

	@Column(name = "nom_servicio")
    private String nombre;

	@Column(name = "hora_apertura")
	private Date horaApertura;

	@Column(name = "hora_cierre")
	private Date horaCierre;

	@Column(name = "duracion")
	private Integer duracion;
    
	public Servicios() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Comercios getComercios() {
		return comercios;
	}

	public void setComercios(Comercios comercios) {
		this.comercios = comercios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getHoraApertura() {
		return horaApertura;
	}

	public void setHoraApertura(Date horaApertura) {
		this.horaApertura = horaApertura;
	}

	public Date getHoraCierre() {
		return horaCierre;
	}

	public void setHoraCierre(Date horaCierre) {
		this.horaCierre = horaCierre;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
}
