/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistematickets;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;
public class SistemaTickets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ColaTicket cola = new ColaTicket();
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE TICKETS =====");
            System.out.println("1. Crear ticket");
            System.out.println("2. Mostrar tickets pendientes");
            System.out.println("3. Atender ticket");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                
case 1:
    System.out.print("Ingrese el ID del ticket: ");
    int id = teclado.nextInt();
    teclado.nextLine();

    System.out.print("Describa el problema: ");
    String descripcion = teclado.nextLine();

    Ticket nuevo = new Ticket(id, descripcion);

    cola.agregarTicket(nuevo);

    System.out.println("Ticket agregado correctamente.");
    break;

                case 2:
                    cola.mostrarTicket();
                    break;

                case 3:
                    cola.atenderTicket();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);

        teclado.close();
    }
}