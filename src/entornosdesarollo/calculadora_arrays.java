package entornosdesarollo;

import java.util.Scanner;

public class calculadora_arrays {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("introduce 5 numeros");
		
		double[]nums= {2,5,6,8,11};
		double media=suma(nums);
		System.out.println(media);
		
	
		
		
	}public static double suma(double[] nums) {
		double suma=0;
		for(int i=0;i<nums.length;i++) {
			suma=suma+nums[i];
			
		}return suma;
		
	}public static double resta(double[]nums) {
		double resta=0;
		for (int i=0;i<nums.length;i++) {
			resta=resta-nums[i];
		}return resta;
	}public static double mult(double[]nums) {
		double multi=1;
		for(int i=0;i<nums.length;i++) {
			multi=multi*nums[i];
		}return multi;
	}

}
