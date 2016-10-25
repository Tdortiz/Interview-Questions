package firstNonRepeatingChar;

import java.util.HashMap;

public class FirstNonRepeatingCharacterInString {
	
	public static int getFirstNonRepeatingChar(String s){
		for( int i = 0; i < s.length(); i++ ){
			char c = s.charAt(i);
			if( s.indexOf(c) == s.lastIndexOf(c) )
					return i;
		}
		
		return -1;
	}
		
}
