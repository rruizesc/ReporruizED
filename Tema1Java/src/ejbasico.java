// programa que obtenga dos n�meros y los almacene en dos variables.
//En otra variable, almacen� el resultado de la suma de esos dos n�meros y 
//luego mostr� ese resultado en pantalla.
//A continuaci�n, el programa obtiene un tercer n�mero, el cual se debe almacenar en una nueva variable. Por �ltimo, mostr� en pantalla el resultado de la multiplicaci�n de este nuevo n�mero por el resultado de la suma anterior. 
public class ejbasico {

	public static void main(String[] args) {
		double kilometros=Math.random()*20;
		double litros=Math.random()*100;
		double suma=litros+kilometros;
		System.out.println("la suma de litros y kilometros es "+suma);
		double num3=Math.random()*100;
		System.out.println("La multiplicacion entre la suma y el numero es "+suma*num3);
	
		
		
		
		double decimal=Math.random();
		System.out.println(decimal);
		
		int entero=(int)(Math.random()*15);
		System.out.println(entero);
		
		double suma2=decimal+entero;
		System.out.println(suma2);
		
	}	

}
