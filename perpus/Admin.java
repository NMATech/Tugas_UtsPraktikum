/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;

/**
 *
 * @author LENOVO
 */
public class Admin extends Pengguna {
    public Admin(String username) {
        super(username);
    }

    public void addBook(String title) {
        new Buku(title);
        System.out.println("Buku Berhasil di tambahkan.");
    }

    public void removeBook(String title) {
        Buku.getAllBooks().removeIf(book -> book.getTitle().equals(title));
        System.out.println("Buku Berhasil di hapus.");
    }
}
