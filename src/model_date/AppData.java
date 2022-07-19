package model_date;

import java.util.Date;

public class AppData {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("Data em milisegundos " + date.getTime());

        System.out.println("Dia do mês " + date.getDate());

        System.out.println("Dia da semana " + date.getDay());

        System.out.println("Horas do dia " + date.getHours());

        System.out.println("Minutos da hora " + date.getMinutes());

        System.out.println("Segundos " + date.getSeconds());

        System.out.println("Ano " + (date.getYear() + 1900));
    }

}
