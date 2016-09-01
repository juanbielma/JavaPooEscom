public class Resultado{
    private int positivo;
    private int negativo;

    public Resultado(){}

    public void setPositivo(long numero){
        positivo = (int) numero;
    }
    
    public void setNegativo(long numero){
        negativo = (int) numero;
    }

    public int getPositivo(){
        return positivo;
    }

    public int getNegativo(){
        return negativo;
    }
}