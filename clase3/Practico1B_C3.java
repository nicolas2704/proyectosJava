package clase3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Ingresar por teclado tres pares de enteros. Calcular y mostrar el procducto, la suma y el cociente de los valores Ingresados. */
/* Raalice las opertaciones sin utilizar métodos*/

public class Practico1B_C3 {
    public static void main(String[] arg) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        int n1, n2;

        for (int i = 0; i <= 2; i++) {
            System.out.print("Ingrese el primer valor: ");
            n1 = Integer.parseInt(e.readLine());

            System.out.print("Ingrese el segundo valor: ");
            n2 = Integer.parseInt(e.readLine());

            /*------------------------------ */
            /*      Llamado a los métodos    */
            /*-------------------------------*/
            suma (n1, n2);
            System.out.println(producto(n1,n2));
            System.out.println("El cociente de " + n1 + " / " + n2 + " es igual a :" + cociente(n1,n2));
        }
    }

    /*----------------------------------------------------------*/
    /* Creamos un método suma() que no devuelve ningun valor    */
    /* la operación e impresion se hace desde el método         */
    /*----------------------------------------------------------*/
    public static void suma(int a, int b) {
        int suma = a+b;
        System.out.println("La suma de " + a + " + " + b + " es igual a :" + suma);
    }

    /*----------------------------------------------------------*/
    /* Creamos un método producto() que devuelve la cadena a    */
    /* a imprimir que se muestra desde el main                  */
    /*----------------------------------------------------------*/
    public static String producto(int a, int b) {
        int resultado = a*b;
        String cadena;
        cadena = "El producto de " + a + " + " + b + " es igual a :" + resultado;
        return cadena;
    }

    /*----------------------------------------------------------*/
    /* Creamos un método cociente() que devuelve un float que   */
    /* se imprime por pantalla desde el main                    */
    /*----------------------------------------------------------*/
    public static float cociente(int a, int b) {
        float resultado;
        resultado = (float) a/b;
        return resultado;
    }
}
