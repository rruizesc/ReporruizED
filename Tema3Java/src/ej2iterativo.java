
public class ej2iterativo {

	public static void main(String[] args) {
		int j=0;
		for(int i =1;i<21;i++) {
			int numeros=(int) (Math.random()*10);
			j+=numeros;
		}
		System.out.println(j);
		double media= j/20.0;
		System.out.println("La media de todos los numeros es: "+media);
	}

}
