package model_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AppData {

    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();

        Date date = new Date();

        System.out.println("Data em milisegundos " + date.getTime());
        System.out.println("Calendar em milisegundos : " + calendar.getTimeInMillis() + "\n");

        System.out.println("Dia do mês " + date.getDate());
        System.out.println("Calendar dia do mês : " + calendar.get(Calendar.DAY_OF_MONTH) + "\n");

        System.out.println("Dia da semana " + date.getDay());
        System.out.println("Calendar dia da semana : " + (calendar.get(Calendar.DAY_OF_WEEK) - 1) + "\n");

        System.out.println("Horas do dia " + date.getHours());
        System.out.println("Calendar horas do dia : " + calendar.get(Calendar.HOUR_OF_DAY) + "\n");

        System.out.println("Minutos da hora " + date.getMinutes());
        System.out.println("Calendar minutos da hora : " + calendar.get(Calendar.MINUTE) + "\n");

        System.out.println("Segundos " + date.getSeconds());
        System.out.println("Calendar segundos : " + calendar.get(Calendar.SECOND) + "\n");

        System.out.println("Ano " + (date.getYear() + 1900));
        System.out.println("Calendar ano : " + calendar.get(Calendar.YEAR) + "\n");

        /*-------------------Simples Date Format--------------------*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.s");

        System.out.println("Data atual em formato padrao e String: " + simpleDateFormat.format(date));

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.SS");

        System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(date));

        System.out.println(simpleDateFormat.parse("2022-07-19 11:35.10"));
    }

}
