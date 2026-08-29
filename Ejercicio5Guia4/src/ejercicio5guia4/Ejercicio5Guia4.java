/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5guia4;

/**
 *
 * @author CRISTELA MORALES
 */
import java.util.Scanner;
public class Ejercicio5Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 
       try {
       System.out.print("Ingrese su nombre de usuario: ");
       String usuario = teclado.nextLine();
       System.out.print("Ingrese su contraseña: "); 
       String contraseña = teclado.nextLine(); 
       if (contraseña.length() < 8){ 
           throw new SecurityException("La contraseña debe tener minimo 8 caracteres");
       } if (!contraseña.matches(".*[!@#$%^&*].*")) {
           throw new SecurityException("La contraseña debe contener un caracter especial");
       } System.out.println("Usuario registrado correctamente"); 
    
       }catch (SecurityException error) {
    System.out.println(error.getMessage()); 
} 
}
}
