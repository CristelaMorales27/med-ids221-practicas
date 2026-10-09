/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematickets;

/**
 *
 * @author MINEDUCYT
 */
public class ColaTicket {
    Nodo frente;
    Nodo finalCola;

    public ColaTicket() {
        frente = null;
        finalCola = null;
    }

    public void agregarTicket(Ticket ticket) {
        Nodo nuevo = new Nodo(ticket);

        if (frente == null) {
            frente = nuevo;
            finalCola = nuevo;
        } else {
            finalCola.siguiente = nuevo;
            finalCola = nuevo;
        }
    }

    public void mostrarTicket() {
        if (frente == null) {
            System.out.println("No hay tickets pendientes.");
        } else {
            Nodo actual = frente;

            while (actual != null) {
                System.out.println("ID: " + actual.ticket.id);
                System.out.println("Problema: " + actual.ticket.descripcion);
                System.out.println("------------------------");

                actual = actual.siguiente;
            }
        }
    }

    public void atenderTicket() {
        if (frente == null) {
            System.out.println("No hay tickets pendientes.");
        } else {
            System.out.println("Atendiendo ticket: " + frente.ticket.id);
            System.out.println("Problema: " + frente.ticket.descripcion);
            System.out.println("Ticket resuelto correctamente.");

            frente = frente.siguiente;

            if (frente == null) {
                finalCola = null;
            }
        }
    }
    }
    

