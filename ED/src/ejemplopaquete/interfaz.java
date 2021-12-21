package ejemplopaquete;

public interface interfaz {

	void setNombre(String nombre);

	/**
	 * Es un constructor que obtiene el nombre
	 * @return almacena el nombre 
	 */
	String getNombre();

	/**
	 * devuelve el saldo
	 * @return saldo
	 */
	double getSaldo();

	/**
	 * Ingresa saldo a la cuenta 
	 * @param cantidad la cantidad que se va a almacenar
	 * @throws Exception texto por si mete cantidad negativa
	 */
	void ingresar(double cantidad) throws Exception;

	/**
	 * Retira saldo de la cuenta
	 * @param cantidad la cantidad que se va a retirar
	 * @throws Exception texto por si saca cantidad negativa
	 */
	void retirar(double cantidad) throws Exception;

	/**
	 * Devuelve la cuenta
	 * @return devuelve la cuenta 
	 */
	String getCuenta();

	/**
	 * asigna el valor de la cuenta al valor de la variable
	 * @param cuenta 
	 */
	void setCuenta(String cuenta);

	/**
	 * asigna el valor del saldo al valor de la variable
	 * @param saldo
	 */
	void setSaldo(double saldo);

	/**
	 * devuelve el tipointeres
	 * @return
	 */
	double getTipoInteres();

	/**
	 * asigna el valor del tipointeres al valor de la variable
	 * @param tipoInteres
	 */
	void setTipoInteres(double tipoInteres);

}