import javax.swing.JOptionPane;

/**
 * imprime a pantalla "Hola Mundo Java!" con la salida estandar.
 */
public class HolaMundoApp {
    public static void main(String[] args) {
        
        Mensaje mensaje = new Mensaje();
        mensaje.setMensaje("Hola Mundo Java!");
        mensaje.imprimir();

    }
}
