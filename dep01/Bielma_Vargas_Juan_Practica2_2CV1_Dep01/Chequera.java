
import java.io.*;

public class Chequera {
    public static void main (String args[])  throws IOException { 
        
        Informacion informacion = new Informacion();
        informacion.obtener();
        
        Cheque cheque = new Cheque();
        cheque.setNombre(informacion.getNombre());
        cheque.setCantidad(informacion.getCantidad());
        cheque.imprimir();

        informacion.destruir();
        informacion = null;

        cheque.destruir();
        cheque = null;

        System.gc();

        }
}