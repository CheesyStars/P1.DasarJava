//Meng-import Dari Library Java
import java.text.NumberFormat;

public class X_FormatKeluaranMenggunakanObjekFormatter {
    public static void main(String[] args) {
        //Mendeklarasikan Variabel
        double doubleVal = 1280.8/2.5;
        NumberFormat numberFormatter = NumberFormat.getNumberInstance();
        NumberFormat currFormatter = NumberFormat.getNumberInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        String numberStr = numberFormatter.format(doubleVal);
        String currStr = currFormatter.format(doubleVal);
        String percentStr = percentFormatter.format(doubleVal);
        //Mencetak Atau Menampilkan Variabel
        System.out.println("Double 1280.8/2.5 Berformat Number : " +numberStr);
        System.out.println("Double 1280.8/2.5 Berformat Currency : " +currStr);
        System.out.println("Double 1280.8/2.5 Berformat Percent : " +percentStr);
    }
}
