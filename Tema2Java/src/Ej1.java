import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		System.out.println("Escribe un numero entero");
		Scanner enter=new Scanner(System.in);
		int en=enter.nextInt();
		
		if(en%2==0) {
			System.out.println(en+" Es un numero par");
	}else {
		System.out.println(en+" Es un numero impar");
	}
		System.out.println("Fin de programa");
		enter.close();
	}
}
