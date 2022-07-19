package model_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class AppData4 {

    public static void main(String[] args) throws ParseException {

        //Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");

       long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-01-30"), LocalDate.now());

        System.out.println("Possui " + dias + " dias entra a faixa de data");
    }
}
