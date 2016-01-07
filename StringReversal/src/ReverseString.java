/**
 * ReverseString handles different ways at reversing a string.
 * @author Thomas Ortiz
 */
public class ReverseString {

	/**
	 * Initiates the program
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		//System.out.println("Expected: " + reverse("abcd"));
		//otherReverse("abcd");
		otherReverse("Zach Sharp");
		
	}
	
	/**
	 * Reverses the string with a for loop
	 * @param s string to reverse
	 * @return reversed string
	 */
	public static String reverse(String s){
		String rev = "";
		for(int i = s.length() - 1; i >= 0; i--){
			rev += s.charAt(i);
		}
		return rev;
	}

	/**
	 * Copies the passed in string into a char[] and then parses through
	 * each index up to half of the length, switch the char's places.
	 * @param s string to reverse
	 */
	public static void otherReverse(String s){
		System.out.println(s);
		
		// Copying over String to char[]
		char[] ss = new char[s.length()];
		for(int i = 0; i < s.length(); i++){
			ss[i] = s.charAt(i);
		}
		
		// Reversal process
		int j = s.length() - 1;
		for(int i = 0; i < s.length() / 2; i++){
			char temp = ' ';
			temp = ss[i];
			ss[i] = ss[j];
			ss[j] = temp;
			j--;
			System.out.println(arrayToString(ss));
		}
	}
	
	/**
	 * Prints the array contents.
	 * @param arr to print
	 * @return string representation of array
	 */
	public static String arrayToString(char[] arr){
		String s = "";
		for(int i = 0; i < arr.length; i++){
			s += arr[i];
		}
		return s;
	}

}
