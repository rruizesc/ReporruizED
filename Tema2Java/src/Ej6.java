import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		System.out.println("Escribe tres numeros enteros");
		Scanner enter=new Scanner(System.in);
		System.out.println("Escribe un numero");
		int n1=enter.nextInt();
		System.out.println("Escribe otro numero");
		int n2=enter.nextInt();
		System.out.println("Escribe el tercer numero");
		int n3=enter.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println(n1+" Es la nota mas alta");
		}else {
			if(n2>n1 && n2>n3) {
			System.out.println(n2+" Es la nota mas alta");
		}else {
			if (n3>=n1 && n3>=n2) {
			System.out.println(n3+" es la nota mas alta");
		}}
		}
			
		enter.close();
	}
}