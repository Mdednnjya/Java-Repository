import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class grade {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        int a = get.nextInt();
        int b = get.nextInt();
        int c = get.nextInt();

        double result = (a+b+c)/3;

        if(result >= 80 && result <= 100){
            System.out.println("Selamat, Anda lulus dengan predikat A (Sangat Baik)");
        } else if (result >= 70 && result <= 79){
            System.out.println("Selamat, Anda lulus dengan predikat B (Baik)");
        } else if (result >= 50 && result <= 69){
            System.out.println("Selamat, Anda lulus dengan predikat C (Cukup)");
        } else if (result >= 30 && result <= 49){
            System.out.println("Maaf, Anda tidak lulus dengan predikat D (Kurang)");
        } else if (result >= 0 && result <= 29){
            System.out.println("Maaf, Anda tidak lulus dengan predikat E (Sangat Kurang)");
        }


    }
}