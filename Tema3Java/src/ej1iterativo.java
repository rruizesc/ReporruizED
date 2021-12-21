
public class ej1iterativo {

	public static void main(String[] args) {
		boolean s1=true;
		
		int numeros2=(int) Math.random()*10;
		System.out.println(numeros2);
		
		for(int i =1;i<10;i++) {
			int numeros=(int) (Math.random()*10);
		System.out.println(numeros);
				if(numeros2!=numeros) {
					s1=false;
				}
		}
		if (s1=true) {
			System.out.println("Todos son iguales");
		}else {
			System.out.println("no son todos iguales");
		}
	}
}
