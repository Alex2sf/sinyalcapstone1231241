/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajar.pkgclass;

/**
 *
 * @author Alex Zaro Daeli
 */
public class BelajarClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //System.out.println("Hello world!");

	// Initiate class of Human
  	Human h = new Human();
  	h.sayHelloToHuman();
  	h.sayHelloWithName("Ayu");

  	System.out.println(h.name);
        System.out.println(h.hairColor);

	// Initiate class of Animal
  	Animal animal = new Animal();
  	animal.soundOfAnimal();

  	System.out.println(animal.sound);
     Calculator hehe = new Calculator();
       
     int a = 20;
     int b = 10;

    int resultSum = hehe.sum(a, b);
    System.out.println(resultSum);

    int resultSub = hehe.sub(a, b);
    System.out.println(resultSub);

    int resultMultiply = hehe.multiply(a, b);
    System.out.println(resultMultiply)

    int resultDivide = hehe.divide (a, b);
    System.out.println(resultDivide) 
 
  }
      
    
}
