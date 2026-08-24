/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1guia.pkg3;

/**
 *
 * @author CRISTELA MORALES
 */
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio1Guia3 {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 
       
       int[] numeros = new int[5];
       
       for(int i=0; i<5; i++){
           System.out.println("ingrese un numero: ");
           numeros[i] = teclado.nextInt();
       }
       int max=numeros[0];
       int min=numeros[0];
       int posmax=0;
       int posmin=0;
           
       for (int i=0; i<5; i++ ){
           if(numeros[i] >max){
               max= numeros[i];
               posmax= i;
           }
           if(numeros[i]<min){
               min = numeros[i];
               posmin =i;
           }
           
           
           }
            System.out.println("El maximo es: " + max);
            System.out.println("La posicion del maximo es: " + posmax);

            System.out.println("El minimo es: " + min);
            System.out.println("La posicion del minimo es: " + posmin);
            
           
    }
       
    
    
    
    
    }
    

