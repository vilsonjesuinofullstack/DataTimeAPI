package model_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AppData3 {

    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();

        //Simular que a data vem do banco de dados

        calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2022")); //Definindo data qualquer

        calendar.add(Calendar.DAY_OF_MONTH, -5);

        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
    }
}
