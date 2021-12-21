
import java.util.Scanner;
public class dibujaruncuadrado {
	public static void dibujaralto (int alto, int ancho) {
		for (int i = 0; i < alto; i++) {
			System.out.println();
			for (int j = 0; j < ancho; j++) {
				System.out.print("*");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el valor para el alto");
		int alto=sc.nextInt();
		System.out.println("Introduce el valor para el ancho");
		int ancho=sc.nextInt();
		dibujaralto(alto, ancho);
		sc.close(); 
	}
	
}
