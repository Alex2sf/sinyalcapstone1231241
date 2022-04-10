/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Alex Zaro Daeli
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String[] data = {C,A,B,I,D};
   
    for (String i = 0 ; i < data.length; i++) {
      for (String j = 0 ; j < data.length-1; j++) {
          boolean sortdata = data[j] < data[j+1];
          if (!sortdata) {
             int baru = data[j];
             data[j] = data[j+1];
             data[j+1] = baru;
            }         
       }
   }
   for (String i = 0 ; i < data.length; i++) {
      System.out.println(data[i]);
  }
    }
    
}
