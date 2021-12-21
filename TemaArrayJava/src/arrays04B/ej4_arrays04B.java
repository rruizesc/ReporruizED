package arrays04B;
/*Realiza un programa que cargue desde teclado una tabla de enteros de dimensión 3x4. 
* El programa mostrará la fila en la que la suma de sus elementos sea mayor.*/

import java.util.Scanner;
public class ej4_arrays04B {
	private static void mostrar(int[][] miarrays) {
		for (int i = 0; i < miarrays.length; i++) {
			for (int j = 0; j < miarrays[i].length; j++) {
			System.out.print(miarrays[i][j]+"\t");
			}
			System.out.println();
		}
	}
	private static int [][] crearmatrizN(int filas,int cols,int valor){
		int[][] matriz=new int[filas][cols];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=(int)(Math.random()*(valor+1));
			}
		}
		return matriz;
	}
	private static void verunafila(int quefila,int[][]mat) {
		if(quefila>=mat.length) {
			System.out.println("esa fila no existe");
		}else {
			for (int i = 0; i <mat[quefila].length; i++) {
				System.out.print(mat[quefila][i]+"\t");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
	int[][] tabla=crearmatrizN(3,4,100);
		mostrar(tabla);
		int suma,sumamayor=0,filamassuma=0;
		for (int i = 0; i < tabla.length; i++) {
			suma=0;
			for (int j = 0; j < tabla[i].length; j++) {
				suma+=tabla[i][j];
			}
			if(suma>sumamayor) {
				sumamayor=suma;
				filamassuma=i;
			}
		}
		System.out.println();
		System.out.println("la fila q mas suma es:");
		verunafila(filamassuma,tabla);
		System.out.println("que suma "+sumamayor);
	}

}
