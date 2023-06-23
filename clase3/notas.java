package clase3;

    import java.io.*;

public class notas {
    public static void main(String[] args) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        int cantidadNotas,notas,acumNotas=0;
        float promedio;

        System.out.println("ingrese la cantidad de notas");
        cantidadNotas= Integer.parseInt(e.readLine());

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("ingrese la nota " +(i+=1)+ " :");
            notas= Integer.parseInt(e.readLine());
            acumNotas+=notas;          
        }
        promedio=(float) acumNotas/cantidadNotas;
        System.out.println("el promedio es: "+promedio);
    }
}
