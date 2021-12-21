/*Realiza un programa que lea desde teclado 10 números, pero que no permita introducir números repetidos. 
*El programa acabará cuando haya obtenido 10 números distintos que mostrará posteriormente en pantalla.*/

import java.util.Scanner;
public class Ej7_array {
	public static void mostrarArray(int[] miarray) {
		for (int i = 0; i < miarray.length; i++) {
			System.out.print(miarray[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tam=5;
		int[]numeros=new int[tam];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("introduce un numero");
			int num=sc.nextInt();
			numeros[i]=num;
			for (int j = 0; j < i; j++) {
				if(numeros[j]==num) {
					i--;
					break;
				}
			}
		}
		mostrarArray(numeros);	
		sc.close();
	}

}
