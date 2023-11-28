package entornosdesarollo;
import java.util.Scanner;
public class Arrays {
	// Que pida 10 notas y muestre la media
	public static void main(String[] args) {
		
		// habilitamos la entrada por teclado
		Scanner entrada=new Scanner(System.in);
		
		// 1. definimos el arrays de notas
		int [] notas;
		int suma=0;
		
		// 2. construimos el array de 10 posiciones
		notas=new int[10];
		
		// 3. Metemos 10 notas en la array
		for(int i=0;i<10;i++) {
			System.out.println("Introduce un valor");
			notas[i]=entrada.nextInt();
			suma=suma+notas[i];
			
			
			
		}
		//4. las mostramos
		for (int i=0;i<10;i++) {
		System.out.println(notas[i]);
		}
		System.out.println("La media es:"+suma/10);

	}

}
