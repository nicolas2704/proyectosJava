package clase1;

/*Escribir un programa que lea una cantidad de grados centígrados
 y la pase a grados Fahrenheit.
   Variables:
   nombre: grados
   tipo: entero
   descripcion: grados ingresados por el usuario

   nombre: grados convertidos
   tipo: entero
   descripcion: grados ingresador por el usuario con nuevo valor a Fahrenheit

   nombre: e
   tipo: lectura
   descripcion: guarda todo tipo de valor introducido por el usuario

   nombre: cd
   tipo: string
   descripcion: convierte el tipo inicial de la variable y la transforma a otra

   */

import java.io.*;

public class grados_a_convertir {
    public static void main(String[] arg) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        String cd;
        int grados, grados_convertidos;

        System.out.print("introducir la cantidad de grados a convertir");
        cd = e.readLine();
        grados=Integer.parseInt(cd);
        grados_convertidos=Integer.parseInt(cd);
        grados_convertidos=(int)(grados*1.8)+32;

        System.out.println(grados+" centigrados son: "+grados_convertidos+ " grados Fahrenheit");
    }

}
