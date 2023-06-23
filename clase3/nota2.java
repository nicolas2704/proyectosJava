package clase3;
/* 
Cargar N notas de alumnos y al finalizar mostrar cantidad de notas cargadas y el promedio.
El ciclo finaliza cuando ponemos 0.
*/

import java.io.*;

public class nota2 {
    public static void main(String[] args) throws Exception {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        int cantidadNotas = 0, nota, acumNotas = 0;
        float promedio;

        System.out.print("Ingrese una nota: ");
        nota = Integer.parseInt(e.readLine());
        while (nota != 0) {
            acumNotas += nota;
            cantidadNotas++;
            System.out.print("Ingrese otra nota: ");
            nota = Integer.parseInt(e.readLine());
        }

        if (cantidadNotas == 0) {
            System.out.println("No se puede calcular el promedio");
          } else {
            promedio = (float) acumNotas / cantidadNotas;
            System.out.print("El promedio es: " + promedio);
        }
    }
}
