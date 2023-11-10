/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomer1;

/**
 *
 * @author LENOVO
 */
public class Hewan {
    private String jenisHewan;
    String namaHewan, jenisSuara;
    
    protected String isMamalia(){
        if(namaHewan == "Kucing"){
            jenisHewan = "mamalia";
        }else if(namaHewan == "Anjing"){
            jenisHewan = "mamalia";
        }
        
        return jenisHewan;
    }
    
    public String getDetails(){
        return "Hewan anda adalah ";
    }
}
