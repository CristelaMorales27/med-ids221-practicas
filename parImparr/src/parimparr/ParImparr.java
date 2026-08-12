

package parimparr;

/**
 *
 * @author Cristela Morales 
 */

import java.util.Scanner;
public class ParImparr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        
        int numero = teclado.nextInt();
        
        if (numero % 2 == 0){
        System.out.println(numero + " es par");
        }else { 
            System.out.println(numero + " es impar");
        }
        
        
    }
    
}
