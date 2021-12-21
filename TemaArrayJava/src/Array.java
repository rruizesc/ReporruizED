
public class Array {

    public static void main(String[] args) {
    	int tam=4;
       double [] cesta=new double[tam];
       boolean [] compro=new boolean[tam];
       
       for(int i=0;i<cesta.length;i++) {
    	cesta[i]=(Math.round((Math.random()*100*100))/100.0);
    	System.out.print(cesta[i]+"     ");   
       }   
       System.out.println();
       for(int i=0;i<compro.length;i++) {
    	   if(((int)(Math.random()*10))%2!=0){
    		   compro[i]=true;
    	   }
       		System.out.print(compro[i]+"     ");   
       }
       double total=0;
       for(int i=0;i<compro.length;i++) {
    	if(compro[i]) {
    		total+=cesta[i];
    	}
       }
       System.out.println();
       System.out.println("El total de la compra es: "+total);
    }
}