import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
         Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X, Y;
        int soma=0, cont=0;
        for (int i = 0; i < N; i++) {
        	cont = 0;
        	soma = 0;
        	X = leitor.nextInt();
        	Y = leitor.nextInt();
        	while (cont < Y) {
        		if (X % 2 != 0) {
        			soma += X;
        			cont++;
        		}
        		X++;
        	}
        	System.out.println(soma);
        }
    }
	
}
