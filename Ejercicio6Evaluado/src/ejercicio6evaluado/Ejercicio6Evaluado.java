/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6evaluado;

/**
 *
 * @author CRISTELA MORALES
 */
public class Ejercicio6Evaluado {

    public static void main(String[] args) {
        int contPrimos = 0;
        int numero = 2;

        while (contPrimos < 100) {

            int divisores = 0;

            for (int divisor = 1; divisor <= numero; divisor++) {
                if (numero % divisor == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println(numero);
                contPrimos++;
            }

            numero++;
        }
    }
}
    
    

