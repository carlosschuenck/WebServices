package br.com.devmedia.ws.rest.exemplo1;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CEPValidoImpl implements ConstraintValidator<CEPValido, String> {

	@Override
	public void initialize(CEPValido constraintAnnotation) {
		System.out.println("message inicial erro "+constraintAnnotation.message());
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(null == value) return false;
		if(value.length() != 8) return false;
		if(value.charAt(0) != '8') return false;
		return true;
	}

}
