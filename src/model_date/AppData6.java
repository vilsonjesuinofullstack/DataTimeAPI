package model_date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AppData6 {

    public static void main(String[] args) {

        /*Nova API Data a partir do Java 8*/

        LocalDate dataAtual = LocalDate.now();

        LocalTime horaAtual = LocalTime.now();

        System.out.println("Data atual: " + dataAtual);
        System.out.println("Hora atual: " + horaAtual);

        LocalDateTime dataHoraAtual = LocalDateTime.now();

        System.out.println("Data e Hora atual: " + dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
