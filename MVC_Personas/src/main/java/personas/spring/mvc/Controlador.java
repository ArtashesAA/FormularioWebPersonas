package personas.spring.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Controlador {
	@RequestMapping
	public String muestraPagina() {
		return "paginaInicio";
	}
}
