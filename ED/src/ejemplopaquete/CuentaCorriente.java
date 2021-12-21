package ejemplopaquete;
/**
 * Contiene informacion de la cuenta 
 * @author m
 * @version 1.0
 * @since 26/11/21
 */
public class CuentaCorriente implements interfaz {

	private static final int ZERO = 0;
	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;
/**
 * Es un constructor vacio
 */
	public CuentaCorriente() {
	}
/**
 * Asigna los valores de la cuenta 
 * @param nom variable para obtener el nombre
 * @param cue variable para obtener la cuenta
 * @param sal variable para obtener el saldo
 * @param tipo variable para obtener el tipointeres
 */
	public CuentaCorriente(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Es un constructor que obtiene el nombre
 * @return almacena el nombre 
 */
	@Override
	public String getNombre() {
		return nombre;
	}
/**
 * devuelve el saldo
 * @return saldo
 */
	@Override
	public double getSaldo() {
		return saldo;
	}
/**
 * Ingresa saldo a la cuenta 
 * @param cantidad la cantidad que se va a almacenar
 * @throws Exception texto por si mete cantidad negativa
 */
	@Override
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < ZERO) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}
/**
 * Retira saldo de la cuenta
 * @param cantidad la cantidad que se va a retirar
 * @throws Exception texto por si saca cantidad negativa
 */
	@Override
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (getSaldo() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}
/**
 * Devuelve la cuenta
 * @return devuelve la cuenta 
 */
	@Override
	public String getCuenta() {
		return cuenta;
	}
/**
 * asigna el valor de la cuenta al valor de la variable
 * @param cuenta 
 */
	@Override
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * asigna el valor del saldo al valor de la variable
 * @param saldo
 */
	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * devuelve el tipointeres
 * @return
 */
	@Override
	public double getTipoInteres() {
		return tipoInteres;
	}
/**
 * asigna el valor del tipointeres al valor de la variable
 * @param tipoInteres
 */
	@Override
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
