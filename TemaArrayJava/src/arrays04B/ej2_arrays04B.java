package arrays04B;

public class ej2_arrays04B {
	public static void mostrar(int[][] miarrays) {
		for (int i = 0; i < miarrays.length; i++) {
			for (int j = 0; j < miarrays[i].length; j++) {
			System.out.print(miarrays[i][j]+"\t");
			}
			System.out.println();
		}
	}
		public static void main(String[] args) {
			int filas=5, cols=7,num=35,numaux=0;
			int [][]Datos= new int[filas][cols];
			
//Version 1
			for (int i = 0; i < Datos.length; i++) {
				for (int j = 0; j < Datos[i].length; j++) {
					Datos[i][j]=(num-i)-(j*filas);
					System.out.print(Datos[i][j]+"\t");
				}
				System.out.println();
			}	
			
//Version2
//			for (int k = 0; k < cols; k++) {
//				for (int k2 = 0; k2 < filas; k2++) {
//					Datos[k2][k]=num;
//					num--;
//				}
//			}
//			mostrar(Datos);
			
//Version3
//			for (int i = 0; i < filas; i++) {
//				numaux=num;
//				for (int j = 0; j < cols; j++) {
//					Datos[i][j]=numaux;
//					numaux-=5;
//				}
//				num--;
//			}
//			mostrar(Datos);
		}
	}
