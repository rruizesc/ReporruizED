import java.util.Scanner;

public class ej5iterativo {

	public static void main(String[] args) {
		System.out.println("introduce un numero entero");
		Scanner num=new Scanner(System.in);
		int numero=num.nextInt();
		int cont=0;
			for(int i=1;i<numero;i++) {
				cont=numero%i;
				if(cont==0) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
			System.out.println("Fin del programa");
		num.close();
	}

}
