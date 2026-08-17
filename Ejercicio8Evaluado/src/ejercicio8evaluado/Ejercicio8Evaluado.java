/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8evaluado;

/**
 *
 * @author CRISTELA MORALES
 */
import java.util.Scanner;
public class Ejercicio8Evaluado {

    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la coordenada X: ");
        int x = teclado.nextInt();

        System.out.print("Ingrese la coordenada Y: ");
        int y = teclado.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("El punto esta en el origen.");
        } else if (x == 0) {
            System.out.println("El punto esta en el eje Y.");
        } else if (y == 0) {
            System.out.println("El punto esta en el eje X.");
        } else if (x > 0 && y > 0) {
            System.out.println("El punto esta en el Primer Cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto esta en el Segundo Cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto está en el Tercer Cuadrante.");
        } else {
            System.out.println("El punto esta en el Cuarto Cuadrante.");
        }
    }
}
    