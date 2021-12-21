package Staticos;

public class B {
	private int x;
	static private int y;
	
	public B(int x) {
		this.x = x;
		y++; 
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static int getY() {
		return y;
	}
	
	public int suma () {
	return x+y;	
	}

	@Override
	public String toString() {
		return "B [x=" + x + "]";
	}
	
}
