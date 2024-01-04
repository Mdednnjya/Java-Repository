import java.io.*;
import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        int a = get.nextInt();

        String konversi = Integer.toString(a);

        if(konversi instanceof String){
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer");
        }
    }
}