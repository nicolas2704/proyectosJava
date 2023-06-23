package clase4;

import java.io.*;

public class Animal {
    String nombre, color, alimentacion, territorio;
    int edad;
    double peso;

    public static void main(String[] arg) throws IOException {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.CargarDatosAnimal();
        animal1.MostrarDatosAnimal();

        animal2.CargarDatosAnimal();
        animal2.MostrarDatosAnimal();
    }
    public void CargarDatosAnimal() throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese el nombre del animal");
        this.nombre = e.readLine();
        System.out.println("ingrese el color del animal");
        this.color = e.readLine();
        System.out.println("ingrese el tipo de alimentacion del animal");
        this.alimentacion = e.readLine();
        System.out.println("ingrese el territorio donde vive el animal");
        this.territorio=e.readLine();
        System.out.println("ingrese la edad del animal");
        this.edad = Integer.parseInt(e.readLine());
        System.out.println("ingrese el peso del animal");
        this.peso = Double.parseDouble(e.readLine());
    }
    public void MostrarDatosAnimal(){
    System.out.println("Nombre: "+this.nombre+"\nColor: "+this.color+"\nAlimentacion: "+this.alimentacion+"\nTerritorio: "+this.territorio+"\nEdad: "+this.edad+"\nPeso: "+this.peso);
    }
}