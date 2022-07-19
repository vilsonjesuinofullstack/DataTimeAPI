package model_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AppData7 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println("Data Atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Dia da Semana: " + localDate.getDayOfWeek().name());

    }
}
