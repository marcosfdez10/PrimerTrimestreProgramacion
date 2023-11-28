package entornosdesarollo;

import java.util.Scanner;

public class figura1 {

	public static void main(String[] args) {
		//Figura 1
		Scanner entrada=new Scanner(System.in);
		int filasleidas, filaCont=1,numAst=1;
		
		System.out.println("Introduce un numero");
		filasleidas=entrada.nextInt();
		
		//recorremos filas
		for(filaCont=1;filaCont<=filasleidas;filaCont++) {
			
			//Pintamos asteriscos
			for (numAst=1;numAst<=filaCont;numAst++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
