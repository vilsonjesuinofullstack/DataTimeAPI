package model_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppData {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();

        System.out.println("Data em milisegundos " + date.getTime());
        System.out.println("Dia do mês " + date.getDate());
        System.out.println("Dia da semana " + date.getDay());
        System.out.println("Horas do dia " + date.getHours());
        System.out.println("Minutos da hora " + date.getMinutes());
        System.out.println("Segundos " + date.getSeconds());
        System.out.println("Ano " + (date.getYear() + 1900));

        /*-------------------Simples Date Format--------------------*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.s");

        System.out.println("Data atual em formato padrao e String: " + simpleDateFormat.format(date));

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.SS");

        System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(date));

        System.out.println(simpleDateFormat.parse("2022-07-19 11:35.10"));
    }

}
