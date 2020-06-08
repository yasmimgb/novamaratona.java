import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		float T;
		int i,j;
		float N[] =new float[100];
		
		System.out.println("Informe o número");
		
		Scanner input =new Scanner(System.in);
		T =input.nextFloat();
		
		for ( i = 0,j = 0; i < 100; j++,T /= 2,i++) {
			N[j] = T;
			
			System.out.print("N["+i+"] = ");
			System.out.printf("%.4f\n",N[j]);
			
		}

	}

}
