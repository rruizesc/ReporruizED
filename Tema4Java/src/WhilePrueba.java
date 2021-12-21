import java.util.Scanner;

public class WhilePrueba {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num, contador=0, suma=0;
		while(suma<100) {
			System.out.println("introduce un numero");
			num=teclado.nextInt();
			contador++;
			suma+=num;
			System.out.println(num);
			System.out.println("la suma acumulada es "+suma);
			System.out.println("con "+contador+" numeros");
		}
		teclado.close();
	}

}
