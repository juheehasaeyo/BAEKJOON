import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
       Scanner s = new Scanner(System.in);
       
       int A = s.nextInt();
       int B = s.nextInt();
       A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
       B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
       System.out.print(A > B ? A : B);
    }
}