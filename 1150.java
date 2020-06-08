import java.io.IOException;
import java.util.Scanner;

public class MyClass {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        int Z = leitor.nextInt();
        int cont = 0;
        int soma = 0;
        while (Z <= X) {
        	Z = leitor.nextInt();
        }
        while (soma < Z) {
        	soma += X;
        	cont++;
        	X++;
        }
        System.out.println(cont);
    }
	
