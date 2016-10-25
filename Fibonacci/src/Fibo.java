import java.util.Scanner;

public class Fibo {
	
	public static void main(String[] args){
		System.out.println("Enter a number upto Fib series to print");
		int num = new Scanner(System.in).nextInt();
		calculateFib(num);
	}
	
	public static void calculateFib(int num){
		for( int i = 1; i <= num; i++){
			System.out.println(fibonacciRecusion(i) + " ");
		}
		
		System.out.println();
		for( int i = 1; i <= num; i++){
			System.out.println(fibonacciLoop(i) + " ");
		}
		
	}

	public static int fibonacciRecusion(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
 
		return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2);
	}
	
	public static int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		
		int fib1 = 1; 
		int fib2 = 1;
		int fibanacci = 1;
		
		for(int i = 3; i <= number; i++){
			fibanacci = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibanacci;
		}
		
		return fibanacci;
	}
	
	
}
