import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UlarHuruf {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        int jumlahKolom = get.nextInt();
        int jumlahBaris = get.nextInt();
        char huruf = 'a';
        for(int i=0;i<jumlahBaris;i++){
            String space = "";
            for(int j=0;j<jumlahKolom;j++){
                if (huruf > 'z'){
                    huruf = 'a';
                } 
                if (i % 2 == 1){ //jika ganjik
                    space = huruf + space; 
                }
                else { //jika genap 
                    space = space + huruf;
                }
                huruf++;
               }
              System.out.println(space);
        }
    }
}
