package springbootform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springbootform.models.Usuario;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
public class FormController {

	@GetMapping("/form")
	public String form(Model model) {
		return "form";
	}
	
	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario, BindingResult result, Model model) {

		if(result.hasErrors()){
			Map<String, String> errores = new HashMap<>();
			result.getFieldErrors().forEach( err -> {
				errores.put(err.getField(), "El campo".concat(err.getField().concat(" ").concat(Objects.requireNonNull(err.getDefaultMessage()))));
			});
			model.addAttribute("error", errores);
			return "form";
		}

		model.addAttribute("usuario", usuario);
		return "resultado";
	}
	
}
