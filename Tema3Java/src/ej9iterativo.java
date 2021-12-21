import java.util.Scanner;

public class ej9iterativo {

	public static void main(String[] args) {
		Scanner primo=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num=primo.nextInt();
		boolean b=true;
		
		for(int i=num-1;i>1;i--) {
			if(num%i==0) {
			System.out.println(num+" no es primo");
			b=false;
			break;
			}
		}
			if(b) {
				System.out.println(num+" es primo");
			}
		
		primo.close();
	}

}
