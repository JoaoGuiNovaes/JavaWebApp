package com.example.javawebapp.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.time.LocalDate;

import com.example.javawebapp.forms.DataNascimentoValida;

public class DataNascimentoValidator implements ConstraintValidator<DataNascimentoValida, LocalDate> {

    @Override
    public void initialize(DataNascimentoValida constraintAnnotation) {
        // ...
    }

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        // Obtenha a data atual
        LocalDate currentDate = LocalDate.now();

        return value.isBefore(currentDate);
    }
}
