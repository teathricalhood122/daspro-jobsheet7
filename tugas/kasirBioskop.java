package tugas;

import java.util.Scanner;

public class kasirBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerTiket = 50000;
        int totalTiketHarian = 0;       
        double totalPenjualanHarian = 0.0; 

        System.out.println("--- PROGRAM KASIR BIOSKOP ---");
        System.out.println("Harga per tiket: Rp " + hargaPerTiket);

        
        do {
            System.out.println("------------------------------------");
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk tutup): ");
            int tiketPerTransaksi = sc.nextInt();

            
            if (tiketPerTransaksi == 0) {
                System.out.println("Kasir ditutup...");
                break; 
            }

           
            if (tiketPerTransaksi < 0) {
                System.out.println("Input tidak valid (negatif). Silakan ulangi.");
                continue; 
            }

            

            double totalHargaTransaksi = tiketPerTransaksi * hargaPerTiket;
            double diskon = 0.0; 

            if (tiketPerTransaksi > 10) {
                diskon = 0.15; 
            } else if (tiketPerTransaksi > 4) {
                diskon = 0.10; 
            }

           
            double hargaSetelahDiskon = totalHargaTransaksi - (totalHargaTransaksi * diskon);

            System.out.println("Total harga asli: Rp " + totalHargaTransaksi);
            if (diskon > 0) {
                System.out.println("Selamat! Anda dapat diskon: " + (diskon * 100) + "%");
            }
            System.out.println("Total yang harus dibayar: Rp " + hargaSetelahDiskon);

            
            totalTiketHarian += tiketPerTransaksi;
            totalPenjualanHarian += hargaSetelahDiskon; 

        } while (true);


        System.out.println("\n--- LAPORAN PENJUALAN HARIAN ---");
        System.out.println("Total Tiket Terjual: " + totalTiketHarian + " tiket");
        System.out.println("Total Penjualan: Rp " + totalPenjualanHarian);
    }
}
