package springbootform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import springbootform.models.Usuario;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@SessionAttributes("usuario")
@Controller
public class FormController {

	@GetMapping("/form")
	public String form(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Joao");
		usuario.setApellido("Jacome");
		usuario.setId("1");
		model.addAttribute("usuario", usuario);
		return "form";
	}
	
	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario , BindingResult result, Model model, SessionStatus status) {

		if(result.hasErrors()){
			/*Map<String, String> errores = new HashMap<>();
			result.getFieldErrors().forEach( err -> {
				errores.put(err.getField(), "El campo ".concat(err.getField().concat(" ").concat(Objects.requireNonNull(err.getDefaultMessage()))));
			});
			model.addAttribute("error", errores);*/
			return "form";
		}
		model.addAttribute("usuario", usuario);
		//Limpia el objeto usuario de la sesion despues de enviar los datos
		status.setComplete();
		return "resultado";
	}
	
}
