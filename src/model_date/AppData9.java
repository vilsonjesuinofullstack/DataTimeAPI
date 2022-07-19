package model_date;

import java.time.LocalDate;

public class AppData9 {

    public static void main(String[] args) {

        LocalDate dataAntiga = LocalDate.of(2022, 01, 19);
        LocalDate dataAtual = LocalDate.of(2022, 07, 19);

        System.out.println("Data antiga é maior que data nova " + dataAntiga.isAfter(dataAtual));
    }
}
