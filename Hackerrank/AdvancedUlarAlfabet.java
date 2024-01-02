import java.io.*;
import java.util.*;

public class AdvancedUlarAlfabet {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        double totalIsi = get.nextInt();
        double kolom = get.nextInt();
        char alfabet = 'a';
        double tempBaris = Math.round(totalIsi/kolom);
        int baris = (int) tempBaris;
        int count = 1;
        
        for(int i=0;i<baris;i++){
            String space = "";
            for(int j=0;j<kolom;j++){
                if (alfabet > 'z'){
                    alfabet = 'a';
                }
                if (i % 2 == 1){
                    space = alfabet + space;
                }
                if (i % 2 == 0){
                    space = space + alfabet;
                }

                if(count == totalIsi){
                    if(i % 2 == 1){ 
                        for(int k=0;k<(((baris*kolom) - count));k++){
                            space ="_" + space;
                        }
                    break;
                    }
                    if(i % 2 == 0){ 
                        for(int k=0;k<(((baris*kolom) - count));k++){
                            space = space + "_";
                        }
                    break;
                    }
                }
                count++;
                alfabet++;
            }
            System.out.println(space);
        }
    }
}