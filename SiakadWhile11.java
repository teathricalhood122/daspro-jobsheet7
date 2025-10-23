import java.util.Scanner;

public class SiakadWhile11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai, jml;
        int i = 0;

        System.out.println("Masukan Jumlah Mahasiswa: ");
        jml = input.nextInt();

        while (i < jml) {
                System.out.println("Masukan Nilai Mahasiswa Ke-" + (i+1)+":");
                nilai = input.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai Tidak Valid, Masukan Lagi Nilai yang Valid!");
                    continue;
                }
                if (nilai > 80 && nilai <=100) {
                    System.out.println("Nilai Mahasiswa Ke-" + (i+1)+ " Adalah A");                    
                } else if (nilai > 73 && nilai <=80 ){
                    System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " Adalah B+");
                } else if (nilai > 65 && nilai <=73 ){
                    System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " Adalah B");
                } else if (nilai > 60 && nilai <=65 ){
                    System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " Adalah C+");
                } else if (nilai > 50 && nilai <=60 ){
                    System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " Adalah C");
                } else if (nilai > 39 && nilai <=50 ){
                    System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " Adalah D");
                } else {
                    System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " Adalah E");
                }
                i++;
                
         }

    }
}
