import java.util.Scanner;

public class While_2ej {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int ant=1,sig=0;
			System.out.println("introduce un numero");
			 ant=teclado.nextInt();
			System.out.println("introduce un numero");
			sig=teclado.nextInt();
			while(ant!=sig) {
				ant=sig;
				System.out.println("introduce numero");
				sig=teclado.nextInt();
			}
		teclado.close();
	}

}