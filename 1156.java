import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {

       double S = 1;
    	int cont = 2;
    	for (int i = 3; i <= 39; i++) {
    		if (i % 2 == 1)  {
    			S += (double) i / cont;
        		cont *= 2.00;
    		}
    	}
    	System.out.println(String.format("%.2f", S));
    }
	
}
