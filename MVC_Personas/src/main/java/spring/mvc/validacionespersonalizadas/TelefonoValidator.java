package spring.mvc.validacionespersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TelefonoValidator implements ConstraintValidator<Telefono, String> {
    @Override
    public void initialize(Telefono constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return value.startsWith("6");
    }
}


