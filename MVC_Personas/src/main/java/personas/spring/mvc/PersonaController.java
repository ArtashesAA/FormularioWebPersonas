package personas.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/persona")
public class PersonaController {

	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor recortaEspaciosBlanco= new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, recortaEspaciosBlanco);
	}
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {
		
		Persona persona = new Persona();
		
		modelo.addAttribute("persona", persona);
		
		return "personaRegistroFormulario";
		
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("persona") Persona persona, BindingResult resultadoValidacion) {
		
		if(resultadoValidacion.hasErrors()) {
			return "personaRegistroFormulario";
		}else {		
			return "confirmacionRegistroPersona";
		}
		
	}
}
