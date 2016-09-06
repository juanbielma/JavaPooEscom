import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Cheque
{
    private static final DateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy");

    private String nombre;
    private double cantidad;
    private String banco;
    private Date fecha;
    private String fechaFormateada;
    

    public Cheque(String nombre, double cantidad, String banco, Date fecha){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.banco = banco;
        this.fecha = fecha;
        fechaFormateada = dateFormatter.format(fecha);
    }

    public Cheque(){
        this("",0,"Banco Patito de México",new Date());
    }

    public Cheque(Cheque cheque){
        nombre = cheque.nombre;
        cantidad = cheque.cantidad;
        banco = cheque.banco;
        fecha = cheque.fecha;
        fechaFormateada = cheque.fechaFormateada;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    
    public void imprimir(){

        NumeroPalabra numeroPalabra = new NumeroPalabra();

        System.out.print("\033[H\033[2J");
        System.out.println("\n" + banco + "\t\t\t\t\t\t\t\tFecha:" + fechaFormateada);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad c/letra: " + numeroPalabra.convertir(cantidad) + " \t$" + cantidad );

        System.out.println("\nFirma:_________________");

        numeroPalabra.destruir();
        numeroPalabra = null;

        System.gc();
    }

    public void destruir(){
        nombre = null; 
        fecha = null;
        System.gc();
    }

}
