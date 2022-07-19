package model_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppData2 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dataVencimentoBoleto = simpleDateFormat.parse("18/07/2022");

        Date dataAtualHoje = simpleDateFormat.parse("19/07/2022");

        if(dataVencimentoBoleto.after(dataAtualHoje)){
            System.out.println("Boleto no prazo");
        }else {
            System.out.println("Boleto Vencido");
        }
    }
}
