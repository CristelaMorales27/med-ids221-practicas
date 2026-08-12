/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkg2.y.pkg3.evaluados;

/**
 *
 * @author CRISTELA MORALES
 */

import java.util.Scanner;
public class Ejercicios2Y3Evaluados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int opcion;
        
        do{
        
        System.out.println("\nEJERCICIOS 2 Y 3");
        System.out.println("-----------------MENU-----------------");
        System.out.println("\n1.Calcular el area de un triangulo (1)");
        System.out.println("2.Calcular hipotenusa (2) ");
        System.out.println("3.SALIR");
        
        opcion = teclado.nextInt();
        
        switch( opcion){
            
            case 1: 
                System.out.println("INGRESE LA BASE DEL TRIANGULO");
                double base = teclado.nextDouble();
                System.out.println("INGRESE LA ALTURA DEL TRIANGULO");
                double alt = teclado.nextDouble();
                
                double area = base * alt /2;
                
                System.out.println("el area del triangulo es: " +area);
                
                break;
            case 2:
                System.out.println("INGRESE EL CATETO a ");
                double a = teclado.nextDouble();
                System.out.println("INGRESE EL CATETO b ");
                double b = teclado.nextDouble();
                
                double hipo = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
                
                System.out.println("LA HIPOTENUSA ES: " +hipo);
                break;
    }
        }while (opcion != 3);
        
        }
        
        
    }
        

    
