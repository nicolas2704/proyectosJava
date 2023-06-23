
package clase1;

   /*Escribir un programa en java que permita ingresar su apellido, 
   nombre y edad. Mostrar por pantalla
   Variables:
   nombre: nombre
   tipo: string
   descripcion: el nombre del usuario

   nombre: apellido
   tipo: string
   descripcion: el apellido del usuario

   nombre: edad
   tipo: entero
   descripcion: el edad del usuario

   nombre: e
   tipo: lectura
   descripcion: guarda todo tipo de valor introducido por el usuario

   nombre: cd
   tipo: string
   descripcion: convierte el tipo inicial de la variable y la transforma a otra

   */
   
   import java.io.*;
   public class nombre_apellido_edad {
    public static void main(String[] arg) throws IOException {
        
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        String nombre, apellido, cd;
        int edad;
        System.out.print("ingrese el nombre del Usuario: ");
        nombre = e.readLine();
        System.out.print("ingrese el Apellido del Usuario: ");
        apellido = e.readLine();
        
        System.out.print("ingrese la edad del Usuario: ");
        cd=e.readLine();
        edad = Integer.parseInt(cd);
       
        System.out.println("El nombre de Usuario es "+nombre+" y su apellido es "+apellido+" y su edad es de "+edad+" años");
    } 
}