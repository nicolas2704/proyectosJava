package clase2;

/* Crear un Programa que lea dos números por teclado y muestre el resultado de la división del primer
número por el segundo. Se debe comprobar que el divisor no puede ser cero.*/
import java.io.*;

public class Practico2_C2 {
    public static void main(String[] args) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        String cd;
        int dividendo, divisor;
        double cociente;
        System.out.print("Introduzca el dividendo: ");
        /*Sumamos las Variables y la Mostramos por pantalla */
        cd = e.readLine();
        dividendo = Integer.parseInt(cd);
        System.out.print("Introduzca el divisor: ");
        cd = e.readLine();
        divisor = Integer.parseInt(cd);

        if (divisor <= 0){

            System.out.println("No se puede dividir por cero");
        }
        else {
            cociente =(double) dividendo / divisor;
            System.out.println(dividendo + " / " + divisor + " = " + cociente);
            System.out.printf(dividendo + " / " + divisor + "= "+"%.4f %n", cociente);
        }
    }
}
