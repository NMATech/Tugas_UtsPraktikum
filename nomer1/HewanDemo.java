/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nomer1;

/**
 *
 * @author LENOVO
 */
public class HewanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kucing myCat = new Kucing("Kucing", "Meong Meong");
        Anjing myDog = new Anjing("Anjing", "Guk Guk");
        
        System.out.println(myCat.getDetails());
        System.out.println(myCat.bersuara());
        
        System.out.println("\n");
        
        System.out.println(myDog.getDetails());
        System.out.println(myDog.bersuara());
    }
    
}
