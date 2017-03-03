package similarCharacters;

import java.util.HashMap;
import java.util.Map;

public class SimilarCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abbc";
		String str2 = "bab";
		String ret = getSimilarCharacters(str1, str2);
	
	}

	public static String getSimilarCharacters(String str1, String str2) {
		String strReturn = "";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		// go through first string and create map
		for(int i = 0; i < str1.length(); i++){
			char currentChar = str1.charAt(i);
			// increment the key if it already exists
			if( charMap.containsKey(currentChar) ){
				charMap.put(currentChar, charMap.get(currentChar)+1);
			// else set it to 1 if it doesn't exist
			} else {
				charMap.put(currentChar, 1);
			}
		}
		
		// Go through 2nd string and create strReturn
		for(int i = 0; i < str2.length(); i++){
			char currentChar = str2.charAt(i);
			if( charMap.containsKey(currentChar) && charMap.get(currentChar) != 0 ){
				strReturn += currentChar;
				charMap.put(currentChar, charMap.get(currentChar)-1);
			}
		}
		
		return strReturn;
	}

}
