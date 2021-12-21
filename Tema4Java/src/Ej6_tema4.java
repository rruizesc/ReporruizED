/*Programa que genera los N primeros números de la serie de Fibonacci.
 * El valor N deberá ser leído por el teclado. 
 * NOTA: Los dos primeros números son 1, y el resto se obtiene sumando los dos anteriores: 1,1,2,3,5,8,13,21…*/

import java.util.Scanner;
public class Ej6_tema4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Escribe los numeros que quiere que aparezcan");
		int N=sc.nextInt();
		N=Math.abs(N);// por si escribe numeros negativos esto lo pasa a positivo
		int num=1;
		int num2=num;
		int num3=0;
		for (int i=0;i<N;i++) {
			System.out.print(num+" ");
			num3=num+num2;
			num=num2;
			num2=num3;
		}
		System.out.println();
		System.out.println();
		for (int i=1;i<=N;i++) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
