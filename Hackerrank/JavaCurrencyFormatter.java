import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        Locale IndianLocal = new Locale("en", "IN");
        double nilai = get.nextDouble();

        //US
        // Currency usCurrency = Currency.getInstance(usLocale);
        NumberFormat numFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        String numFormattedUS = numFormatUS.format(nilai);

        //India
        NumberFormat numFormatIndia = NumberFormat.getCurrencyInstance(IndianLocal);
        String numFormattedIndia = numFormatIndia.format(nilai);


        //China
        NumberFormat numFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String numFormattedChina = numFormatChina.format(nilai);

        //France
        NumberFormat numFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String numFormattedFrance = numFormatFrance.format(nilai);



        System.out.println("US: " + numFormattedUS);
        System.out.println("India: " + numFormattedIndia);
        System.out.println("China: " + numFormattedChina);
        System.out.println("France: " + numFormattedFrance);

    }
}