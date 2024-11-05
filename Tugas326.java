import java.util.Scanner;

public class Tugas326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte apakahAda = 0;
        //Daftra menu
        String[] menu = {"Nasi Goreng","Mie Goreng","Roti Bakar","Kentang Goreng","Teh Tarik","Coppucino","Chocolate Ice"};
        String pesananUser;
        //Menampilkan daftar menu
        System.out.println("\n---Daftar Menu---\n");
        for(int i = 0; i < menu.length; i++){
            System.out.print((i+1)+"."+menu[i]);
        }
        //Mengambil input user
        System.out.print("\nMasukkan pesanan: ");
        pesananUser = sc.nextLine();
        //Cek ketersediaan pesanan dari user
        for(int i = 0; i < menu.length; i++){
            if (menu[i].equalsIgnoreCase(pesananUser)) {
                apakahAda = (byte)(i+1);
                break;
            }
        }
        if (apakahAda != 0) {
            System.out.println("\nPesanan tersedia\n");
        }else{
            System.out.println("\nMaaf pesanan tidak ada di menu\n");
        }
    }
}