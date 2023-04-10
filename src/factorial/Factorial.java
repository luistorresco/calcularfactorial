/*
hacer un programa que lea un numero entero positivo y luego imprima su factorial 
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author luistorresco
 */
public class Factorial {

    /**
   
     */
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        double fact=1;
        int n;
        //lectura para factorial 
        System.out.println("digite numero entero positivo ");
        n=objread.nextInt();
        //generar factorial 
        
        for (int i = 2; i <=n; i++) {
            fact*=i;
        }
        System.out.println("\n el factorial de " + n + "es " + fact);
    }
    
}
