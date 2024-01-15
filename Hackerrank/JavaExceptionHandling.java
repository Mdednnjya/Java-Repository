package JavaExceptionHandling;

import java.util.Scanner;

class MyCalculator {

    public long power(int base,int exponent) throws Exception{
        // Exception
        if (base == 0 && exponent == 0) {
            throw new Exception("n and p should not be zero.");
        }
        if (base <= -1 || exponent <= -1) {
            throw new Exception("n or p should not be negative.");
        }
        // making result
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        // condition 
        return result;
    }
}

public class JavaExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}