package es.pildoras.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Alumno {
	
	@NotNull
	@Size(min=2, message="Campo requerido")
	private String nombre;
	@NotBlank
	private String apellido;
	@NotEmpty
	private String optativa;
	@NotEmpty
	private String ciudadEstudios;
	@NotEmpty
	private String idiomasAlumno;
	
	@Min(value = 10, message = "No se permiten edades menores de 10")
	@Max(value = 100, message = "No se permiten edades mayores de 100")
	private int edad;
	
	@Email
	@NotEmpty
	private String email;
	
	
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
	public String getOptativa() {
		return optativa;
	}
	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}
	public String getCiudadEstudios() {
		return ciudadEstudios;
	}
	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
	}
	public String getIdiomasAlumno() {
		return idiomasAlumno;
	}
	public void setIdiomasAlumno(String idiomasAlumno) {
		this.idiomasAlumno = idiomasAlumno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
		
}
