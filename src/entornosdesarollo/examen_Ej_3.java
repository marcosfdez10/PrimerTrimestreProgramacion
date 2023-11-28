package entornosdesarollo;
import java.util.Scanner;
public class examen_Ej_3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		int num1=0;
		int num2=0;
		
		
			System.out.println("Introduce un numero del 1-100");
			num1=entrada.nextInt();
			System.out.println("Introduce un numero del 1-100");
			num2=entrada.nextInt();
		
		if ((num1>100)||(num2>100)){
				System.out.println("Error");
			}
		if (num1==num2) {
				System.err.println("Error");
			}
		
			
		}
	}
			
		
		

	


