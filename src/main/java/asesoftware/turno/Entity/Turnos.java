package asesoftware.turno.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

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
@Table(name = "turnos")
public class Turnos {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_turno")
	private Long idTurno;

	@ManyToOne
	@JoinColumn(name = "id_servicio")
	private Servicios servicio;

	@Column(name = "fecha_turno")
	private String fechaTurno;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "hora_inicio")
	private Date horaInicio;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "hora_fin")
	private Date horaFin;

	private boolean estado;


	public Turnos() {
	}

	public Turnos(Long idTurno, Servicios servicio, String fechaTurno, Date horaInicio, Date horaFin, boolean estado) {
		this.idTurno = idTurno;
		this.servicio = servicio;
		this.fechaTurno = fechaTurno;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.estado = estado;
	}

	public Long getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Long idTurno) {
		this.idTurno = idTurno;
	}

	public Servicios getServicio() {
		return servicio;
	}

	public void setServicio(Servicios servicio) {
		this.servicio = servicio;
	}

	public String getFechaTurno() {
		return fechaTurno;
	}

	public void setFechaTurno(String fechaTurno) {
		this.fechaTurno = fechaTurno;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
