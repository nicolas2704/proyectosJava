package AO2TDP_Montuelle;

import java.io.*;

/* Mostrar por patalla el nombre y apellido de un usuario */
public class Persona {
    String nombre;
    int documento,edad;

    public static void main(String[] args) throws IOException {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        persona1.AsignarDatos();
        persona1.MostrarDatos();

        persona2.AsignarDatos();
        persona2.MostrarDatos();
    }

    public void AsignarDatos ()throws IOException{
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese el nombre de la persona");
        this.nombre=e.readLine();
        System.out.println("ingrese el numero de DNI de la persona");
        this.documento=Integer.parseInt(e.readLine());
        System.out.println("ingrese la edad de la persona");
        this.edad=Integer.parseInt(e.readLine());
    }
    public void MostrarDatos(){
        System.out.println("nombre: "+this.nombre+"\nDocumento: "+this.documento+"\nEdad: "+this.edad);
    }
}