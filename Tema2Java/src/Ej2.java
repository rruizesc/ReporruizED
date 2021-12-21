import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		System.out.println("Escribe tu nombre");
		Scanner enter=new Scanner(System.in);
		String nom=enter.next();
		System.out.println("Hola "+nom+" Encantado de conocerte");
		System.out.println("Fin de programa");
		enter.close();
	}
}