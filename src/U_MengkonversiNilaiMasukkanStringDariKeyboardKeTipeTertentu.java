//Meng-import Dari Library Java
import java.io.IOException;
import java.util.Scanner;

public class U_MengkonversiNilaiMasukkanStringDariKeyboardKeTipeTertentu {
    public static void main(String[] args) throws IOException {
        //Mendeklarasikan Variabel Inputan Dan Menginput Nilai Pada Variabel
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nama : ");
        String name = input.nextLine();
        System.out.print("Masukkan Umur : ");
        String age = input.nextLine();
        System.out.print("Masukkan Tinggi Bada : ");
        String height = input.nextLine();
        System.out.print("Sudah Menikah (true / false) : ");
        String married = input.nextLine();
        //Mencetak Atau Menampilkan Inputan Dari User
        System.out.println("Nama : " +name);
        System.out.println("Umur : " +Integer.parseInt(age));
        System.out.println("Tinggi Badan : " +Double.parseDouble(height));
        System.out.println("Sudah Menikah : " +Boolean.parseBoolean(married));
    }
}
