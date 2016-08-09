import java.util.Arrays;

public class Bubble {
	public static void main(String[] args){
		int[] arr = setup();
		sort(arr);
	}
	
	public static void sort(int[] arr){
		int iterationsLeft = arr.length;
		
		for(int i = 0; i < iterationsLeft; i++){
			if(iterationsLeft <= 0 )
				break;
			
			// Prevent sorted already sorted part of array
			if( (i+1) >= iterationsLeft){
				System.out.println(Arrays.toString(arr) + "\n");
				iterationsLeft--;
				i = 0;  
			}
			
			int temp = 0;
			int first = arr[i];
			int second = arr[i+1];
			
			// Switch places
			if( first > second){
				temp = first;
				arr[i] = second;
				arr[i+1] = temp;
				System.out.println(Arrays.toString(arr));
			} else { 
				continue; 
			}
		}
	}
	
	public static int[] setup(){
		int[] arr = new int[6];
		arr[0] = 6;
		arr[1] = 5;
		arr[2] = 4;
		arr[3] = 3;
		arr[4] = 2;
		arr[5] = 1;
		return arr;
	}
	
}
