package personas.spring.mvc;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import spring.mvc.validacionespersonalizadas.Telefono;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Persona {

	@Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
	@NotEmpty(message = "No puede estar vacío")
	@Size(min = 2, message = " Introduce un nombre válido.")
	private String nombre;

	@Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
	@NotNull(message = "No puede estar vacío")
	@Size(min = 2, message = " Introduce un apellido válido.")
	private String apellidos;

	@Pattern(regexp = "[a-zA-Z0-9]+", message = "El campo debe contener solamente letras y números")
	@NotNull(message = "No puede estar vacío")
	@Size(min = 9, message = " Debes introducir 9 caracteres.")
	@Size(max = 9, message = " Debes introducir 9 caracteres.")
	private String dni;
	
	@Pattern(regexp = "^[0-9]+$", message = "El campo debe contener solo numeros")
	@NotNull(message = "No puede estar vacío")
	@Min(value=10, message="No se permiten menores de 10 años.")
	@Max(value=100, message="No se permiten mayores de 100 años.")
	private String edad;
	
	@NotNull(message = "No puede estar vacío")
	@Pattern(regexp = "^[0-9]+$", message = "El campo debe contener solo numeros")
	@Size(min = 9, message = " El teléfono debe tener 9 dígitos")
	@Telefono
	private String telefono;
	
	@Email(message = " Formato de email incorrecto.")
	private String email;
	
	@Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
	private String ciudad;

	private String idioma;
	
	@Pattern(regexp = "^[0-9]+$", message = "El campo debe contener solo numeros")
	private String cpostal;

	
//------------- Getters y Setters ------------------------------------------------------------------------
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getCpostal() {
		return cpostal;
	}

	public void setCpostal(String cpostal) {
		this.cpostal = cpostal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
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
