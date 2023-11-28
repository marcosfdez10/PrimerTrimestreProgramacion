package entornosdesarollo;

public class H2Ej22 {

	public static void main(String[] args) {
		//18. Que escriba las tablas de multiplicar del 0 al 10.
		int num=0;
		int cont=0;
		int mult;
		
		while (num<=10) {
			
		
			while (cont<=10) {
				mult=num*cont;
				System.out.println(num+"x"+cont+"="+mult);
				cont=cont+1;
			
			
			}
			
			num=num+1;
			cont=0;
			
		}
			
		
		

	}

}
