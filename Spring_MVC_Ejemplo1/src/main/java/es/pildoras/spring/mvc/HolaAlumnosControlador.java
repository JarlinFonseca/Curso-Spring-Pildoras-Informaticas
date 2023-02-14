package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HolaAlumnosControlador {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { //proporciona el formulario
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping(value="/procesarFormulario", method=RequestMethod.POST)
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
	
	@RequestMapping(value="/procesarFormulario2", method=RequestMethod.POST)
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		String nombre = request.getParameter("nombreAlumno");
		nombre+=" es el mejor alumno";
		
		String mensajeFinal="¿Quién es el mejor alumno? "+nombre;
		
		// Agregando info al modelo
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		return "HolaAlumnosSpring";
	}
}