package faculdade;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);
		
		float[][] M = new float[12][12];
		System.out.println("Digite a linha que deseja Somar ou tirar Media");
		int C = sc.nextInt();
		
		if ((C <= 0) || (C >= 11)) {
			System.out.println("Numero deve ser entre 0 e 11");
			System.exit(0);			
		}
		
		System.out.println("Digite se deseja tirar media(M) ou se deseja Somar(S)");
		String T = sc.nextLine();
		
		if (T != "M" || T != "S") {
			System.out.println("Só deve ser inserido S ou M");
			System.exit(0);						
		}
		
		System.out.println("digite o valor da tabela");
		
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				M[i][j] = sc.nextFloat();
			}			
		}

		float soma = 0;
				
		for (int i = 0; i < 11; i++) {
			soma += M[i][C];										
		}
		
		if(T == "S") {
			System.out.println(soma);			
		}else if (T == "M") {
			System.out.println(soma / 11);			
		}				
		
		sc.close();
	}

}
