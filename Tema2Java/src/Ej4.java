import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		System.out.println("Escribe un booleano");
		Scanner enter=new Scanner(System.in);
		Boolean n=enter.nextBoolean();
		Boolean no=enter.nextBoolean();
/*		if (n && !no || !n && no) {
			System.out.println("si que siguen una cadena de "+n+" "+no);
		}else{
			System.out.println("no siguen una secuencia true/false");
		}*/
		if (n!=no) {
			System.out.println("si que siguen una cadena de "+n+" "+no);
		}else {
			System.out.println("no siguen una secuencia true/false");
		}
		System.out.println("Fin de programa");
		enter.close();
	}
}
