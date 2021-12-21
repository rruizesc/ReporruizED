import java.util.Scanner;

public class Array_ejemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos elementos quieres");
		int size = Math.abs(sc.nextInt());
		int[] numeros = new int[size];
		int max = numeros[0];
		int min = numeros[0];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("introude un valor");
			numeros[i] = sc.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < min) {
				min = numeros[i];
			}
			if (numeros[i] > max) {
				max = numeros[i];
			}
		}
		System.out.println("min y max; " + min + " " + max);
		sc.close();
	}
}