package entornosdesarollo;

import java.util.Scanner;

public class H5_Ej23 {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums=new int[5];
		nums=mostrarArray(nums);
		

	}public static int[] mostrarArray(int[] nums) {
		for (int i=0;i<5;i++) {
			System.out.println("Introduce un numero");
			nums[i]=entrada.nextInt();
		}
		return nums;
	}
	public static void copiarArray(int[]origen, int[]destino) {
		
		
	}

}
