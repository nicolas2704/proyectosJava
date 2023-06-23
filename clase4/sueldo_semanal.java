package clase4;

import java.io.*;

public class sueldo_semanal {
    public static void main(String[] args) throws Exception {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        String nombre;
        int HT, cantidadTra;
        double SH,SS;
        SS = (double) 0;
        System.out.println("ingrese la cantidad de trabajadores");
        cantidadTra = Integer.parseInt(e.readLine());

        while (cantidadTra > 0) {
            System.out.println("ingrese el nombre del trabajador");
            nombre = e.readLine();

            System.out.println("ingrese la cantidad de horas trabajadas");
            HT = Integer.parseInt(e.readLine());

            System.out.println("ingrese el sueldo que gana por hora");
            SH = Double.parseDouble(e.readLine());

            SS=(double)SH*HT;

            if (SS>=0 && SS<=160){
                SS-=(double)(SS*0.05);
            } else if (SS>150 && SS<300){
                SS-= (double) (SS*0.07);
            } else{
                SS-=(double) (SS*0.09);
            }

            System.out.printf("el sueldo semanal del trabajador "+nombre+" es: %.2f %n ",SS);
            cantidadTra--;
        }

    }
}
