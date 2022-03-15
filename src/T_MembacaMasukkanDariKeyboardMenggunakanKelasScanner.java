//Meng-import Dari Library java
import java.util.Scanner;

public class T_MembacaMasukkanDariKeyboardMenggunakanKelasScanner {
    public static void main(String[] args) {
        //Mendeklarasikan Variabel Inputan
        Scanner input = new Scanner (System.in);
        System.out.println("What Is Your Name? : ");
        String name = input.nextLine();
        System.out.println("My Name Is " +name);
    }
}
