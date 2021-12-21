/*Realiza un programa que lea 44 números para posteriormente mostrarlos en orden descendente.*/
public class Ej8_Array {

		public static void mostrar(int[] miarray) {
			for (int i = 0; i < miarray.length; i++) {
				System.out.print(miarray[i]+" ");
			}
		}
		public static void main(String[] args) {
			int aux,tam=44;
			int[] datos=new int[tam];
			
			for (int i = 0; i < tam; i++) {
				datos[i]=(int)(Math.random()*100);
				
			}
			System.out.print("inicial");
			System.out.println();
			mostrar(datos);
			
			for(int i=0;i<tam-1;i++) {
				for (int j =i+1;j<datos.length ; j++) {
					if(datos[i]> datos[j]) {
						aux=datos[i];
						datos[i]=datos[j];
						datos[j]=aux;
					}
				}
			}
			System.out.println();
			System.out.println("ordenados");
			mostrar(datos);
			System.out.println();
			System.out.println("final");
		}


	}