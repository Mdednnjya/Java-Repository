import java.util.*;
import java.io.*;

class JavaLoopsV2 {
    public static void main(String[] argh) {
        Scanner get = new Scanner(System.in);
        int n = get.nextInt();
        int a, b, panjang;

        for (int i = 0; i < n; i++) {
            a = get.nextInt();
            b = get.nextInt();
            panjang = get.nextInt();
        }
        for (int j = 0; j < 1; j++) {
            double result = a + ((Math.pow(2, j)) * b);
            int resultInt = (int) result;
            System.out.print("a = " + a + " b = " + b + " panjang =" + panjang + "_");
        }
    }
}