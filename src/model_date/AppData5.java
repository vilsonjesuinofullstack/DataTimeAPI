package model_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AppData5 {

    public static void main(String[] args) throws ParseException {

        Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("19/07/2022");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataInicial);

        for (int parcela = 1; parcela <= 3; parcela++) {
            calendar.add(Calendar.MONTH, 1);

            System.out.println("Parcela número: " + parcela + " vencimento é em : "
                    + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        }
    }
}
