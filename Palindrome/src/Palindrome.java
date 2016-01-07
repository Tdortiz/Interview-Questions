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
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("car"));
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