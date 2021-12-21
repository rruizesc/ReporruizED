import java.util.Scanner;

public class Array_ejemplo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Cuantos elementos quieres");
		int size=Math.abs(sc.nextInt()); 
		int[] numeros=new int[size];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=i*i;
			System.out.print(numeros[i]+"  ");
		}	
		sc.close();
	}

}
