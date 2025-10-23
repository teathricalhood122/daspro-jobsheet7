package tugas;

import java.util.Scanner;

public class parkir11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        int total = 0; 

        System.out.println("--- PROGRAM PARKIR CANGGIH ---");

        do {
            System.out.println("---------------------------------");
            System.out.println("Masukkan jenis kendaraan:");
            System.out.println("(1 Mobil, 2 Motor, 0 Keluar)");
            
            jenis = sc.nextInt();
            
            if (jenis == 1 || jenis == 2) {
                
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                    System.out.println("-> Tarif flat (> 5 jam): +Rp 12.500");
                } else { 
                    if (jenis == 1) {
                        total += durasi * 3000;
                        System.out.println("-> Tarif Mobil: +Rp " + (durasi * 3000));
                    } else { 
                        total += durasi * 2000;
                        System.out.println("-> Tarif Motor: +Rp " + (durasi * 2000));
                    }
                }
            } 
        } while (jenis != 0); 
        
        System.out.println("==============================");
        System.out.println("Total Pendapatan Hari Ini: Rp " + total);
        
        sc.close(); 
    }
}
