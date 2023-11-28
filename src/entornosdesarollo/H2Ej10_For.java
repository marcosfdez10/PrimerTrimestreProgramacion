package entornosdesarollo;

public class H2Ej10_For {

	public static void main(String[] args) {
		
		int i;
		int suma=0;
		int cont=0;
		
		for (i=1;i<=100;i=i+2) {
			suma=suma+i;
			cont=cont+1;
			
		}
		System.out.println("suma"+suma+"cont:"+cont);
		

	}

}
