import java.applet.*;
import java.awt.*;

/**
 * La clase HolaMundoApplet implementa un applet que
 * desplirga "Hola Mundo Java en Applet!".
 */
public class HolaMundoApplet extends Applet {
    private String mensaje;

        public void init(){
         mensaje = "Hola Mundo Java en Applet!";
        }

        public void paint( Graphics g ) {
            // Despliega en un entorno grafico "Hola Mundo Java en Applet!"
            g.drawString(msj, 50, 25 );
            
        }

}
