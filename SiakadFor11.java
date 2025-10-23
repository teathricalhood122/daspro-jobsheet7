import java.util.Scanner;
public class SiakadFor11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0 ;
        int jumlahTidakLulus = 0;

        for (int i = 1; i <=10; i++) {
            System.out.println("Masukan nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }

            if (nilai >=60) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
   
        }
        System.out.println("Nilai Tertinggi:" + tertinggi);
        System.out.println("Nilai Terendah:" +terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Yang Tidak Lulus: " + jumlahTidakLulus);
    }
}
