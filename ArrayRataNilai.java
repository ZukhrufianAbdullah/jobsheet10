import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahLulus = 0,jumlahTidakLulus = 0;
        int jumlahMhs = 0;
        double rataLulus = 0,rataTidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt(); 
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70) {
                jumlahLulus += 1;
                rataLulus += nilaiMhs[i];
            }else{
                jumlahTidakLulus += 1;
                rataTidakLulus += nilaiMhs[i];
            }
        }
        rataLulus = rataLulus / jumlahLulus;
        rataTidakLulus = rataTidakLulus / jumlahTidakLulus;
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rataTidakLulus);
    }
}