import java.util.Scanner;

public class MyClass {
public static void main(String[] args) {
		int T, N, i, j;
		int fibo[]=new int[61];
		fibo[0] = 0;
		fibo[1] = 1;
		
		Scanner input =new Scanner(System.in);
		System.out.println("informe o número da sequência de Fibonacci");
		T = 1;
		for (j = 0; j < T; j++) {
			N = input.nextInt();
			
			for ( i = 2; i < 61; i++) {
				fibo[i] = fibo[i - 1]+fibo[i - 2];
				if (N == 0) {
					System.out.print("Fib("+0+") = "+0+"\n");
					break;
				}else if (N == 1) {
					System.out.print("Fib("+1+") = "+1+"\n");
					break;
				}
					if (i == N) {
						System.out.print("Fib("+i+") = "+fibo[i]+"\n");
					}
								
			}
			
		}

	}

}
