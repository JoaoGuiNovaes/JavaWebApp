package com.example.javawebapp.forms;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.example.javawebapp.validators.DataNascimentoValidator;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DataNascimentoValidator.class)
public @interface DataNascimentoValida {
    String message() default "Não é possível cadastrar uma data posterior à atual.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

