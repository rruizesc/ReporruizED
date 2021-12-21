
public class ej4iterativo {

	public static void main(String[] args) {
		int numeros=(int) Math.random()*10;
		int suma=0;
		int numero=0;
		System.out.print(numeros+" ");
		for(int i=0;i<8;i++) {
			 numero=(int) (Math.random()*10);
			System.out.print(numero+" ");
			 suma+=(numero+numeros);
		}
		double media=suma/9.0;
		 if(numeros==numero) {
			 System.out.println("");
				System.out.println("La nota media es: "+media);
			}else {
				System.out.println("");
				System.out.println("el primer y ultimo numero no son iguales");
			}
	}

}
