import java.util.Scanner;

public class KafeDoWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.println("Masukan nama pelanggan (ketik 'batal' untuk keluar)");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan");
                break;
            }
            System.out.println("Jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah Teh: ");
            teh = sc.nextInt();
            System.out.println("Jumlah Roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
            System.out.println("Total Harga yang Harus Dibayar: Rp." + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua Transaksi");

    }
}
