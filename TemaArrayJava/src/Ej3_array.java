/*Solicita las 20 notas con decimales de los alumnos de una clase. 
*Calcula y muestra la nota media obtenida por el grupo. 
*Muestra después cuántos alumnos tienen una nota superior o igual a la media. 
*Ayuda para redondear Math.rint(numero*cifras)/cifras; */

import java.util.Scanner;
public class Ej3_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tam=20;
		int contador=0;
		double [] numeros=new double [tam];
		double media=0;
		for (int i = 0; i < numeros.length; i++) {
		System.out.println("Dame la nota con decimales");
		numeros[i]=sc.nextDouble();
		media=media+numeros[i];
		}
		System.out.println("la nota media de los alumnos es: ");
		media=media/20;
		System.out.print(media);
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]>=media){
				contador++;
			}
		}
		sc.close();
		System.out.println(contador+" alumnos tienen una nota superior o igual a la media");
	}

}
