//Meng-import Library Java
import javax.swing.*;
public class R_MembacaMasukkanDariKeyboardDenganDialogBox {
    public static void main(String[] args) {
        //Mendeklarasikan Variabel Inputan
        String name = JOptionPane.showInputDialog("What Is Your Name? ");
        //Mencetak Inputan
        System.out.println("My Name Is " +name);
        System.exit(0);
    }
}
