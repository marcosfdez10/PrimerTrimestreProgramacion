package entornosdesarollo;

public class H2Ej9 {

	public static void main(String[] args) {
		int cont=0;
		int suma=0;
		int contNumPares=0;
		
		while (cont<100) {
			cont=cont+2;
			suma=suma+cont;
			contNumPares=contNumPares+1;
					System.out.println("cont:"+cont);
			
		}
		System.out.println("Hay:" +contNumPares+ ","+suma);

	}

}
