
public class Password {

	public static void main(String[] args) 
	{
		//generatePasses(1);
		daniel(6);

	}
	
	public static void generatePasses(int length)
	{
		char[] s = new char[length];
		
		// Sets all to 0
		for(int i = 0; i < length; i++){
			s[i] = '0';
		}
		
		recursiveCall(s, 0, length);
		
	}
	
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

	public static String arrToString(char[] arr){
		String s = "";
		
		for(int i = 0; i < arr.length; i++){
			s += arr[i];
		}
		return s;
	}

	public static void daniel(int length){
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
