package entornosdesarollo;
import java.util.Scanner;
public class ArraysH4Ej14 {
	//14. Que rellene un array con 20 números y luego busque un número concreto.
	public static void main(String[] args) {
		//Definicion de contantes
		final int TAMANO=20;
		
		
		//inicializamos variables y metemos 
		Scanner entrada=new Scanner(System.in);
		int[] numero=new int[TAMANO];
		int numBuscado=0;
		boolean numEncontrado=false;
		int pos=0;
		
		for (int i=0;i<TAMANO;i++) {
			System.out.println("introduce un numero:");
			numero[i]=entrada.nextInt();
		}
		//pedimos un numero
		System.out.println("Introduce el numero a buscar");
		numBuscado=entrada.nextInt();
		for (int i=0;i<20;i++) {
			if ((numBuscado==numero[i])&&(numEncontrado==false)) {
				System.out.println("La posicion del numero es:"+(i+1));
				numEncontrado=true;
			}
		}
		
		while (numero[TAMANO]!=numBuscado) {
			
		}
		
		}

	}


