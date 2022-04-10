/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package task1;

/**
 *
 * @author Alex Zaro Daeli
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

	// Initiate class of Human
	Human h = new Human();
	h.sayHelloToHuman();
	h.sayHelloWithName("Ayu");

	System.out.println(h.name);

	// Initiate class of Animal
	Animal animal = new Animal();
	animal.soundOfAnimal();

	System.out.println(animal.sound);
  }   


 }
    
}
