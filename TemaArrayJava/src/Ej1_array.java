/*Realiza un programa que lea desde teclado 10 números enteros, para posteriormente
mostrarlos en el orden inverso al que fueron introducidos.*/
import java.util.Scanner;

public class Ej1_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] numeros=new int[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("introduce un numero");
			numeros[i]=sc.nextInt();
		}
		for (int i = numeros.length-1; i>-1; i--) {
			System.out.println(numeros[i]);
		}
		
		sc.close();
	}

}
