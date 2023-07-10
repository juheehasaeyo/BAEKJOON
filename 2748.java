import java.util.Scanner;

public class Main{
	public static void main(String[] args){
       Scanner s = new Scanner(System.in);
      
       int n = s.nextInt();
       long [] fibo = new long[91];
       fibo[0] = 0;
       fibo[1] = 1;
       
       for(int i=2; i<fibo.length; i++) {
    	   fibo[i] = fibo[i-1] + fibo[i-2];
       }
       System.out.println(fibo[n]);
    }
}