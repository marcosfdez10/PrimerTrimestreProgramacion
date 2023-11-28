package entornosdesarollo;
//Que pida un numero y diga si es par o impar

//Inicio

public class H1Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaracion de variables
				//tipo_dato nombre_variable;
				int num;
				//inicializo la variable
				
				num = 0;
				//mostrar "Introduce un numero"
		
		System.out.println("Introduce un numero");
		//Leer num
		num=5;
		//si (num MOD 2)=0 entonces
		if ((num%2)==0) {
			//Mostrar es par
			System.out.println("Es par");
		//sino
		}else {
			//mostrar "es impar"
			System.out.println("Es impar");
			//Fin_si
		}

	}

}
