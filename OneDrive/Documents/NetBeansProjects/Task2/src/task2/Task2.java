/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;

/**
 *
 * @author Alex Zaro Daeli
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
String name = "Alex";
String gender = "Male";
switch (gender) {
case "Male":
System.out.println("Hello, Mr " + name);
break;
case "Female":
System.out.println("Hello, Ms " + name);
break;
case "Man":
System.out.println("Hi, Mr " + name);
break;
case "Woman":
System.out.println("Hi, Madam " + name);
break;
default :
System.out.println("We cann't find your gender " );
break;
}

int x = 0;
int y = 100;
while (x < y) {
 System.out.println(x);
 x++;
}

int num = 0;

    do {
      System.out.println("foo");
      num++;
      System.out.println("bar");
    }
    while (num<= 9);  


for(int i = 1; i <= 100; i++){
if(i %2 == 0) {
System.out.println(i + "the number is even");
}else {
System.out.println(i + "the number is odd");
}








    }
    
}
