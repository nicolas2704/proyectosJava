package clase3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Ingresar por teclado tres pares de enteros. Calcular y mostrar el procducto, la suma y el cociente de los valores Ingresados. */
/* Raalice las opertaciones sin utilizar métodos*/

public class Practico1A_C3 {
    public static void main(String[] arg) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        int n1, n2, suma, producto;
        float cociente;

        for (int i = 0; i <= 2; i++) {
            
            System.out.print("Ingrese el primer valor: ");
            n1 = Integer.parseInt(e.readLine());

            System.out.print("Ingrese el segundo valor: ");
            n2 = Integer.parseInt(e.readLine());
            

            suma = n1 + n2;
            producto = n1 * n2;
            System.out.println("La suma de " + n1 + " + " + n2 + " es igual a :" + suma);
            System.out.println("La producto de " + n1 + " x " + n2 + " es igual a :" + producto);

             if (n2==0)
            System.out.println("el numero debe ser distinto de cero");
            else{
                cociente = (float) n1 / n2;
                System.out.println("El cociente de " + n1 + " / " + n2 + " es igual a :" + cociente);
            }
            
        }

    }
}
