
import java.io.*;

public class Chequera {
    public static void main (String args[])  throws IOException { 
        Cheque cheque = new Cheque();
        cheque.leerInformacion();
        cheque.imprimir();
        }
}