import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
    
    int[] M = new int [10];
    int i = 0;
    
    for(i = 0; i < M.length; i++){
        M[i] = sc.nextInt();
    }
    
    for(i = 0; i < M.length; i++) {
        if (M[i] <= 0) M[i] = 1;
    }    
        
    for(i = 0; i < M.length; i++){
        System.out.println("X ["+i+"] = " + M[i]);
        }
    }
}
