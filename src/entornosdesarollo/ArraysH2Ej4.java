package entornosdesarollo;

import java.util.Scanner;

public class ArraysH2Ej4 {

	public static void main(String[] args) {
		//habilitamos la lectura por tecaldo
		Scanner entrada = new Scanner(System.in);
		//definimos el array
		double [] numero=new double[10];
		double suma=0, resta=0, mult=0, div=0;
		boolean hayCero=true;
		
		//rellenamos el array
		for (int i=0;i<10;i++) {
			System.out.println("Introduce 10 valores");
		//	entrada.nextDouble()
		}
		//calculamos los resultados
		for (int i=0;i<10;i++) {
			suma=suma+numero[i];
			resta=resta-numero[i];
			mult=mult*numero[i];
			if (hayCero==false) {
				div=div/numero[i];
			}
		
		
			
		}
		System.out.println("La suma es:"+suma);
		System.out.println("La resta es:"+resta);
		System.out.println("La multiplicacion es:"+mult);
		if (hayCero==false) {
			System.out.println("la division es:"+div);
		}else {
			System.out.println("La division no se puede realizar");
		}
				

	}

}
