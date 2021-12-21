/*Rellena un array de 100 casillas con números aleatorios comprendidos 
*entre 1 y 100 (ambos incluidos). Posteriormente pide un valor al usuario 
*comprendido entre 1 y 100 (insiste en la lectura del valor hasta que el 
*número sea válido y esté comprendido entre 1 y 100) 
*y muestra en pantalla si el valor dado aparece en el array o no, 
*y si aparece indica en qué posiciones del array aparece.*/

import java.util.Scanner;
public class Ej4_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tam=100;
		int num=0;
		boolean match=false;
		String mensaje ="";
		int[] numeros=new int [tam];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)((Math.random()*100)+1);
		}
		do {
			System.out.println("escribe un numero que este comprendido ente 1 y 100");
			 num=sc.nextInt();
		} while (num<1 || num>100);
		System.out.println("numero buscado "+num);
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]==num) {
				match=true;
				mensaje+="esta en la posicion "+i;
				break;
			}
		}
		if (match) {
			System.out.println(mensaje);
		}else {
			System.out.println("el "+num+" que has puesto no esta");
	}
		System.out.println("final");
		
		sc.close();
	}

}
