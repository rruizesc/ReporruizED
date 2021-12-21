package arrays04B;

public class ej3_arrays04B {
	public static void mostrar(int[][] miarrays) {
		for (int i = 0; i < miarrays.length; i++) {
			for (int j = 0; j < miarrays[i].length; j++) {
			System.out.print("El array ["+i+"] ["+j+"] "+miarrays[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int filas=5,cols=5;
		int [][]Datos= new int[filas][cols];
		for (int i = 0; i < Datos.length; i++) {
			for (int j = 0; j < Datos[i].length; j++) {
				Datos[i][j]=(i*5)+(j+1);
				System.out.print(Datos[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Transpuesta");
		System.out.println();
		for (int i = 0; i < Datos.length; i++) {
			for (int j = 0; j < Datos[i].length; j++) {
				Datos[i][j]=(i*5)+(j+1);
		System.out.print(Datos[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
