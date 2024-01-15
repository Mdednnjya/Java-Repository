import java.io.*;
import java.util.*;

public class JavaStringReverse{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // declaration
        String A = scan.nextLine();
        char[] ArrayA = A.toCharArray();
        int n = ArrayA.length;
        boolean palidrome = true;

        for (int i = 0; i < n;i ++){
            if (ArrayA[i] != ArrayA[n- 1 - i]){
                palidrome = false;
                break;
            }
        }

        // condition
        if (palidrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}