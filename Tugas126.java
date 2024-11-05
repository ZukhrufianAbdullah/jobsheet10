import java.util.Scanner;

public class Tugas126 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int jmlNilai, nilaiTertinggi, nilaiTerendah, totalNilai;
      double rata2;
      totalNilai = 0;
      // mengambil input dari user
      System.out.print("Masukkan banyaknya nilai yang diinput : ");
      jmlNilai = sc.nextInt();
      int[] nilaiMhs = new int[jmlNilai];  // membuat array nilai mhs
      // mengisi nilai array mhs
      for (int i = 0; i < nilaiMhs.length; i++) {
          System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
          nilaiMhs[i] = sc.nextInt();
      }
      System.out.println("\n=== OUTPUT ===\n");
      // menampilkan nilai mhs
      for (int i = 0; i < nilaiMhs.length; i++) {
          System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i]);
      }
      // menghitung rata-rata
      for (int i = 0; i < nilaiMhs.length; i++) {
            totalNilai += nilaiMhs[i];
      }
      rata2 = totalNilai / nilaiMhs.length;
      // menghitung nilai tertinggi & terendah
      nilaiTertinggi = nilaiMhs[0];
      nilaiTerendah = nilaiMhs[0];
      for (int i = 1; i < nilaiMhs.length; i++) {
          if (nilaiMhs[i] > nilaiTertinggi) {
              nilaiTertinggi = nilaiMhs[i];
        } 
          if (nilaiMhs[i] < nilaiTerendah) {
              nilaiTerendah = nilaiMhs[i];
        }
      }
      // menampilkan rata-rata, nilai max, nilai min
      System.out.println("Rata-rata nilai = " + rata2);
      System.out.println("Nilai tertinggi = " + nilaiTertinggi);
      System.out.println("Nilai terendah = " + nilaiTerendah);
    
  }
}