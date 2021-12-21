package arrays04B;

public class pruebas {

	public static void main(String[] args) {
//		String cads= new String("Java para principiantes");
//		String subcad=cads.substring(0, 4);
//		System.out.println(subcad);
		
		//iniciales
		System.out.println("hay "+args.length+" palabras");
		String salida="";
		
		System.out.println("iniciales");
		for (int i = 0; i < args.length; i++) {
			salida+=args[i].charAt(0);
		}
		System.out.println("las iniciales son "+salida);
	}

}
