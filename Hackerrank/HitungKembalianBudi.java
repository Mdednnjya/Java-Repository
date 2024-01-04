import java.io.*;
import java.util.*;

public class HitungKembalianBudi {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        int a = get.nextInt();
        int b = get.nextInt();
        int result50 = 0;
        int result20 = 0;
        int result10 = 0;
        int result5 = 0;
        int result2 = 0;
        int result1 = 0;
        int temp = 0;

        int kembalian = a-b;
        temp = kembalian;

        if (kembalian >= 50000){
            result50 = kembalian /50000;
            kembalian = kembalian - (result50 * 50000); 
        }
        if (kembalian >= 20000){
            result20 = kembalian /20000;
            kembalian = kembalian - (result20 * 20000); 
        }
        if (kembalian >= 10000){
            result10 = kembalian /10000;
            kembalian = kembalian - (result10 * 10000);
        }
        if (kembalian >= 5000){
            result5= kembalian /5000;
            kembalian = kembalian - (result5 * 5000); 
        }
        if (kembalian >= 2000){
            result2 = kembalian /2000; 
            kembalian = kembalian - (result2 * 2000); 
        }
        if (kembalian >= 1000){
            result1 = kembalian /1000; 
            kembalian = kembalian - (result1 * 1000);
        }


        System.out.println("Jumlah lembar 50 ribu : " + result50);
        System.out.println("Jumlah lembar 20 ribu : " + result20);
        System.out.println("Jumlah lembar 10 ribu : " + result10);
        System.out.println("Jumlah lembar 5 ribu  : " + result5);
        System.out.println("Jumlah lembar 2 ribu  : " + result2);
        System.out.println("Jumlah lembar 1 ribu  : " + result1);
    }

        
}
