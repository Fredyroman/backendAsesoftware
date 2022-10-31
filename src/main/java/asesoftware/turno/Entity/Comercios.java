package asesoftware.turno.Entity;

import javax.persistence.*;

@Entity
@Table(name = "comercios")
public class Comercios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_comercio")
	private Long id;
    private String nombre;

	private Integer aforoMaximo;
    
    //Constructor
	public Comercios() {
	
	}
	
	// Setters an Getters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    public Integer getAforoMaximo() { return aforoMaximo; }
	public void setAforoMaximo(Integer aforoMaximo) { this.aforoMaximo = aforoMaximo;}
}
