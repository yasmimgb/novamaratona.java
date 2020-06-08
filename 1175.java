import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	
    	System.out.println("informe os 20 valores: ");
        Scanner input = new Scanner(System.in);
        int n[] = new int[20];
        
        for (int i = 0; i < n.length; i++) {
            n[i] = input.nextInt();
        }
        
        int m = n.length - 1;
        for (int i = 0; i < n.length / 2; i++) {
            int aux = n[i];
            n[i] = n[m];
            n[m] = aux;
            m--;
        }
               
        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "]" + " = " + n[i]);
        }
    }
}
