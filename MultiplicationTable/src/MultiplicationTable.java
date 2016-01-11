/**
 * Class that uses a double nested for loop to print a multiplication table.
 * 
 * @author Thomas Ortiz
 */
public class MultiplicationTable {
	
	/** Amount of rows in the multiplication table */
	public static final int rows = 12;
	/** Amount of colums in the multiplication table */
	public static final int cols = 12;
	
	/** 
	 * Initates the program and prints out a multiplicate table 
	 * through a double nested for loop
	 * 
	 * @param args command line argumetnts 
	 */
	public static void main(String[] args){
		
		printHeader();
		
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= cols; j++){
				if(j == 1){
					System.out.printf("%2d |", i);
				}
				System.out.printf("%4s ", i*j);
				if(j == cols){
					System.out.print("|");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------------");
	}
	
	/** 
	 * Prints the header of the multiplication table.
	 */
	public static void printHeader(){
		System.out.print("    "); // Alligns the top row with the extra columns because of labels.
		
		for(int i = 1; i <= rows; i++){
			System.out.printf("%4s ", i);
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------");
	}
}
