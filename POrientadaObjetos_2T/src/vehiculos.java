
public class vehiculos {

	public static void main(String[] args) {
		Vehiculoej1 coche= new Vehiculoej1(4, 100, 1000);
		Vehiculoej1 moto= new Vehiculoej1(2, 100, 10);
		
		System.out.println(moto.informacion());
		System.out.println(coche.informacion());
		
		if(moto.esigual(coche)) {
			System.out.println("me quedo con la moto");
		}else {
			System.out.println("me quedo con el coche");
		}
	}

}
