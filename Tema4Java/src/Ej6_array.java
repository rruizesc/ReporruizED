/*vi. Rellena un array con el resultado del cálculo del factorial 
*de los números del 1 al 20 y muestra posteriormente su contenido en pantalla.
NOTAS: 
Para el cálculo del factorial de un número debes utilizar el factorial 
que ya has calculado para el número anterior. 
En una variable de tipo int no cabe el factorial de 20. 
20!=2.432.902.008.176.640.000 
9,223,372,036,854,775,807*/

public class Ej6_array {
	public static long factorial(int num) {
		long f=1;
		for (int i = 1; i <= num; i++) {
			f=f*i;
		}
		return f;
	}
	public static void mostrarArray(long[] miarray) {
		for (int i = 0; i < miarray.length; i++) {
			System.out.println("El factorial de "+(i+1)+" "+miarray[i]);
		}
	}
	public static void main(String[] args) {
		int tam=20;
		long[] numeros=new long[tam];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=factorial(i+1);
		}
		System.out.println("Factoriales del 1 al 20");
		mostrarArray(numeros);
		
	}

}
