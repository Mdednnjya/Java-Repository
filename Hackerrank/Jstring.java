package JavaSubstring;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Jstring {

    public static void main(String[] args) {
        // declaration
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        // split String into Array
        String[] ArrayS = S.split("");

        // Core of the problem 
        int n = start;
        while (n < end){
            System.out.printf(ArrayS[n]);
            n++;
        }


    }
}