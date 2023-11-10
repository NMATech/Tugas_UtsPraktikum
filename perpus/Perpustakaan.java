/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpus;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Admin admin1 = new Admin("Admin123");
        User user1 = new User("User");
        Scanner input = new Scanner(System.in);
        Scanner inputAdmin = new Scanner(System.in);
        String judulBuku;
        
// Menambahkan beberapa buku ke perpustakaan
        new Buku("The Outsider");
        new Buku("To Kill a Mockingbird");
        new Buku("Harry Potter Chambers of Secret");
        
        System.out.println("SELAMAT DATANG DI APLIKASI PERPUSTAKAAN ! ");
        System.out.println("==========================================");
        System.out.println("\nSilakan Login !");
        
        System.out.print("Masukkan Username : ");
        String username = input.nextLine();
        
        if (username.equals("admin123")){
            
            System.out.println("Anda login sebagai admin");
            System.out.println("\n1. Tambahkan Buku\n2. Hapus Buku");
            System.out.print("Silakan pilih menu diatas : ");
            int pilihan = input.nextInt();
            
            if(pilihan == 1){
                System.out.print("Masukkan judul buku : ");
                judulBuku = inputAdmin.nextLine();
                    
                admin1.addBook(judulBuku);
                admin1.displayAllBooks();
            }else if(pilihan == 2){
                System.out.print("Masukkan judul buku yang ingin di hapus : ");
                String delBuku = inputAdmin.nextLine();
                    
                admin1.removeBook(delBuku);
                admin1.displayAllBooks();
            }else {
                System.out.println("Pilihan tidak tersedia !");
            }
        }else {            
            System.out.println("Anda login sebagai user");
            System.out.println("\n1. Tampilkan list Buku");
            System.out.print("Silakan pilih menu diatas : ");
            int pilihanUser = input.nextInt();
            
            if(pilihanUser == 1){
                user1.displayAllBooks();
            }else {
                System.out.println("Pilihan tidak tersedia !");
            }
        }
        input.close();
    }
}
