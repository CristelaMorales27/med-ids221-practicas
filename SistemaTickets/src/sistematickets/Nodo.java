/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematickets;

/**
 *
 * @author MINEDUCYT
 */
public class Nodo {
    Ticket ticket;
    Nodo siguiente;

    public Nodo(Ticket ticket) {
        this.ticket = ticket;
        this.siguiente = null;
    }
}
    

