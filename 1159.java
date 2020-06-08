import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
    
    int X = 0;
    int a = 0;
    int b = 0;
    
    while(X!=1) {
    
    X = sc.nextInt();
        
        b = 0;
        
        if(X==0){
        }else{
            if(X%2==0) {
        for(a=X; a<=X+8; a+=2)b+=a;
        }else {
        for(a=X+1; a<=X+9; a+=2)b+=a;
        }
    
        System.out.printf("%d\n", b);
    } 
  }
 }
}
