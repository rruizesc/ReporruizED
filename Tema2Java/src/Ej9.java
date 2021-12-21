import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		System.out.println("Escribe dos numeros enteros");
		Scanner enter=new Scanner(System.in);
		int n1=enter.nextInt();
		int n2=enter.nextInt();

		if(n1==n2) {
			System.out.println(n1+" y "+n2+" son iguales");
		}else {
			if(n1%n2==0 || n2%n1==0) {
				System.out.println(n1+" y "+n2+" son multiplos entre si");
			}else {
				System.out.println(n1+" y "+n2+" no son multiplos entre si y tampoco son iguales");
			}
		}
		

		enter.close();
	}
}