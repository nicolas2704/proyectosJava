
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello, World!");
        int cd;
        System.out.println("cambio de variable");
        cd=Integer.parseInt(e.readLine());
        System.out.println("la variable es"+cd);
    }
}
