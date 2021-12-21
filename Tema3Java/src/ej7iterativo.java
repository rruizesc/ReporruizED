import java.util.Scanner;

public class ej7iterativo {

	public static void main(String[] args) {
		Scanner factorial=new Scanner(System.in);
		System.out.println("ingresa un numero");
		int num=factorial.nextInt();
		
		for(int i=num;i>0;i--) {
			num=num*i;
		}
		System.out.println("Factorial de "+num);
		factorial.close();
		}
	}

