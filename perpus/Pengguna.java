/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;

/**
 *
 * @author LENOVO
 */
public class Pengguna {
    private String username;

    public Pengguna(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void displayAllBooks() {
        System.out.println("\nList Buku :");
        for (Buku book : Buku.getAllBooks()) {
            System.out.println(book);
        }
    }
}
