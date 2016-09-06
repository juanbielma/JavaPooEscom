/**
   * La clase ErrorDeDesbordamiento implemente un applet
   * que muestra dos números, uno positivo y uno negativo
   * en pantalla
*/
  import java.awt.*;
  import java.applet.*;

 public class ErrorDeDesbordamiento extends Applet
 {
   private Resultado resultado;

    public void init(){
      resultado = new Resultado();
      resultado.setPositivo(500000000000000L + 5000000000000L);
      resultado.setNegativo(-2 - 2000000000000L);
    }
  
  public void paint (Graphics g)
  {
    g.drawString("positivo contiene: " + resultado.getPositivo(), 5, 25);
    g.drawString("negativo contiene: " + resultado.getNegativo(), 5, 40);
  }
 
 }

