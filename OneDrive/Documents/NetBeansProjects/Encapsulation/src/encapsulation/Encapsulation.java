/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author Alex Zaro Daeli
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
    Laptop la = new Laptop();
  //  System.out.println(la.getBrand());
    la.setBrand("Gucci");
    System.out.println(la.getBrand());

   // System.out.println(la.getVga());
    la.setVga("GTX 1080");
    System.out.println(la.getVga());
  
    la.setRam("16 Gigabyter");
    System.out.println(la.getRam()); 

    la.setHdd("Toshiba Canvio Premium 2 TB");
    System.out.println(la.getHdd());

    la.setPrice(200000);
    System.out.println(la.getPrice());

   
 
    }
    
}
