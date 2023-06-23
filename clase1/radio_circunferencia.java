package clase1;

/*Escribir programa que lea por teclado el valor del radio de una circunferencia
, calcule y muestre por pantalla la longitud y el área de la circunferencia. 
(Tener en cuenta el tipo de variable a utilizar).
   Variables:
   nombre: radio
   tipo: double
   descripcion: el valor del radio de la circunferencia

   nombre: LongCirc
   tipo: double
   descripcion: el valor del longitud de la circunferencia se vera alterado
   valor inicial: 0
   valor final: resultado de 2 * pi * radio

   nombre: Pi
   tipo: double
   descripcion: valor constante del numero Pi
   valor inicial: 3.1416

   nombre: area
   tipo: double
   descripcion: el valor del area de la circunferencia se vera alterado
   valor inicial: 0
   valor final: area = pi * radio * radio

   nombre: e
   tipo: lectura
   descripcion: guarda todo tipo de valor introducido por el usuario

   nombre: cd
   tipo: string
   descripcion: convierte el tipo inicial de la variable y la transforma a otra

   */

import java.io.*;
public class radio_circunferencia {
    public static void main(String[] args)throws IOException  {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        String cd;
        double radio, longCirc, area;
        final double pi = (double) 3.1416;
        System.out.print("ingrese el radio de la circunferencia: ");
        cd = e.readLine();
        radio = Double.parseDouble(cd);

        longCirc = 2 * pi * radio;
        area = pi * radio * radio;

        //longCirc = 2 * Math.PI * radio;
        //area = Math.PI * Math.pow(radio, 2);
        System.out.println("Longitud de la circunferencia -> " + longCirc);
        System.out.println("Area de la circunferencia -> " + area);
    }
}
