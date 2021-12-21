
public class fdemo {
	int x;
	fdemo(int y){
		x=y;
		System.out.println("finalizando "+x);

	}
	protected void finalize() {
		System.out.println("finalizando "+x);
	}
}
