/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package ejercicio9evaluado;

/**
 *
 * @author CRISTELA MORALES
 */
import java.util.Scanner;
public class Ejercicio9Evaluado {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      System.out.println("INGRESE PRECIO DE LA ENTRADA");
      double precio = teclado.nextDouble();
      System.out.println("INGRESE LA EDAD: ");
      int edad = teclado.nextInt();
      
      
      if(edad >=60){
          double total = precio *0.50;
          double totalDesc = precio-total;
          System.out.println(totalDesc+" Es su total a pagar");
      }else if (edad <18){
          double total = precio * 0.50;
          double totalDesc = precio - total;
          System.out.println(totalDesc+" Es su total a pagar");
      }else {
          System.out.println("Su total es de: "+precio);
      
      }
    }
    
}
