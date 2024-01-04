import java.util.Scanner;

class InputArrayBiasa {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter size of Array");
        size = sc.nextInt();
        int A[] = new int[size];
        int i;

        System.out.println("Enter " + size + " elements");

        for (i = 0; i < size; i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        System.out.print("{");
        for ( i = 0; i < size; i++){
            System.out.print(A[i]);
            System.out.print(", ");
        } // for closed
        System.out.println("}");
    } //main closed

} //class closed