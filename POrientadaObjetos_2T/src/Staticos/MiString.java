package Staticos;

public class MiString {
	public static String alReves(String cadena) {
		int num=cadena.length();
		String cadenareversa="";
		for (int i =num-1; i >= 0; i--) {
			cadenareversa+=cadena.charAt(i);
		}
		return cadenareversa;
	}
	
	public static String limpiaCaracteres(String cadena, String limpia) {
		String[] salida=cadena.split(limpia);
		String cadenafinal="";
		for (int i = 0; i < salida.length; i++) {
			cadenafinal+=salida[i];
		}
		return cadenafinal;
	}
	
	public static String quitaTildes(String cad) {
		String cadena=cad.toLowerCase();
		String cadenasintildes="";
		String contildes="αινσϊ";
		String sintildes="aeiou";
		int pos;
		for (int i = 0; i < cadena.length(); i++) {
			pos=(contildes.indexOf(cadena.charAt(i)));
		if(pos>-1) {//encontrado
			cadenasintildes=cadenasintildes+sintildes.charAt(pos);
		}else {//no encontrado
			cadenasintildes+=cadena.charAt(i);
		}
		}
		
		return cadenasintildes;	
	}
	public static boolean esPalindromo(String cadena) {
		int ini=0;
		int fin=cadena.length()-1;
		boolean borr=true;
		while ((ini<fin) && (borr)) {
			if(cadena.charAt(ini)==cadena.charAt(fin)) {
				ini++;
				fin--;
			}else {
				borr=false;
			}
		}
		return borr;
	}
	public static boolean esNumero(String cadena) {
		char c;
		int num=0;
		int repite=0;
		boolean numero=true;
		for (int i = 0; i < cadena.length(); i++) {
			c=cadena.charAt(i);
			num=(int)c;
			if (num>=48 && num<=57 || num==45 || num==46 || num==43){			
				numero=true;
				if(num==45 || num==46 || num==43) {
					repite++;
				}
			}	else if(num<=47 && num>=58 || num!=45 || num!=46 || num!=43 ) {
					numero=false;
				}
			if (repite!=0 && repite>1) {
				return false;
			}
			}
		return numero;
	}
}
