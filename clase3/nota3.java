package clase3;

import java.io.*;

public class nota3 {
    public static void main(String[] args) throws Exception {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        int cantidadNotas = 0, nota, acumNotas = 0;
        float promedio;

        do {
            System.out.print("Ingrese una nota: ");
            nota = Integer.parseInt(e.readLine());
            if (nota != 0){
                acumNotas += nota;
                cantidadNotas++;
            }else
             System.out.println("No se puede calcular el promedio");
        } while (nota != 0);
            promedio = (float) acumNotas / cantidadNotas;
            System.out.print("El promedio es: " + promedio);
        }
    }
