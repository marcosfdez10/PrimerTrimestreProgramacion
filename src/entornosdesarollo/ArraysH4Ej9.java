package entornosdesarollo;

import java.util.Scanner;
public class ArraysH4Ej9 {

	public static void main(String[] args) {
		// 9. Que lea 5 números por teclado, los copie a otro array multiplicados por 2 y muestre el segundo array.
		Scanner entrada=new Scanner(System.in);
		int []numeros=new int [5];
		int[]multi=new int [5];
		int resultado=0;
		for(int i=0;i<5;i++) {
			System.out.println("Escribe 5 numeros");
			numeros[i]=entrada.nextInt();
		
		}
		for(int i=0;i<5;i++) {
			resultado=numeros[i]*2;
			System.out.println("El resultado es"+resultado);
			
			
			
			
		}
	
		
		

	}

}
