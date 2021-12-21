import java.util.Scanner;

public class pruebacalculadora {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		calculadora c=new calculadora(4,5);
		int n1, n2;
		int opcion=0;
		do {
			System.out.println("1.sumar 2.restar 3.multiplicar 4.salir");
			opcion=sc.nextInt();
			n1=(int)(Math.random()*100);
			n2=(int)(Math.random()*100);
			c.setop1(n1);
			c.setop2(n2);
			System.out.println(c.toString());
			switch (opcion) {
			case 1:
				System.out.println(c.suma());
				break;
			case 2:
				System.out.println(c.resta());
				break;
			case 3:
				System.out.println(c.multiplicacion());
				break;
			case 4:
				System.out.println("fin");
				break;
			
			default:
				System.out.println("Opcion no valida");
			}
		} while (opcion>0 && opcion<4);
	}		
}
