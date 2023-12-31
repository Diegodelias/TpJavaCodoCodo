package ar.com.codoacodo.entity;
import java.time.LocalDate;
import java.time.LocalDateTime;




public class Orador {
	

	private Long id;
	private String nombre;
	private String apellido;
	private String mail;
	private String tema;
	private LocalDateTime fechaAlta;
	
	
	public Orador(String nombre, String apellido, String mail, String tema, LocalDateTime fechaAlta) {
		init(nombre, apellido, mail, tema, fechaAlta);
		
	}

	public Orador(Long id, String nombre, String apellido, String mail, String tema, LocalDateTime fechaAlta2) {
		this.id = id;
		init(nombre, apellido, mail, tema, fechaAlta2);
	}
	
	private void init(String nombre, String apellido, String mail, String tema, LocalDateTime fechaAlta2) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.tema = tema;
		this.fechaAlta = fechaAlta2;
	}

	
	public String toString() {
		return "Orador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", tema="
				+ tema + ", fechaAlta=" + fechaAlta + "]";
	}

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}	
	

	

}
