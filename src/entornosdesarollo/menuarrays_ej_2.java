package entornosdesarollo;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

/*Ejercicio 2. Leer 10 números, almacenarlos en un array, luego tiene que salir el siguiente menú:

a. el valor máximo y mínimo del array

b. eliminar duplicados y sutituirlos por 0 (todos menos el primero)

c. rotar array

d. salir*/
public class menuarrays_ej_2 {

	public static void main(String[] args) {
		final int TAM=4;
		//habilitamos la lectura por teclado
		Scanner entrada=new Scanner(System.in);
		//definimos el array
		int[]num=new int[TAM];
		char opcion='0';
		int max,min;
		for (int i=0;i<TAM;i++) {
			System.out.println("Introduce un numero");
			num[i]=entrada.nextInt();
		}
		do {
			System.out.println("a. el valor máximo y mínimo del array");
			System.out.println("b. eliminar duplicados y sutituirlos por 0 (todos menos el primero)");
			System.out.println("c. rotar array");
			System.out.println("d. salir");
			opcion=entrada.nextLine().charAt(0);
			//valor maximo y minimo
			if (opcion=='a') {
				min=num[0];
				max=num[0];
				for (int i=0;i<TAM;i++) {
					if (num[i]>max) {
						max=num[i];
						
					}
				}
			}
		
			
			
		}while(opcion!='d');

	}

}
