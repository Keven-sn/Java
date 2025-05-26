package Academia.util;

import java.time.LocalDate;
import java.time.Period;

public class Validador {
    public static boolean validarIdade(LocalDate nascimento) {
        int idade = Period.between(nascimento, LocalDate.now()).getYears();
        return idade >= 14;
    }
}
