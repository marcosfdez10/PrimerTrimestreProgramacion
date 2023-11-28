package entornosdesarollo;

public class H2Ej25 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		int cont=1;
		
		//mostrar los dos primeros terminos de la serie
		
		System.out.println(a);
		System.out.println(b);
		
		while (cont<=25) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			cont=cont+1;
					
					
		}
		

	}

}
