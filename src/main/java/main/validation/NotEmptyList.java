package main.validation;


import main.validation.constraintValidation.notEmptyListValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = notEmptyListValidator.class)
public @interface NotEmptyList {

        String message() default "A lista nao pode ser vazia";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
