
public class calculadora {
	private int op1;
	private int op2;
	
	public calculadora(int o1, int o2) {
		op1=o1;
		op2=o2;
		
	}
	public void setop1(int nuevo) {
		op1=nuevo;
	}
	public void setop2(int nuevo) {
		op2=nuevo;
	}
	public int getop1() {
		return op1;
	}
	public int getop2() {
		return op2;
	}
	public int suma() {
		return op1+op2;
	}
	public int resta() {
		return op1-op2;
	}
	public int multiplicacion() {
		return op1*op2;
	}
	public String toString() {
		return op1+" "+op2;
	}
// setter: reiniciar valor
// getter: obtiene valor actual
}
