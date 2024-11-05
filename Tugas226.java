import java.util.Scanner;

public class Tugas226{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHarga = 0;
        //Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan : ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();
        //Membuat array menu dan harga
        String[] menu = new String[jmlPesanan];
        int[] harga = new int[jmlPesanan];
        //Mengisi nilai array menu dan harga
        for(int i = 0; i < jmlPesanan; i++){
            System.out.print("Masukkan pesanan ke-"+(i+1)+" : ");
            menu[i] = sc.nextLine();
            System.out.print("Masukkan harga : Rp ");
            harga[i] = sc.nextInt();
            sc.nextLine();
        }
        //Menghitung total harga
        for(int i = 0; i < harga.length; i++){
            totalHarga += harga[i];
        }
        System.out.println("\n---OUTPUT---\n");
        //Menampilkan semua pesanan dan total harga
        for(int i = 0; i < menu.length; i++){
            System.out.println("Pesanan ke-"+(i+1)+" : "+menu[i]);
        }
        System.out.println("Total harga = Rp."+ totalHarga);
    }
}