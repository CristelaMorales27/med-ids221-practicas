/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1guia4;

/**
 *
 * @author Cristela Morales
 */
import java.util.Scanner;
public class Ejercicio1Guia4 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
		
		try{
		    
		    System.out.print("INGRESE UN NUMERO POSITIVO: ");
		    int numero = teclado.nextInt();
		    
		    if(numero < 0){
		        throw new ArithmeticException();
		        
		    }
		    
		    
		    double resultado = Math.sqrt(numero);
		    
		    
		    System.out.println("LA RAIZ DE ESE NUMERO ES: "+resultado);
		    
		    }catch (ArithmeticException error) {
		        
		        System.out.println("solo numeros positivos: ");
		    
		}
		
		
		
		
	}
}
    