public class HolaPlanetas
{
    public static void main (String[] args)
    {
        Mensaje mensaje = new Mensaje();
        mensaje.setMensaje("\007\007\007Hola Mundo nuevamente" + " en todos los planetas\010");
        mensaje.imprimir();

    }
}
