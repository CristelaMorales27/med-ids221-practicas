/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4evaluado;

/**
 *
 * @author CRISTELA MORALES
 */
import java.util.Scanner;
public class Ejercicio4Evaluado {

    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ciclo;
                double descuento;
		
		
		do{
		    System.out.println("Ingrese el sueldo mensual: ");
		   double sueldo = teclado.nextDouble();
		    
		    if (sueldo >= 2038.11) {
                    descuento = ((sueldo - 2038.10) * 0.30) + 288.57;
                    System.out.println(descuento+" es su descuento");
                    } else if (sueldo >= 895.25) {
                        descuento = ((sueldo - 895.24) * 0.20) + 60.00;
                        System.out.println(descuento+" es su descuento");
                    } else if (sueldo >= 550.01) {
                        descuento = ((sueldo - 550.00) * 0.10) + 17.67;
                        System.out.println(descuento+" es su descuento");
                    } else {
                        System.out.println("NO TIENE DESCUENTO");;
                    }
                
                System.out.println("Digite 1 para continuar o 2 para salir");
                ciclo = teclado.nextInt();
                }while(ciclo !=2);
                
                
    }
}



        
   
    
                  
		       
		       
		       
	
