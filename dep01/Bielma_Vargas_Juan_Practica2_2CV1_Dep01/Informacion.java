import java.io.*;
import java.util.*;

public class Informacion{
    private String nombre;
    private double cantidad;

    public Informacion(){
        this("", 0d);
    }

    public Informacion(String nombre, double cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void obtener() throws IOException {
        String entradaUsuario = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dame tu nombre: ");
        nombre = br.readLine();
        System.out.println("Dame la cantidad: ");

        Validacion validacion = new Validacion();

        while (!validacion.isNumeric(entradaUsuario)){
            entradaUsuario = br.readLine();
            if (validacion.isNumeric(entradaUsuario))
                cantidad = Double.parseDouble(entradaUsuario);
            else
                System.out.println ("Entrada no válida, no introdujo un número");
        }

        validacion = null;
        entradaUsuario = null;
        br = null;
        System.gc();

    }

    public String getNombre(){
        return nombre;
    }

    public double getCantidad(){
        return cantidad;
    }

    public void destruir(){
        nombre = null;
        System.gc();
    }

}