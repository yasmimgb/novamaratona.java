import java.io.IOException;
import java.util.Scanner; 

public class MyClass {
     public static void main(String[] args) throws IOException {
     
       Scanner sc = new Scanner (System.in);
      System.out.println("Digite o número aqui: ");
      int[] A = new int[10];
      A[0] = sc.nextInt();
     
        for(int i=1; i < 10; i++){
            A[i] = A[i-1] * 2;
        }
        for (int i=0; i <10; i++) {
            System.out.println("N["+ i +"] = " + A[i]);
     
     
    }
}
}
