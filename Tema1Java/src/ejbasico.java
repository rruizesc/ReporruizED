// programa que obtenga dos números y los almacene en dos variables.
//En otra variable, almacená el resultado de la suma de esos dos números y 
//luego mostrá ese resultado en pantalla.
//A continuación, el programa obtiene un tercer número, el cual se debe almacenar en una nueva variable. Por último, mostrá en pantalla el resultado de la multiplicación de este nuevo número por el resultado de la suma anterior. 
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
