public class D_VariabelGlobalDanLokal {

    //Mendeklarasikan Variabel
    static int varGlobal = 34;

    public static void main(String[] args) {

        varGlobal = 25;

        //Mencetak Nilai Dari varGlobal
        System.out.println("varGlobal Diakses DI Method Main Dengan Nilai = " +varGlobal);
        double varLokal = 3.14;
        System.out.println("varLokal Hanya Bisa Diakses Method Main Dengan Nilai = "+varLokal);
        aksesVariabelLokas();
    }
    //Membuat Mehtod / Fungsi Yang Bernama aksesVariabelLokal
    public static void aksesVariabelLokas () {
        System.out.println("varGlobal Bisa Diakses Di Method aksesVariabelLokal Dengan Nilai = "+varGlobal);
        //varLokal
        System.out.println("varLokal Tidak Bisa Diakses Di Method aksesVariabelLokal Ini");
    }
}
