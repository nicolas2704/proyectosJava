package AO2TDP_Montuelle;

import java.io.*;

public class dosEnteros {
    public static void main(String[] args) throws Exception {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        int a, b;

        System.out.println("ingrese el valor de a");
        a = Integer.parseInt(e.readLine());

        System.out.println("ingrese el valor de b");
        b = Integer.parseInt(e.readLine());

        if (a == b) {
            System.out.println("a y b son iguales.Su suma es: " + sumaEntera(a, b));
        } else if (a < b) {
            System.out.println("a es menor a b y su producto es: " + sumaProducto(a, b));
        } else {
            divisionResta(a, b);
        }

    }

    public static int sumaProducto(int p1, int p2) {
        int ProdFinal = 0;
        for (int i = 0; i < p2; i++) {
            ProdFinal += p1;
        }
        return ProdFinal;
    }

    public static int sumaEntera(int n1, int n2) {
        int suma;
        suma = n1 + n2;
        return suma;

    }

    public static void divisionResta(int dividendo, int divisor) {
        int cociente = 0, resto;
        resto = dividendo;
        while (resto >= divisor) {
            resto -= divisor;
            cociente++;
        }
        System.out.println("el cociente de la division es:" + cociente);
        System.out.println("el resto de la division es:" + resto);

    }
}