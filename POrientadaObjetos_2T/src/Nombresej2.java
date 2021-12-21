/*Crea una clase llamada Nombres, capaz de gestionar una lista de nombres de un tama�o determinado:

El constructor recibir� como par�metro el n�mero m�ximo de nombres que albergar�.

Tendr� los siguientes m�todos:
int anadir(String): A�ade a la lista el nombre pasado como par�metro. Devuelve -1 si la lista est� llena, 0 si se a�ade con �xito y 1 si ya exist�a el nombre (no admite repetidos).

boolean eliminar(String): Elimina de la lista el nombre pasado como par�metro. Devuelve true en caso de �xito y false si no encuentra el nombre a eliminar.

void vaciar(): Elimina todos los nombres de la lista.

String mostrar(int): Devuelve el nombre que se encuentra en la posici�n pasada como par�metro (la primera es la posici�n 0).

int numNombres(): Devuelve el n�mero de nombres que hay actualmente.

int maxNombres(): Devuelve el n�mero m�ximo de nombres que puede albergar.

boolean estaLlena(): Devuelve true si la lista est� llena y false en caso contrario.
*/
public class Nombresej2 {
	
	private int nummax; //es el num max de nombres que puede tener la lista
	private String [] lista;
	private int actual;
	
	public Nombresej2 (int max) {
		nummax=max;
		lista=new String[nummax];
		actual=0;
	}
	
	public void setnummax(int nuevomax) {
		nummax=nuevomax;
	}
	public int getnummax() {
		return nummax;
	}
	public int agregarnombre (String nuevonombre) {
		if(actual==nummax) { //lista llena
//			System.out.println("la lista ya estaba llena");
			return -1;
		}else if(actual<nummax){ //es posible a�adir
			for (int i = 0; i < actual; i++) {
				if(lista[i].equals(nuevonombre)) { //no a�adimos porque ya estaba
//					System.out.println("el "+nuevonombre+" ya estaba");
					return 0;
				}
			}
		}
		lista[actual]=nuevonombre; //a�adimos
		actual++;
		return 1;
	}
	public Boolean eliminar(String nombre) { //eliminar un nombre de la lista
	int posicion=-1;
		for (int i = 0; i < actual; i++) {
			if(lista[i].equals(nombre)) {
				//el nombre esta
				posicion=i;
				break;
			}
		}
		if (posicion==-1) {
			return false;
		}
		
		for (int i = posicion; i < actual-1; i++) {
			lista[i]=lista[i]+1;
		}
		lista[actual-1]=""; //borrado fisico
		actual--;
		return true;
	}
	
	public void verlistaactual() {
		System.out.println("Listado de nombres");
		for (int i = 0; i < actual; i++) {
			System.out.println(lista[i]);
		}
	}
}
