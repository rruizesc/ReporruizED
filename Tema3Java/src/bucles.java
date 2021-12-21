import java.util.Scanner;

public class bucles {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=teclado.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.println(numero+" "+i+" ="+(numero*i));
		}
	teclado.close();
	}
}
