import java.util.Scanner;

public class SWITCH {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("intro nota");
		int nota=sc.nextInt();
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("tu nota "+nota+" es un suspenso");
			break;
		case 5:
			
			System.out.println("tu nota "+nota+" es un suficiente");
			break;
		case 6:
			System.out.println("tu nota "+nota+" es un bien");
			break;
		case 7:
		case 8:
			System.out.println("tu nota "+nota+" es un notable");
			break;
		case 9:
		case 10:
			System.out.println("tu nota "+nota+" es un sobresaliente");
			break;
		default :
			System.out.println("nota erronea");
		}
	sc.close();
	}

}
