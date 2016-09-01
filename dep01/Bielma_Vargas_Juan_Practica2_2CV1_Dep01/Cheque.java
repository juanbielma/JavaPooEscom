import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Cheque
{

    private String nombre;
    private double cantidad;
    private String banco;
    private Date fecha;
    private String fechaFormateada;
    private static DateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy");

    public Cheque(){
        nombre = "Juan Bielma";
        cantidad = 10;
        banco = "Banco Patito de Mexico";
        fecha = new Date();
        fechaFormateada = dateFormatter.format(fecha);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public double getCantidad(){
        return cantidad;
    }

    public String getBanco(){
        return banco;
    }

    public Date getFecha(){
        return fecha;
    }

    public String getFechaFormateada(){
        return fechaFormateada;
    }

    public void leerInformacion() throws IOException
    {
        String entradaUsuario = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dame tu nombre: ");
        nombre = br.readLine();
        System.out.println("Dame la cantidad: ");

        while (!Validacion.isNumeric(entradaUsuario)){
            entradaUsuario = br.readLine();
            if (Validacion.isNumeric(entradaUsuario))
                cantidad = Double.parseDouble(entradaUsuario);
            else
                System.out.println ("Entrada no válida, no introdujo un número");


        }

    }

    public void imprimir(){

        System.out.print("\033[H\033[2J");
        System.out.println("\n" + banco + "\t\t\t\t\t\t\t\tFecha:" + fechaFormateada);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad c/letra: " + NumeroPalabra.convertir(cantidad) + " \t$" + cantidad );

        System.out.println("\nFirma:_________________");
    }

}
