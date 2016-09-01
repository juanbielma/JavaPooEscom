public class Probador
{
	public static void main(String[] args)
	{
		Tipo probador=new Tipo();
		probador.seleccionar();
		probador.destructor();
		System.gc();
	}
}