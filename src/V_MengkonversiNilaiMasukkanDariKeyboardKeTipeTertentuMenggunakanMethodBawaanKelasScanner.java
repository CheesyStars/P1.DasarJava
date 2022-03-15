//Meng-import Dari Library Java
import java.io.IOException;
import java.util.Scanner;

public class V_MengkonversiNilaiMasukkanDariKeyboardKeTipeTertentuMenggunakanMethodBawaanKelasScanner {
    public static void main(String[] args) throws IOException {
        //Mendeklarasikan Inputan Dan Memasukkan Nilai
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nama : ");
        String name = input.nextLine();
        System.out.print("Masukkan Umur : ");
        int age = input.nextInt();
        System.out.print("Masukkan Tinggi Badan : ");
        double height = input.nextDouble();;
        System.out.print("Sudah Menikah (true / false) : ");
        boolean married = input.hasNextBoolean();
        System.out.println("Nama = " +name);
        System.out.println("Umur = " +age);
        System.out.println("Tinggi Badan : " +height);
        System.out.println("Sudah Menikah : " +married);
    }
}
