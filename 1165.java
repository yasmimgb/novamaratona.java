import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
    
    int n = 0;
    int x = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    
    n = sc.nextInt();
    
    for(int i = 0; i < n; i++){
      
    x = sc.nextInt();
        c = 0;
        
    for(b = 1; b <= x; b++){
    
    if(x % b == 0){
        c = c + 1;
    }
    }
    if(c == 2){
        	System.out.printf("%d eh primo.\n", x);
    }else {
        	System.out.printf("%d nao eh primo.\n", x);
            }
        }
    }
}
