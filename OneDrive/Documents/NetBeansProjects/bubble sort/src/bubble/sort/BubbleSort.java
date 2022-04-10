/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble.sort;

/**
 *
 * @author Alex Zaro Daeli
 */
import java.util.Arrays;
public class BubbleSort {

    /**
     * @param args the command line arguments
     */

    public static void BubbleSort(int[] angka) {
        // TODO code application logic here
       for (int i = 0; i < angka.length; i++){
          for (int j = 0; j < angka.length-1; j++) {
               if (angka[j]>angka[j+1]) {
                  int temp = angka[j];
                   angka[j] = angka[j+1];
                    angka[j+1] = temp;   
                }   
             }
           }
         }
    public static void main(String[] args) {
       int []angka=(10,5,1,6,8,100);
       
        for (int i = 0; i < angka.length; i++) {
           System.out.print(angka[i] + " ");
}        
            System.out.println(" ");
            BubbleSort(angka);
            for (int i = 0; i < angka.length; i++) {
              System.out.print(angka[i] + " ");
}        
}
}
