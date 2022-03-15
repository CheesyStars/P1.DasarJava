public class W_OutPrintf {
    public static void main(String[] args) {
        //Mendeklarasikan Variabel
        String nama = "Anton";
        int umur = 21;
        float tinggiBadan = 170.4f;
        double beratBadan = 71.78;
        boolean kawin = true;
        char jenisKelamin = 'P';
        int oktal12 = 014;
        //Mencetak Atau Menampilkan Variabel Menggunakan Fungsi System.out.printf
        System.out.printf("Nama : %s\n", nama);
        System.out.printf("Umur : %d\n", umur);
        System.out.printf("Tinggi Badan : %f\n", tinggiBadan);
        System.out.printf("Berat Badan : %1f\n", beratBadan);
        System.out.printf("Sudah Menikah : %b\n", jenisKelamin);
        System.out.printf("Bilangan Oktal 12 : %o\n", oktal12);
    }
}
