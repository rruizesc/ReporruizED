/*Dado un array de 10 casillas relleno con números
*aleatorios comprendidos entre 1 y 10 (ambos incluidos). */
public class Ej5_array {
	//metodo para mostrar el array en una linea
	public static void mostrarArray(int[] miarray) {
		for (int i = 0; i < miarray.length; i++) {
			System.out.print(miarray[i]+" ");
		}
	}
	//metodo para buscar el menor en el array
	public static int buscamenor(int[] miarray) {
		int menor=miarray[0];
		for (int i = 1; i < miarray.length; i++) {
			if(miarray[i]<menor) {
				menor=miarray[i];
			}
		}
		return menor;
	}
	
	public static void main(String[] args) {
		int tam=10;
		int aux=0;
		int[] numeros =new int[tam];
		for(int i=0;i<numeros.length;i++) {
			numeros[i] =(int) ((Math.random()*10)+1);
		}
		mostrarArray(numeros);
		
		aux=numeros[0];
		numeros[0]=numeros[tam-1];
		numeros[tam-1]=aux;
		System.out.println();
		mostrarArray(numeros);
		System.out.println();
		System.out.println("El valor menor del array es ");
		buscamenor(numeros);
		System.out.println("fin");
	}

}
