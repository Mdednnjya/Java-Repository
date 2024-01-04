import java.io.*;
import java.util.*;

public class JavaStaticInitializerBlock {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        
        int a = get.nextInt();
        int b = get.nextInt();
        int result = 0;
        if (a > 0 && b > 0){
            result = a*b;
            System.out.println(result);
        }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive\r\n" + //
                    "");
        }

    }
}