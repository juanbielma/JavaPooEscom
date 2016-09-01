/**
* La clase Mensaje tiene un atributo mensaje y un metodo que lo imprime
**/
public class Mensaje {
    private String mensaje;
    
    //metodo que imprime la variable msj
    public void imprimir(){
        System.out.println(mensaje);
    }
    //Getter para la variable msj
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
}