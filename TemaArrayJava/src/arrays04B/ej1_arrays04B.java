package arrays04B;

/*Realiza un programa que cargue desde teclado una tabla bidimensional de 3x2 de números enteros. 
*Posteriormente el programa pedirá un número a buscar, y en caso de encontrarlo indicará 
*el número de fila y columna donde se ha encontrado por primera vez. 
*El programa ofrecerá al usuario la opción de seguir buscando más números.*/
import java.util.Scanner;

public class ej1_arrays04B {
	private static int [][] arrayB (int filas,int columnas, int min, int max){
	int[][]miarray=new int[filas][columnas];
		for (int i = 0; i < miarray.length; i++) {
			for (int j = 0; j < miarray[i].length; j++) {
				miarray[i][j]=(int)(Math.random()*(max-min+1)+min);
			}
		}
	return miarray;
	}
	public static void mostrar(int[][] miarrays) {
		for (int i = 0; i < miarrays.length; i++) {
			for (int j = 0; j < miarrays[i].length; j++) {
			System.out.print("El array ["+i+"] ["+j+"] "+miarrays[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int [][] array1=arrayB(3,2,0,100);
		mostrar(array1);
		
		boolean encontrado=false,seguir=true;
		int filas=0,cols=0;
		do {
			System.out.println("Dame un numero a buscar");
			int num=sc.nextInt();
			filas=-1;
			cols=-1;
			encontrado=false;
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array1[i].length; j++) {
					if(array1[i][j]==num) {
						encontrado=true;
						filas=i;
						cols=j;
						break;
					}
					if(encontrado) {
						break;
					}
				}
			}
			if(encontrado) {
				System.out.println("El valor "+num+" esta posicionado en la fila:"+filas+" y en la columna:"+cols);
			}else {
				System.out.println("El valor "+num+" no estaba");
			}
			System.out.println("Seguir buscando valores?");
			seguir=sc.nextBoolean();
		} while (seguir);
		sc.close();
	}

}
