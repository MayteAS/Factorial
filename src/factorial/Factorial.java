
package factorial;
import java.util.Scanner;
/**
 *
 * @author sanch
 */
public class Factorial {
     Scanner stdIn = new Scanner(System.in);
     int numero; 
        
     public void fact(){
     double factorial = 1.0;
     System.out.print("Introduzca un numero entero: ");
     numero = stdIn.nextInt();
         for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println(numero + "! = " + factorial);
}
  public static void main(String[] args) {
     Factorial ms= new Factorial();
     ms.fact();
}
}


