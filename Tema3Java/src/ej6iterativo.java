import java.util.Scanner;

public class ej6iterativo {

	public static void main(String[] args) {
		Scanner tabla=new Scanner(System.in);
		int num=tabla.nextInt();
		System.out.println("La tabla de multiplicar de "+num+" es:");
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+"= "+num*i);
		}
		tabla.close();
	}

}
