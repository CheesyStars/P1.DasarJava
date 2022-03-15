//Meng-import Dari Library Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class S_MembacaMasukkanDariKeyboardMenggunakanKelasBufferReader {
    public static void main(String[] args) throws IOException {
        //Mendeklarasikan Variabel
        InputStreamReader key = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);
        //Mencetak Inputan
        System.out.print("What Is Your Name? : ");
        String name = input.readLine();
        System.out.println("My Name Is " +name);
    }
}
