/**
* La clase ProbadorDeTipos tiene como atributos a cada uno de los
* diferentes tipos de datos existentes en el lenguaje Java y el
* método seleccionarTipoDeDato crea un menú que despliega la información
* relacionada con el desbordamiento de cada tipo de dato.
*/

public class Tipo{
	private byte b;
	private short s;
	private int i;
	private long l;
	private float f;
	private double d;
	private char c;
	private String str;
	private boolean bool;

	// constructores
    public Tipo(){
		this((byte)0,(short)0,0,0,0,0,'\0',"",false);
	}
	
    public Tipo(Tipo probador){
		this(probador.b, probador.s, probador.i, probador.l, probador.f, probador.d, probador.c, probador.str, probador.bool);
	}
	public Tipo(byte b, short s, int i, long l, float f, double d, char c, String str, boolean bool){
		this.b=b;
		this.s=s;
		this.i=i;
		this.l=l;
		this.f=f;
		this.d=d;
		this.c=c;
		this.str=str;
		this.bool=bool;
	}

	public void seleccionar(){
		
            System.out.println("\tPROBADOR DE TIPOS\n");
			mostrarTipo(b);
			mostrarTipo(s);
			mostrarTipo(i);
			mostrarTipo(l);
			mostrarTipo(f);
			mostrarTipo(d);
			mostrarTipo(c);
			mostrarTipo(str);
			mostrarTipo(bool);
            
        
	}
	public void mostrarTipo(byte byt){
		b=Byte.MIN_VALUE;//Para el tipo de dato byte, el límite de desbordamiento es de -128 para valores negativos
		byt=b;
		System.out.print("\tEl tipo de dato byte tiene un rango de "+byt);
		b=Byte.MAX_VALUE;//Para el mismo tipo de dato, el límite de desbordamiento es de 127 para valores positivos
		byt=b;
		System.out.println("\n\ta "+byt);
	}
	public void mostrarTipo(short sh){
		s=Short.MIN_VALUE;//Para el tipo de dato byte, el límite de desbordamiento es de -32768 para valores negativos
		sh=s;
		System.out.print("\n\tEl tipo de dato short tiene un rango de "+sh);
		s=Short.MAX_VALUE;//Para el mismo tipo de dato, el límite de desbordamiento es de 32767 para valores positivos
		sh=s;
		System.out.println("\n\ta "+sh);
	}
	public void mostrarTipo(int entero){
		i=Integer.MIN_VALUE;//Para el tipo de dato int, el límite de desbordamiento es de -2147483648 para valores negativos
		entero=i;
		System.out.print("\n\tEl tipo de dato int tiene un rango de "+entero);
		i=Integer.MAX_VALUE;//Para el mismo tipo de dato, el límite de desbordamiento es de 2147483647 para valores positivos
		entero=i;
		System.out.println("\n\ta "+entero);
	}
	public void mostrarTipo(long lo){
		l=Long.MIN_VALUE;//Para el tipo de dato long, el límite de desbordamiento es de -9223372036854775808 para valores negativos
		lo=l;
		System.out.print("\n\tEl tipo de dato long tiene un rango de "+lo);
		l=Long.MAX_VALUE;//Para el mismo tipo de dato, el límite de desbordamiento es de 9223372036854775807 para valores positivos
		lo=l;
		System.out.println("\n\ta "+lo);
	}
	public void mostrarTipo(float fl){
		f=Float.MIN_VALUE;//El rango de precisión mínimo no-cero para el tipo de dato float es 2^-149
		fl=f;
		System.out.print("\n\tEl tipo de dato float tiene un rango de precision de "+fl);
		f=Float.MAX_VALUE;//El rango de precisión máximo para el mismo tipo de dato es (2-2^-23)·2^127
		fl=f;
		System.out.println("\n\ta "+fl);
	}
	public void mostrarTipo(double doble){
		d=Double.MIN_VALUE;//El rango de precisión mínimo no-cero para el tipo de dato double es 2^-1074
		doble=d;
		System.out.print("\n\tEl tipo de dato double tiene un rango de precision de "+doble);
		d=Double.MAX_VALUE;//El rango de precisión máximo para el mismo tipo de dato es (2-2^-52)·2^1023
		doble=d;
		System.out.println("\n\ta "+doble);
	}
	public void mostrarTipo(char caracter){
		c=Character.MIN_VALUE;//Para el tipo de dato char, el valor "mínimo" es \u0000
		caracter=c;
		System.out.print("\n\tEl tipo de dato char tiene un rango de \'\\u0000\'("+caracter+")");
		c=Character.MAX_VALUE;//Para el mismo tipo de dato, el valor "máximo" es \uffff
		caracter=c;
		System.out.println("\n\ta \'\\uffff\'("+caracter+")");
	}
	public void mostrarTipo(String cadena){
		//El tipo de dato String puede contener el máximo valor del tipo de dato int en caracteres
		str="\n\tEl tipo de dato String puede albergar hasta "+Integer.MAX_VALUE+" caracteres.";
		cadena=str;
		System.out.println(cadena);
	}
	public void mostrarTipo(boolean bol){
		bool=false;//Uno de los dos posibles valores para el tipo de dato boolean es false
		bol=bool;
		System.out.print("\n\tLos dos valores posibles para el tipo de dato boolean son "+bol);
		bool=true;//El otro posible valor para boolean es true
		bol=bool;
		System.out.println("\n\ty "+bol);
	}
	public void destructor(){
		str=null;
		System.gc();
	}
}
