import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		System.out.println("Escribe dos numeros enteros");
		Scanner enter=new Scanner(System.in);
		int n1=enter.nextInt();
		int n2=enter.nextInt();
		
		if(n1%2==0 && n2%2!=0) {
			System.out.println(n1+" Es par y "+n2+" es impar");
		}else {
			if(n2%2==0 && n1%2!=0) {
				System.out.println(n2+" Es par y "+n1+" es impar");
			}else {
				if(n1%2==0 && n2%2==0) {
					System.out.println(n1+" y "+n2+" son numeros pares");
				}else {
					System.out.println(n1+" y "+n2+" son numeros impares");
				}
			}
		}
			
		enter.close();
	}
}