package springbootform.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import springbootform.models.Usuario;

@Component
public class UsuarioValidador implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Usuario.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Usuario usuario = (Usuario)target;
        ValidationUtils.rejectIfEmpty(errors, "nombre", "NotEmpty.usuario.nombre" );

    }
}
