package AO2TDP_Montuelle;

import java.io.*;

public class sueldo {
    public static void main(String[] args) throws Exception {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        String nombre;
        int HT, cantidadTra;
        double SH, SS;
        SS = (double) 0;
        System.out.println("ingrese la cantidad de trabajadores");
        cantidadTra = Integer.parseInt(e.readLine());

        for (int i = 0; i < cantidadTra; i++) {
            System.out.println("ingrese el nombre del trabajador " + (i + 1));
            nombre = e.readLine();

            System.out.println("ingrese la cantidad de horas trabajadas");
            HT = Integer.parseInt(e.readLine());

            System.out.println("ingrese el sueldo que gana por hora");
            SH = Double.parseDouble(e.readLine());

            SS = (double) SH * HT;

            if (SS >= 0 && SS <= 150) {
                SS -= (double) (SS * 0.05);
            } else if (SS > 150 && SS < 300) {
                SS -= (double) (SS * 0.07);
            } else {
                SS -= (double) (SS * 0.09);
            }

            System.out.printf("el sueldo semanal del trabajador " + nombre + " es: %.2f %n ", SS);
        }
    }
}
