package br.com.devmedia.ws.rest.exemplo1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CEPValidoImpl.class)
public @interface CEPValido {
	String message() default "CEP inválido"; //Mensagem que aparece caso o CEP seja inválido
	Class<?>[] groups() default {}; //Grupo de carga do Bean Validation
	Class<? extends Payload>[] payLoad() default {};
}
