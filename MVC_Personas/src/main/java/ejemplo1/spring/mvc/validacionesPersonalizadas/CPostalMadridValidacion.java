package ejemplo1.spring.mvc.validacionesPersonalizadas;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String> {
	
		private String prefijoCodigoMadrid;

	    @Override
	    public void initialize(CPostalMadrid elCodigo) {
	    	prefijoCodigoMadrid=elCodigo.value();
	    }


		@Override
		public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
			
			boolean valCodigo = false;
			
			if(arg0!=null) valCodigo=arg0.startsWith(prefijoCodigoMadrid);
			else return valCodigo=true;
			
			return valCodigo;
		}
		
		
		
}
