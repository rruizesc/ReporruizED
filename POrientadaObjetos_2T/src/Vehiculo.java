
public class Vehiculo {
	int capacidad;
	int consumo;
	int numpasajeros;
	
	public Vehiculo(int num, int cap, int con){
		capacidad=cap;
		consumo=con;
		numpasajeros=num;
	}
	
	public Vehiculo() {
		numpasajeros=5;
		consumo=5;
		capacidad=50;
	}
	
public void informacion() {
	System.out.println("Tu vehiculo puede llevar hasta "+numpasajeros+
			" pasajeros y consume "+consumo+" litros por km");
}
public double coste(double precio, int kmrecorridos) {
// hay que poner una variable que tenga las variables que has puesto para que te devuelva lo que quieres
	double aux=precio*consumo*kmrecorridos;
	return aux;
}
}