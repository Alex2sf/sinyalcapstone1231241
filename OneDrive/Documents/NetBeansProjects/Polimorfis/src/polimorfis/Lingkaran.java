/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfis;

/**
 *
 * @author Alex Zaro Daeli
 */
public class Lingkaran extends bangundatar{
    int r;

    public Lingkaran(int r) {
        this.r = r;
    }
    
    @Override
    public float luas(){
        return (float) (Math.PI * r * r);
    }
    
    @Override
    public float keliling(){
        return (float) (2 * Math.PI * r);
    }

}
