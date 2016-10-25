package palindrome;
import java.util.Scanner;

/**
 * This class checks if a string is a palindrome or not.
 * @author Thomas Ortiz
 */
public class Palindrome {
	/**
	 * Initiates the program
	 * @param args command line arguments
	 */
	public static void main(String[] args){
		System.out.println("Input words you want to test if they are palindromes. If you want to exit type -1.");
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextLine()){
			String text = input.nextLine();
			
			if(text.equals("-1")){
				System.out.println("We are exiting the program");
				System.exit(0);
			}
			
			if(isPalindrome(text)){
				System.out.println(text + " is a palindrome!");
			} else {
				System.out.println(text + " is NOT a palindrome!");
			}
		}
		input.close();
	}
	
	/**
	 * Part of program that checks if a string is a palindrome.
	 * @param s String to check
	 * @return true if palindrome. false otherwise.
	 */
	public static boolean isPalindrome(String s){
		s = s.toLowerCase();
		int j = s.length() - 1;
		
		for(int i = 0; i < s.length()/2; i++){
			if(s.charAt(j) != s.charAt(i)){
				return false;
			} else {
				j--;
			}
		}
		
		return true;
	}
}