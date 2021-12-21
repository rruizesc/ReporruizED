package documen;
/**
 * Contiene la informacion sobre el circulo
 * @author m
 * @version 1.0
 * @since 23/11/21
 */
public class Circulo {
	/**
	 *Establece el radio double
	 */
	private double rad;
/**
 * Crea un circulo de radio 
 * @param radio radio del circulo double
 */
	public Circulo(double radio) {
		this.rad = radio;
	}
	/**
	 * Muestra el radio del circulo
	 * @return devuelve el valor del radio
	 */
	public double getRad() {
		return rad;
	}
	/**
	 * Establece el radio del circulo
	 * @param rad radio del circulo double
	 */
	public void setRad(double rad) {
		this.rad = rad;
	}
	/**
	 * Imprime el diametro, color y area del circulo
	 */
	public void imprimir() {
		String color = "rojo";
		System.out.println("Diámetro: " + 2 * rad);
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * rad * rad;
		System.out.println(area);
	}
	/**
	 * Compara dos circulos entre si 
	 * @param otro El otro circulo con el que se compara
	 * @param conDecimales True compara con decimales, False no compara con decimales
	 * @return True si son circulos iguales, False si son circulos distintos
	 */
	public boolean esIgual(Circulo otro, boolean conDecimales) {
		double radio1 = this.rad;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
