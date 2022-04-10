/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author Alex Zaro Daeli
 */
public class Biodata {
    String namaLengkap = "Alex Zaro Daeli";
    String tempatLahir = "Tangerang";
    String tangggalLahir = "05-05-2003";
    String hobi = "Desain";
    String zodiak = "Taurus";
    String makananFavorit = "nasi goreng";
    String citaCita = "Dokter";

    public void getFullName() {
        System.out.println("Nama Lengkap = " + namaLengkap );
    } 

    public void getBirthPlace() {
        System.out.println("Tempat Lahir = " + tempatLahir );
    } 

    public void getHobby() {
        System.out.println("Hobi = " + hobi );
    } 

    public void getZodiak() {
        System.out.println("Zodiak  = " + zodiak );
    } 

    public void getFavoriteFood() {
        System.out.println("Makanan Favorite = " + makananFavorit );
    } 


    public void getDream() {
        System.out.println("Cita Cita = " + citaCita );
    } 

}
