package com.wise.core.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Documented
@Constraint(validatedBy = UsernameValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@NotBlank
@Length(min = 3, max = 16)
@ReportAsSingleViolation
public @interface Username {
	
	String message() default "{net.lanelife.validator.constraints.Username.message}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
