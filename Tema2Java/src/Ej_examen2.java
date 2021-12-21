import java.util.Scanner;

public class Ej_examen2 {

	public static void main(String[] args) {
//		Scanner teclado=new Scanner(System.in);
//		int saldo=(int) (Math.random()*(10000-100+1)+(100));
//		int op;
//		System.out.println(saldo);
//			System.out.println("¿Qué quieres hacer?");
//			System.out.println("1.Sacar");
//			System.out.println("2.Consultar");
//			System.out.println("3.meter");
//			op=teclado.nextInt();
//		switch(op) {
//			case 1:
//			System.out.println("¿Cuanto dinero quieres sacar?");	
//			int cuanto=teclado.nextInt();
//			if(cuanto>0 && saldo >=cuanto) {
//				saldo-=cuanto;
//				System.out.println("Operacion realizada");
//				
//				System.out.println(saldo);
//			}else {
//				System.out.println("No tienes "+cuanto+" € en tu cuenta");
//				System.out.println("Operacion fallida");
//			}
//				break;
//				
//			case 2:
//				System.out.println("Tu saldo actual es "+saldo+" €");
//				break;
//				
//			case 3:
//				System.out.println("¿Cuanto dinero quieres meter?");
//				int meter=teclado.nextInt();
//				if (meter>0)
//				saldo+=meter;
//				System.out.println("Operacion realizada con exito");
//				System.out.println("Ahora tu saldo es "+saldo+" €");
//				break;
//				
//			default:
//				System.out.println("Esa no es una opcion intentelo de nuevo");
//		}
//		System.out.println("fin de la ejecucion");
//	teclado.close();
		
		
		
//		Scanner clima=new Scanner(System.in);
//		System.out.println("Pon la temperatura que haga en tu zona: ");
//		int temperatura=clima.nextInt();
//		
//		if(temperatura>10 && temperatura<26){
//			System.out.println("la temperatura de tu zona: "+temperatura+" es un clima templado");
//		}else {
//			if(temperatura>25 && temperatura<36) {
//				System.out.println("la temperatura de tu zona: "+temperatura+" es un clima caluroso");
//			}else {
//				if (temperatura>35) {
//					System.out.println("la temperatura de tu zona:"+temperatura+" es un clima tropical");
//				}else {
//					System.out.println("la temperatura de tu zona: "+temperatura+" es un clima frio");
//				}
//			}
//		}
//		clima.close();
		
		
		Scanner notas=new Scanner(System.in);
		System.out.println("¿Cuantas preguntas tenia el test?");
		int preguntas=notas.nextInt();
		System.out.println("¿Cuantas preguntas has respondido bien?");
		int correctas=notas.nextInt();
		
		if (correctas>preguntas) {
			System.out.println("entrada de datos incorrecta");
		}else {
			double porcentaje=(correctas*100.0/preguntas);
			if(porcentaje <50) {
				System.out.println("Fuera de nivel");
			}else {
				if(porcentaje <75) {
					System.out.println("Nivel regular");	
				}else {
					if(porcentaje <90) {
						System.out.println("Nivel medio");
					}else {
						System.out.println("Nivel maximo");
					}
				}
			}
		}
		notas.close();
	}

}
