
public class ej3iterativo {

	public static void main(String[] args) {
		int cont=0;
		int mayor= Integer.MIN_VALUE;
		for(int i=0;i<40;i++) {
			int numero=(int) (Math.random()*10);
			System.out.print(numero+" ");
			if(numero>mayor) {
				mayor=numero;
				cont=0;
			}
			if(numero==mayor) {
				cont++;
			}
		}
		System.out.println("");
		System.out.println("el valor maximo es: "+mayor);
		System.out.println("el valor de repeticiones es "+cont);

	}

}
