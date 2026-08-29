/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3guia4;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;
public class Ejercicio3Guia4 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        try{
            System.out.print("ingrese su sueldo anual:");
            String sueldoT = teclado.nextLine();
            double sueldo = Double.parseDouble(sueldoT);
           
                 
            if(sueldo >=24457.15){
             double renta = ((sueldo - 24457.14) * 0.30) + 3462.86;
             System.out.println("el descuento de renta es de: "+renta);
            }else if (sueldo >=10742.87){
             double renta =((sueldo-10742.86)*0.20)+720;
             System.out.print("el descuento de renta es de: "+renta);
            }else if(sueldo >=6600.01){
             double renta = ((sueldo -6600)*0.10)+212.12;
             System.out.print("el descuento de renta es de: "+renta);
            }else{
                System.out.print("no hay descuento");
                
                         
        }
        }catch(NumberFormatException error){
             System.out.print("solo deben ser numeros");
        
    }
}
}

    

