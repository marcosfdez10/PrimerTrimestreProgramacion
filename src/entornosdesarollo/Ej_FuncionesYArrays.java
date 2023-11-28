package entornosdesarollo;
import java.util.Scanner;
public class Ej_FuncionesYArrays {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums=new int[8];
		nums=rellenaArray(nums);
		muestraArray(nums);
	}
	public static int[] rellenaArray(int[] nums) {
		for (int i=0;i<8;i++) {
			System.out.println("Introduce valor");
			nums[i]=entrada.nextInt();
		}
		return nums;
	}
	public static void muestraArray(int[] nums) {
		for (int i=0;i<8;i++) {
			System.out.println(nums[i]);
		}
	}
	
}
