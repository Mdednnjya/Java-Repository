import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        String a = get.nextLine();
        String b = get.nextLine();

        String c = a + b;

        int cLength = c.length();
        int perbandingan = a.compareTo(b);
        System.out.println(cLength);

        if (perbandingan > 0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

        String upperCaseA = a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
        String upperCaseB = b.substring(0, 1).toUpperCase() + b.substring(1).toLowerCase();

        System.out.print(upperCaseA + " " + upperCaseB);
        


    }
}