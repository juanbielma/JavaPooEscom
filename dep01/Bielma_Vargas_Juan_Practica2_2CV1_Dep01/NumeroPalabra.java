import java.text.DecimalFormat;

public class NumeroPalabra {

  private static final String[] decenas = {
    "",
    " diez",
    " veinte",
    " treinta",
    " cuarenta",
    " cincuenta",
    " sesenta",
    " setenta",
    " ochenta",
    " noventa"
  };

  private static final String[] numeros = {
    "",
    " uno",
    " dos",
    " tres",
    " cuatro",
    " cinco",
    " seis",
    " siete",
    " ocho",
    " nueve",
    " diez",
    " once",
    " doce",
    " trece",
    " catorce",
    " quince",
    " dieciseis",
    " diecisiete",
    " dieciocho",
    " diecinueve",
    " veinte",
    " veintiuno",
    " veintidos",
    " veintitres",
    " vienticuatro",
    " vienticinco",
    " vientiseis",
    " vientisiete",
    " vientiocho",
    " veintinueve",
  };

  private NumeroPalabra() {}

  private static String convertirMenorAMil(int numero) {
    String numeroPalabra = "";

    if (numero % 100 < 30){
      numeroPalabra = numeros[numero % 100];
      numero /= 100;
    }
    else {
      
      numeroPalabra = numeros[numero % 10];
      
      numero /= 10;


      numeroPalabra = numeroPalabra == "" ? decenas[numero % 10] : decenas[numero % 10] + " y " + numeroPalabra;
      numero /= 10;
    }
    if (numero == 0) return numeroPalabra;
    if(numero == 1) return numeroPalabra == "" ? "cien" : "ciento" + numeroPalabra;
    if(numero == 5) return "quinientos" + numeroPalabra;
    if(numero == 7) return "setecientos" + numeroPalabra;
    if(numero == 9) return "novecientos" + numeroPalabra;
    return numeros[numero] + "cientos" + numeroPalabra;
  }


  public static String convertir(double numero) {

    long pesos = (long)Math.floor( numero ) ;
    long centavos = (long)(Math.round(-1f * (numero - pesos ) * 100f) * -1f);

    return (convertir(pesos) + " punto " + convertir(centavos) + " MXN").toUpperCase();

  }

  public static String convertir(long numero){ 
    // 0 to 999 999 999 999
   if (numero == 0) { return "cero"; }

    String snumero = Long.toString(numero);

    // pad with "0"
    String mask = "000000000000";
    DecimalFormat df = new DecimalFormat(mask);
    snumero = df.format(numero);

    // XXXnnnnnnnnn
    int billions = Integer.parseInt(snumero.substring(0,3));
    // nnnXXXnnnnnn
    int millions  = Integer.parseInt(snumero.substring(3,6));
    // nnnnnnXXXnnn
    int hundredThousands = Integer.parseInt(snumero.substring(6,9));
    // nnnnnnnnnXXX
    int thousands = Integer.parseInt(snumero.substring(9,12));


    String tradBillions;
    switch (billions) {
    case 0:
      tradBillions = "";
      break;
    case 1 :
      tradBillions = "un billon ";
      break;
    default :
      tradBillions = convertirMenorAMil(billions)
      + " billones ";
    }
    String result =  tradBillions;

    String tradMillions;
    switch (millions) {
    case 0:
      tradMillions = "";
      break;
    case 1 :
      tradMillions = "un millon ";
      break;
    default :
      tradMillions = convertirMenorAMil(millions)
         + " millones ";
    }
    result =  result + tradMillions;

    String tradHundredThousands;
    switch (hundredThousands) {
    case 0:
      tradHundredThousands = "";
      break;
    case 1 :
      tradHundredThousands = "mil ";
      break;
    default :
      tradHundredThousands = convertirMenorAMil(hundredThousands)
         + " mil ";
    }
    result =  result + tradHundredThousands;

    String tradThousand;
    tradThousand = convertirMenorAMil(thousands);
    result =  result + tradThousand;

    // remove extra spaces!
    return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
  }

}