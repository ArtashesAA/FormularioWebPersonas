package personas.spring.mvc;

import ejemplo1.spring.mvc.validacionesPersonalizadas.CPostalMadrid;
import ejemplo1.spring.mvc.validacionesPersonalizadas.CPostalSevilla;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class Persona {

	@NotEmpty
	@Size(min = 2, message = " Campo requerido ")
	private String nombre;

	@NotNull
	@Size(min = 2, message = " Campo requerido ")
	private String apellidos;

	@NotNull
	@Size(min = 9, message = " Campo requerido ")
	@Size(max = 9, message = " Campo requerido ")
	private String dni;
	
	@Pattern(regexp = "[0-9]{2}", message=" Valores entre 1 y 99 ")
	@Positive
	private Integer edad;
	
	@Pattern(regexp = "[0-9]{9}", message=" Solo 9 valores numericos ")
	private Integer telefono;
	
	@Email(message = " Formato de email incorrecto ")
	private String email;
	
	private String ciudad;

	private String idioma;
	
	@CPostalMadrid
	@CPostalSevilla
	private String cpostal;

	
//------------- Getters y Setters ------------------------------------------------------------------------
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCpostal() {
		return cpostal;
	}

	public void setCpostal(String cpostal) {
		this.cpostal = cpostal;
	}

	public @Pattern(regexp = "[0-9]{9}", message = " Solo 9 valores numericos ") Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(@Pattern(regexp = "[0-9]{9}", message = " Solo 9 valores numericos ") Integer telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	

}
