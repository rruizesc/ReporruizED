import java.util.Scanner;

public class Entradateclado {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		System.out.println("ahora cadena");
		String cad=sc.next();
		System.out.println(cad+" "+v);
		sc.close();
	}

}
