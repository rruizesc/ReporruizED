public class Password {
	private int longitud;
	private String clave;
	static final String letras = "qwertyuiopasdfghjklñzxcvbnm";
	static final String numeros = "0123456789";
	static final String especiales = "!·$%&/()=?¿";
	static final String todos= "0123456789qwertyuiopasdfghjklñzxcvbnm!·$%&/()=?¿";
	
	public Password() {
		this.longitud = 8;
		this.clave = GenerarPassword();
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.clave = GenerarPassword();
	}

	public String getpassword(){
	return clave;
	}
	
private String GenerarPassword() {
String cadena = "";
int num = 0, esp = 0, letr = 0;

for (int i = 0; i < 5; i++) {
int random = (int) (Math.random() * numeros.length());
cadena += numeros.charAt(random);
}
for (int i = 0; i < 2; i++) { //extraemos dos letras mayusculas
int random = (int) (Math.random() * letras.length());
cadena += letras.charAt(random);
}
cadena = cadena.toUpperCase();
int random = (int) (Math.random() * letras.length());//extraemos 1 letra minuscula
cadena += letras.substring(random, random + 1);
for (int i = 0; i < (longitud-8); i++) { //los caracteres especiales que falten
int random2 = (int) (Math.random() * especiales.length());
cadena += especiales.charAt(random2);
}
cadena=cadena.substring(0,longitud);
return cadena;
}

	@Override
	public String toString() {
//		String salida="";
//		for (int i = 0; i < numalum; i++) {
//			salida+=mipass[i].getClave()+" "+fortaleza[i]+"\n";
//		}
//		return salida;
		return "Password [longitud=" + longitud + ", clave=" + clave + "]";
	}
}