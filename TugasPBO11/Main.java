/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO11;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        Pengarang p1 = new Pengarang("Leila S. Chudori");
        Pengarang p2 = new Pengarang("Pramoedya Ananta Toer");
        
        Buku b1 = new Buku("Laut Bercerita", p1);
        Buku b2 = new Buku("Bumi Manusia", p2);
        
        Perpustakaan perpus = new Perpustakaan();
        
        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);
        perpus.infoPerpustakaan();
    }
}
