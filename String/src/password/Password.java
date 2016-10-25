package password;
import java.util.Scanner;

/**
 * This class prints all variations of password of a defined length. 
 * @author Thomas Ortiz
 */
public class Password {

	public static void main(String[] args) 
	{
		System.out.println("Input the length of the passwords you wish to generate, enter any negative number to exit.");
		Scanner input = new Scanner(System.in);
		while(input.hasNextInt()){
			int length = input.nextInt();
			
			if(length < 0){
				System.out.println("We are exiting the program");
				System.exit(0);
			}
			
			altGeneratePasses(length);
		}
		input.close();
		
		//generatePasses(1);
		

	}
	
	/**
	 * First generate passes option that takes in a length generates a password 
	 * by use recursion.
	 * @param length of password
	 */
	public static void generatePasses(int length)
	{
		char[] s = new char[length];
		
		// Sets all to 0
		for(int i = 0; i < length; i++){
			s[i] = '0';
		}
		
		recursiveCall(s, 0, length);
		
	}
	
	/**
	 * The recursive call for generatePasses.
	 * 
	 * @param arr char array to add to
	 * @param i 
	 * @param length of password
	 */
	public static void recursiveCall(char[] arr, int i, int length)
	{
		if(i == length){
			System.out.println(arrToString(arr));
		
		} else {
			for(int j = 0; j <= 9; j++){
				recursiveCall(arr, i + 1, length);
				arr[i]++;
				
			}
			arr[i] = '0';
		}
	}

	/**
	 * ToString method for arrays
	 * 
	 * @param arr to print
	 */
	public static String arrToString(char[] arr){
		String s = "";
		
		for(int i = 0; i < arr.length; i++){
			s += arr[i];
		}
		return s;
	}
	
	/**
	 * Interative approach to print all password of specified length
	 * 
	 * @param length of password
	 */
	public static void altGeneratePasses(int length){
		String s = "";
		// Fills a string with 0s to pad the final string
		for(int i = 0; i < length; i++){
			s += "0";
		}
		
		for(int i = 0; i <= Math.pow(10, length) - 1; i++){
			String n = "";
			n += i;
			n = (s + n).substring(n.length());
			System.out.println(n);
		}
	}
}
