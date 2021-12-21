package arrays04B;

public class arraysmultidimensionales {

	public static void main(String[] args) {
		//un array de dos campos 3 filas por 4 columnas en cada fila
		int [][]Datos= new int[3][4];
		for (int i = 0; i < Datos.length; i++) {
			for (int j = 0; j < Datos[i].length; j++) {
				Datos[i][j]=(i*4)+j+1;
				System.out.print(Datos[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
