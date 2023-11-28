package entornosdesarollo;

import java.util.Scanner;

public class palindromosej1 {

	public static void main(String[] args) {
		//Ejercicio 1. Leer una palabra de 4 letras (letra a letra) y mostrar en una línea la palabra formada y su palíndroma.
		char []palabra;
		palabra=new char[4];
		
		//habilitamos la lectura por teclado
		Scanner entrada=new Scanner(System.in);
		 //rellenamos el array
		for (int i=0;i<4;i++) {
			System.out.println("Introduce una letra");
			palabra[i]=entrada.nextLine().charAt(0);
			
		}
		//mostramos la palabra en orden
		for(int i=0;i<4;i++) {
			System.out.println(palabra[i]);
		}
		System.out.println();
		for(int i=3;i>=0;i--) {
			System.out.println(palabra [i]);
		}
	}

}
