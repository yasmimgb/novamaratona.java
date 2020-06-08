import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 1; i <= N; i++) {
        	if (N % i == 0) System.out.println(i);
        }
    }
	
}
