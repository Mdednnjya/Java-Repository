package JavaBigInteger;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        BigInteger addition = a.add(b);
        BigInteger Multiplication = a.multiply(b);


        System.out.println(addition);
        System.out.println(Multiplication);
    }
}