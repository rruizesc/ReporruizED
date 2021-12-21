/*• Con los atributos privados numRuedas (número de ruedas), velMax (velocidad máxima) y peso.
• Implementa los métodos necesarios para acceder a estos atributos de manera pública (getters y setters).
• La clase dispondrá de un constructor que necesitará como parámetros los valores iniciales para todos sus atributos.
• Crea un método público boolean esIgual(Vehiculo) que sirva para comparar dos vehículos, 
	de manera que devuelva true o false dependiendo de si son iguales o no 
	(tienen todos sus atributos el mismo valor o no). 
	El método recibirá como parámetro un objeto de la clase Vehículo.
• Crea un método público void copia(Vehiculo) que copiará un vehículo en otro. 
	El método recibirá como parámetro un objeto de la clase Vehículo del cual se copiarán sus valores.
• Crea una clase aparte con el método main para probar todas las funcionalidades de la clase Vehículo.*/
public class Vehiculoej1 {

		private int numruedas;
		private int velMax;
		private int peso;
		
		public Vehiculoej1(int num, int max, int ps) {
			numruedas=num;
			velMax=max;
			peso=ps;
		}
		public void setnumruedas(int num) { //el nombre lo decido yo el de num
			numruedas=num;
		}
		
		public void setvelmax(int max) {
			velMax=max;
		}
		
		public void setpeso(int ps) {
			peso=ps;
		}
		public int getnumruedas() {
			return numruedas;
		}
		public int getvelMax() {
			return velMax;
		}
		public int getpeso() {
			return peso;
		}
		
		public boolean esigual(Vehiculoej1 otro) {
			if(numruedas== otro.numruedas && velMax == otro.velMax && peso == otro.peso) {
			return true;
		}
		return false;
}
		public void copia1(Vehiculoej1 otro) { //de este vamos a copiar en el otro
			numruedas=otro.numruedas;
			velMax=otro.velMax;
			peso=otro.peso;
		}
		public void copia2(Vehiculoej1 otro) { 
			otro.numruedas=numruedas;
			otro.velMax=velMax;
			otro.peso=peso;
		}
		public String informacion() {
			return "vehiculo: ruedas: "+numruedas+"  velocidad max: "+velMax+"  peso: "+peso;
		}
}
