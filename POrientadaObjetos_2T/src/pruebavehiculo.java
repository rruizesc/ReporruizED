import java.util.Scanner;

public class pruebavehiculo {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Vehiculo v1;
		Vehiculo v2=new Vehiculo(5,100,4);
//		v2.capacidad=50;
//		v2.consumo=4;
//		v2.numpasajeros=5;
// si no le das el parametro para que 
// reserve informacion sobre la clase Vehiculo
// no puedes sacar informacion de esa clase
		v1=new Vehiculo(1,2,3);
		v1.numpasajeros=60;
		v1.capacidad=1000;
		v1.consumo=10;
// informacion() es texto de los datos que estan puestos arriba para que se vean por pantalla
		v1.informacion();
		v2.informacion();
		System.out.println("¿Cuántos km has recorrido?");
		int kms=sc.nextInt();
		double preciogasolina=1.12;
		System.out.println("Para el primer coche es "+v1.coste(preciogasolina, kms));
		double miprecio=v2.coste(preciogasolina, kms);
		System.out.println("Para el segundo coche es "+miprecio);
		Vehiculo v3=new Vehiculo(1,2,3);
		v3.informacion();
		System.out.println("Para el tercer coche es "+v3.coste(miprecio, kms));
	}

}
