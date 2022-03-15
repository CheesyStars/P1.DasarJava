import java.util.Scanner;
public class Praktikum1_SoalLatihan2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nilai Celcius : ");
        double suhuCelcius = scan.nextDouble();

        System.out.print("Masukkan Nilai Fahreinheit : ");
        double suhuFahreinheit = scan.nextDouble();

        double konversiCelcius = 0.55 * (suhuFahreinheit - 32);
        double konversiFahreinheit = ((suhuCelcius * 9) /5 + 32);

        System.out.println("Konversi Suhu Fahreinheit Ke Celcius = " +konversiFahreinheit);
        System.out.println("Konversi Suhu Celcius Ke Fahreinheit = " +konversiCelcius);
    }
}
