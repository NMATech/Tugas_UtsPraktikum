/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Buku {
    private static List<Buku> books = new ArrayList<>();
    private String title;

    public Buku(String title) {
        this.title = title;
        books.add(this);
    }

    public String getTitle() {
        return title;
    }

    public static List<Buku> getAllBooks() {
        return new ArrayList<>(books);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
