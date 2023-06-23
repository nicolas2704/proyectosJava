package clase2;

/* Hacer un programa que permita ingresar dos enteros y obtenga y muestre el Mayor */
import java.io.*;

public class Practico3_C2 {
    public static void main(String[] arg) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        String cd;
        int num1, num2;
        System.out.println("ingrese el valor del primer numero");
        cd = e.readLine();
        num1 = Integer.parseInt(cd);
        System.out.println("ingrese el valor del segundo numero");
        cd = e.readLine();
        num2 = Integer.parseInt(cd);

        if (num1 == num2)
            System.out.println("los numeros son iguales");
        else if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else
            System.out.println(num2 + " es mayor que " + num1);
    }
}