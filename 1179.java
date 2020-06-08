import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {		
		int [] matrizImpar = new int[5];
		int [] matrizPar = new int[5];		
		
		Scanner sc = new Scanner(System.in);
		
		int entradaUsuario;
		int nPar = 0;
		int nImpar = 0;		
		System.out.println("Digite 15 numeros");
		for (int i = 0; i < 15; i++) {
			
			entradaUsuario = sc.nextInt();
		    if (entradaUsuario % 2 == 0) {
		    	if (nPar == 5){
		    		for (int j = 0; j < matrizPar.length; j++) {
		    			System.out.println("par["+ j +"] = "+ matrizPar[j]);
		    			matrizPar[j] = 0;	
					}
		    		nPar = 0;		    		
		    	}    			    	
				matrizPar[nPar] = entradaUsuario;				
		    	nPar = nPar + 1;				
			}else {
		    	if (nImpar == 5){
		    		for (int j = 0; j < matrizImpar.length; j++) {
			    		System.out.println("impar["+ j +"] = "+ matrizImpar[j]);
		    			matrizImpar[j] = 0;	
					}
		    		nImpar = 0;		    		
		    	}
		    			    	
				matrizImpar[nImpar] = entradaUsuario;				
		    	nImpar = nImpar + 1;				
			}
		}		
		sc.close();
	}

}
