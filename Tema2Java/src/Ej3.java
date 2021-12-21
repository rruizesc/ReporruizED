import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		System.out.println("Escribe un numero entero");
		Scanner enter=new Scanner(System.in);
		int n=enter.nextInt();
		if((n+1)%3==0	||	(n-1)%3==0){
			System.out.println(n+" no es multiplo de 3");
		}else {
			System.out.println(n+" es multiplo de 3");
		}
		System.out.println("Fin de programa");
		enter.close();
	}
}