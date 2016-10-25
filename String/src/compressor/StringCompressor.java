package compressor;

public class StringCompressor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compress("aabbbccccv");
		compress("aabbbccccvvvv");
		compress("abcvvvv");
	}

	public static void compress(String s){	
		if( s.isEmpty() ){ return; }
		
		char current = s.charAt(0);
		char last = s.charAt(0);
		String comp = "";
		int count = 1;
		int len = s.length();
		// a a b b b c c c c v
		System.out.print(s.charAt(0));
		for(int i = 1; i < len; i++){
			System.out.print(s.charAt(i));
			current = s.charAt(i);
			
			if( current == last ){
				count++;
			} else {
				comp += last;
				last = current;
				
				if( count > 1 ){
					comp += count;
				}
				count = 1;
			}		
		}
		
		if(count == 1){ 
			comp += last; 
		} else {
			comp += last;
			comp += count;
		}
		System.out.println();
		System.out.println(comp);
		
	}
}
