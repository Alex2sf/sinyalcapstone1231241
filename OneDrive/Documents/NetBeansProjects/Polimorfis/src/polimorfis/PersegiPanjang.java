/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfis;

/**
 *
 * @author Alex Zaro Daeli
 */
public class PersegiPanjang extends bangundatar {
     int panjang;
   int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
   
   @Override
    public float keliling(){
        return (this.panjang + this.lebar) * 2;
    }    



   @Override
   public float luas(){
       return this.panjang * this.lebar;
   } 
}
