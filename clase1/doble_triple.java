package clase1;

   /*Escribir un programa en java que permita ingresar el Nombre del Usuario, 
   un número entero. Mostrar por pantalla "Bienvenido "el nombre del usuario, 
   el doble y el triple del entero ingresado por teclado, en líneas separadas.
   Variables:
   nombre: nombre
   tipo: string
   descripcion: el nombre del usuario

   nombre: entero
   tipo: entero
   descripcion: el numero que ingresa el usuario

   nombre: doble
   tipo: entero
   descripcion: el doble del numero que ingreso el usuario

   nombre: triple
   tipo: entero
   descripcion: el triple del numero que ingreso el usuario

   nombre: e
   tipo: lectura
   descripcion: guarda todo tipo de valor introducido por el usuario

   nombre: cd
   tipo: string
   descripcion: convierte el tipo inicial de la variable y la transforma a otra

   */

import java.io.*;

public class doble_triple {
    public static void main(String[] arg)throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        String nombre, cd;
        int entero,doble,triple;

        System.out.print("introducir el nombre de Usuario ");
        nombre= e.readLine();

        System.out.print("Introduzca un numero entero ");
        cd=e.readLine();
        entero=Integer.parseInt(cd);
        doble=Integer.parseInt(cd);
        triple=Integer.parseInt(cd);

        doble= (int)entero*2;
        triple= (int) entero*3;

        System.out.println("Bienvenidos "+ nombre);
        System.out.println("el doble del numero ingresado es: "+doble);
        System.out.println("el triple del numero ingresado es: "+triple);
    }
}
