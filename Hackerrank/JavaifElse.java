import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaifElse {



    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        int n = get.nextInt();
        
        if (n%2 == 1){
            System.out.println("Weird");
        } 
        else{
            if ( n >= 2 && n <= 5){
                System.out.println("Not Weird");
            }
            if ( n >= 6 && n <= 20){
                System.out.println("Weird");
            }
            if ( n > 20){
                System.out.println("Not Weird");
            }
        }
    }
}