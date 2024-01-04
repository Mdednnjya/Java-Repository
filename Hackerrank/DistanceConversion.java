import java.util.*;

public class DistanceConversion{
    
    public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    System.out.println("=====KONVERSI JARAK======");
    System.out.println("1. km");
    System.out.println("2. hm");
    System.out.println("3. dam");
    System.out.println("4. m");
    System.out.println("5. dm");
    System.out.println("6. cm");
    System.out.println("7. mm");
    System.out.println("Jarak Sebelum(Int):");
    int satuanJarakAwal = get.nextInt();
    System.out.println("Jarak Sesudah(Int):");
    int satuanSetelahKonversi = get.nextInt();
    System.out.print("Masukan nilai anda:");
    double nilai = get.nextDouble();
    System.out.print("");

    double hasilAkhir = pengkonversi(satuanJarakAwal, satuanSetelahKonversi, nilai);
    System.out.print("Hasilnya adalah: " + hasilAkhir + " " + getSatuan(satuanSetelahKonversi));
    }

    public static double pengkonversi(int nilaiSebelum, int nilaiSetelah, double Value){
        double[] konversi = {1.0, 10.0, 100.0, 1000.0, 10000.0, 100000.0, 1000000.0};
        
        double result = Value * (konversi[nilaiSetelah - 1] / konversi[nilaiSebelum - 1]);
        
        return result;
    }

    public static String getSatuan(int satuan){
        String[] satuanArray = {"km", "hm", "dam", "m", "dm", "cm", "mm"};
        return satuanArray[satuan - 1];

    }
    
}

