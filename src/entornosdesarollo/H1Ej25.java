package entornosdesarollo;

public class H1Ej25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//declaracion de variables
		int anyo;
		double sueldo;
		
		//inicializo las variables
		
		anyo = 0;
		sueldo = 0;
		
		System.out.println("Introduce sueldo y antiguedad");
		//emulamos lectura
		anyo = 3;
		sueldo = 40000;
		//Si la antiguedad es menor a 10
		if (anyo>10)
			sueldo = sueldo*1.1;
		else {
			if (anyo>5) {
			sueldo=1.05*sueldo;
			
			}

		}
			
		
		
		
		
		

	}

}
