package spring.mvc.validacionespersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TelefonoValidator.class)
public @interface Telefono {
	String message() default "El número de teléfono debe comenzar con 6";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
