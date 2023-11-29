package com.example.javawebapp.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.example.javawebapp.forms.DataNascimentoValida;

public class DataNascimentoValidator implements ConstraintValidator<DataNascimentoValida, String> {

    private static final int IDADE_MINIMA = 12;

    @Override
    public void initialize(DataNascimentoValida constraintAnnotation) {
        // Nenhuma inicialização necessária
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // Deixe a validação para outras anotações, como @NotNull
        }

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date dataNascimento = dateFormat.parse(value);

            // Obtendo a data atual
            Calendar currentDate = Calendar.getInstance();
            Date now = currentDate.getTime();

            // Obtendo a data de IDADE_MINIMA anos atrás
            currentDate.add(Calendar.YEAR, -IDADE_MINIMA);
            Date idadeMinima = currentDate.getTime();

            return dataNascimento.before(now) && dataNascimento.after(idadeMinima);
        } catch (ParseException e) {
            return false; // Se ocorrer um erro de análise, considere a data inválida
        }
    }
}
