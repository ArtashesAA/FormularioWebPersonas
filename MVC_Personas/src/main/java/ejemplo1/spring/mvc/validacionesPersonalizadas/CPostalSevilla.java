package ejemplo1.spring.mvc.validacionesPersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = CPostalMadridValidacion.class) //futura clase que contendra logica de validacion
@Target({ElementType.METHOD, ElementType.FIELD}) //destino de nuestra validacion a campos o metodos
@Retention(RetentionPolicy.RUNTIME) //chequea anotacion en tiempo de ejecucion
public @interface CPostalSevilla {

	//definir el codigo postal por defecto 
	
	public String value() default "41";
	
	//definir el mensaje de error
	
	public String message() default "El codigo postal debe comenzar por 41";
	
	//definir los grupos 
	
	Class<?>[] groups() default {};
	
	//definir los payloads
	
	 Class<? extends Payload>[] payload() default {};
	 
	 
}
