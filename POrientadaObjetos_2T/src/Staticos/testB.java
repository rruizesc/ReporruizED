package Staticos;

public class testB {

	public static void main(String[] args) {
		B b0=new B(5);
		B b1=new B(15);
		System.out.println(b0);
		System.out.println(b1);
		System.out.println(b0.suma()+b1.suma());
		System.out.println("hay "+B.getY()+" objetos de B");
	}

}
