public class Validacion{
  private boolean valido;

  public boolean isNumeric(String str) {
        valido = (str.matches("[+-]?\\d*(\\.\\d+)?") && str.equals("")==false);
        return valido;
    }

}