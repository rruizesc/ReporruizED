
public class redondeo {

	public static void main(String[] args) {
		double litros=Math.random()*100;
		System.out.println(litros);
		System.out.println(Math.round(litros*100.0)/100.0);
	}

}
