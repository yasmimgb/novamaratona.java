import java.util.Scanner; 

public class MyClass {
     public static void main(String[] args){
     
     System.out.println("informe os 100 valores");
      Scanner entrada = new Scanner(System.in);
        double a[] = new double[100];
        for(int i=0;i<a.length;i++){
            a[i] = entrada.nextDouble();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<10){
                System.out.println("A["+i+"] = "+a[i]);
            }
        }
    }
}
