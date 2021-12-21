/*ix.Dado un array de 10 posiciones numérico enteras:
  • Rellénalo de números aleatorios comprendidos entre 1 y 100 (ambos incluidos)
  • Muestra su contenido en una línea de pantalla.
  • Ordénalo de menor a mayor utilizando un algoritmo de ordenación.
  • Muestra su contenido actual en una línea de pantalla.
  • Ordénalo de mayor a menor sin utilizar un algoritmo de ordenación.
  • Muestra su contenido actual en una línea de pantalla.*/
public class Ej9_Array {

	public static void mostrar(int[] miarray) {
		for (int i = 0; i < miarray.length; i++) {
			System.out.print(miarray[i]+" ");
		}
	}
	private static int[] copiar(int[] original) {
		int[] copia=new int[original.length];
		for(int i=0;i<copia.length;i++) {
			copia[i]=original[i];
		}
		return copia;
	}
	private static void buscamayor(int[] miarray, int inicial, int fin) {
		//Entre los indices en los q buscamos el mayor valor
		int aux,posicion=inicial,mayor=miarray[inicial];
		for(int i=(inicial+1);i<=fin;i++) {
			if (mayor<miarray[i]) {
				mayor=miarray[i];
				posicion=i;
			}
			//intercambio
			aux=miarray[inicial];
			miarray[inicial]=miarray[posicion];
			miarray[posicion]=aux;
			System.out.println(miarray[i]+" ");
		}
	}
	public static void main(String[] args) {
		int aux,tam=10;
		int[] datos=new int[tam];
		
		for (int i = 0; i < tam; i++) {
			datos[i]=(int)((Math.random()*100)+1);
			
		}
		System.out.print("inicial");
		System.out.println();
		mostrar(datos);
		int[] segundo=copiar(datos);
		//ordenar de menor a mayor
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
		System.out.println("ordenados de menor a mayor");
		mostrar(datos);
		System.out.println();
		System.out.println("final");
		
	}


}