import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        int value = get.nextInt();

        int jam = value / 3600;
        int kurangJam = jam * 3600;
        int valueJam = value - kurangJam;
        int resultJam = jam;

        int menit = valueJam / 60;
        int detik = valueJam % 60;

        System.out.println(resultJam + ":" + menit + ":" + detik);
    }
}