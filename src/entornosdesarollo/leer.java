package entornosdesarollo;

import java.util.Scanner;

public class leer {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		int i, num, suma=0;
		double media=0;
		for(i=1;i<=10;i++) {
			System.out.println("Intyroduce un numero");
			//leer num
			num=entrada.nextInt();
			suma=suma+num;
			
		}
		media=suma/10;
		System.out.println("La media es:"+media);
		

	}

}
