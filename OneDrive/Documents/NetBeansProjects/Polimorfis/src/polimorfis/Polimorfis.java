/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfis;

/**
 *
 * @author Alex Zaro Daeli
 */
public class Polimorfis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bangundatar banDatar = new bangundatar();
        Lingkaran lingkaran = new Lingkaran(5);
        Persegi persegi = new Persegi(4);
        PersegiPanjang panjang = new PersegiPanjang(5, 7);
        
        // memanggil method luas dan keliling
        banDatar.luas();
        banDatar.keliling();  
    
        System.out.println("Luas lingkaran : " + lingkaran.luas());
        System.out.println("Keliling lingkaran : " + lingkaran.keliling());
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("Keliling persegi : " + persegi.keliling());
        System.out.println("Luas persegi panjang : " + panjang.luas());
        System.out.println("Keliling persegi panjang : " + panjang.keliling());


  }
    
}
