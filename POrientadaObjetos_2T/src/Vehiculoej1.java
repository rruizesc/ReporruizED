/*� Con los atributos privados numRuedas (n�mero de ruedas), velMax (velocidad m�xima) y peso.
� Implementa los m�todos necesarios para acceder a estos atributos de manera p�blica (getters y setters).
� La clase dispondr� de un constructor que necesitar� como par�metros los valores iniciales para todos sus atributos.
� Crea un m�todo p�blico boolean esIgual(Vehiculo) que sirva para comparar dos veh�culos, 
	de manera que devuelva true o false dependiendo de si son iguales o no 
	(tienen todos sus atributos el mismo valor o no). 
	El m�todo recibir� como par�metro un objeto de la clase Veh�culo.
� Crea un m�todo p�blico void copia(Vehiculo) que copiar� un veh�culo en otro. 
	El m�todo recibir� como par�metro un objeto de la clase Veh�culo del cual se copiar�n sus valores.
� Crea una clase aparte con el m�todo main para probar todas las funcionalidades de la clase Veh�culo.*/
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
