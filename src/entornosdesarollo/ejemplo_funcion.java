package entornosdesarollo;

public class ejemplo_funcion {
	//funcion principal. Es la unica funcion que se ejecuta en un programa
	
	public static void main(String[] args) {
		int suma=suma(5,4);
		System.out.println(suma);
		
	}
	
	//Definimos una funcion
	//1. definimos la cabecera
	public static int suma(int a, int b) {
		return a+b;
	}

}
