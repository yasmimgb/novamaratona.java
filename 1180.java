import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero de 1 a 1000");
		int N = sc.nextInt();
		
		if((1 > N) || (N >1000)){
			System.out.println("Deve ser da faixa de 1 a 1000");
			System.exit(0);
		};
		
		int[] x = new int[N];	
					
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();			
		}
		
		int menorValor = 10001;
		int posicao = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (menorValor > x[i]) {
				menorValor = x[i];
				posicao = i;							
			}			
		}
		
		System.out.println("Menor Valor = " + menorValor);
		System.out.println("Posicao = " + posicao);
		sc.close();
	}

}
