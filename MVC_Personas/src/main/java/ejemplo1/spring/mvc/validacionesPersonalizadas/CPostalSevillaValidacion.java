package ejemplo1.spring.mvc.validacionesPersonalizadas;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CPostalSevillaValidacion implements ConstraintValidator<CPostalSevilla, String> {
	
		private String prefijoCodigoSevilla;

	    @Override
	    public void initialize(CPostalSevilla elCodigo) {
	    	prefijoCodigoSevilla=elCodigo.value();
	    }


		@Override
		public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
			
			boolean valCodigo = false;
			
			if(arg0!=null) valCodigo=arg0.startsWith(prefijoCodigoSevilla);
			else return valCodigo=true;
			
			return valCodigo;
		}
		
		
		
}
