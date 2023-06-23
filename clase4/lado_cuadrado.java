package clase4;
import java.io.*;

public class lado_cuadrado {
    public static void main(String[] args) throws Exception {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        int lado;

        System.err.println("ingrese el valor del lado del cuadrado");
        lado=Integer.parseInt(e.readLine());

        System.out.println("el perimetro del cuadrado es: "+PerimetroCuadrado(lado));
        SuperficieCuadrado(lado);
    }

    public static int PerimetroCuadrado(int lado1){
        int perimetro;
        perimetro=lado1+lado1+lado1+lado1;
        return perimetro;
    }

    public static void SuperficieCuadrado(int lado2){
        int superficie;
        superficie=lado2*lado2;
        System.out.println("la superfice del cuadrado es: "+superficie);
    }
}