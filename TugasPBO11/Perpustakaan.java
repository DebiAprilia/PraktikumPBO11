/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO11;

/**
 *
 * @author user
 */
import java.util.List;
import java.util.ArrayList;

public class Perpustakaan {
    private List<Buku> bukuList;
    
    public Perpustakaan(){
        this.bukuList = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku){
        bukuList.add(buku);
    }
    
    public void infoPerpustakaan(){
        System.out.println("Informasi Daftar Buku :");
        for (Buku buku : bukuList){
            buku.infoBuku();
        }
    }
}
