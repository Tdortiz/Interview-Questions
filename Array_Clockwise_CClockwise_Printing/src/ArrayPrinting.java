/**
 * This class will construct arrays and then print them normally, 
 * clockwise starting from top left and counter clockwise starting
 * from the top right. 
 * 
 * @author Thomas Ortiz
 */
public class ArrayPrinting{
   
	/**
     * Initiates the program
     * @param args command line arguments
     */
    public static void main(String[] args){
        int[][] arr1 = { {1,2,3},
                         {4,5,6},
                         {7,8,9} };
        int[][] arr2 = { {1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16} };
        int[][] arr3 = { {1,2,3,4,5},
                         {6,7,8,9,10},
                         {11,12,13,14,15},
                         {16,17,18,19,20},
                         {21,22,23,24,25} };
        
        int[][] arr5 = { {1,2,3,4,5},
				         {6,7,8,9,10},
				         {11,12,13,14,15},
				         {16,17,18,19,20},
				         {21,22,23,24,25} };
        
        int[][] arr6 = { {1,2,3,4,5,6},
                         {7,8,9,10, 11, 12},
                         {11,12,13,14,15,16},
                         {17,18,19,20,21,22},
                         {23,24,25,26,27,28} };
        
    
        printMulti(arr1);
        printMultiCW(arr1);
        printMultiCCW(arr1);
        System.out.println();

        printMulti(arr2);
        printMultiCW(arr2);
        printMultiCCW(arr2);
        System.out.println();

        printMulti(arr3);
        printMultiCW(arr3);
        printMultiCCW(arr3);
        System.out.println();

        printMulti(arr5);
        printMultiCW(arr5);
        printMultiCCW(arr5);
        System.out.println();
        
        printMulti(arr6);
        printMultiCW(arr6);
        printMultiCCW(arr6);
        System.out.println();
        
        
    }

    /**
     * Prints the array
     * @param arr array to print.
     */
    public static void printMulti(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
    }

    /**
     * Prints the array in clockwise fashion starting from the top left.
     * @param arr array to print.
     */
    public static void printMultiCW(int[][] arr){
        //0 = going right
        //1 = going down
        //2 = going left
        //3 = going up
        int state = 0;
        int rightBound = arr[0].length-1;
        int downBound = arr.length-1;
        int leftBound = 0;
        int upperBound = 0;
        System.out.print("Clockwise: ");

        //now lets print it cw
        while (!stopCondition(rightBound, downBound, leftBound, upperBound)) {
          switch (state) {
                case 0:
                    int i = upperBound;
                    for (int j = leftBound; j <= rightBound; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    upperBound++;
                    break;
                case 1:
                    int j1 = rightBound;
                    for (int i1 = upperBound; i1 <= downBound; i1++) {
                    System.out.print(arr[i1][j1] + " ");
                    }
                    rightBound--;
                    break;
                case 2:
                    int i2 = downBound;
                    for (int j2 = rightBound; j2 >= leftBound; j2--) {
                      System.out.print(arr[i2][j2] + " ");
                    }
                    downBound--;
                    break;
                case 3:
                    int j3 = leftBound;
                    for (int i3 = downBound; i3 >= upperBound; i3--) {
                      System.out.print(arr[i3][j3] + " ");
                    }
                    leftBound++;
                    break;
            }
            state = (state + 1) % 4;
        }
        System.out.println();
    }

    /**
     * Prints the array in counter clockwise fashion starting from the top right.
     * @param arr array to print.
     */
    public static void printMultiCCW(int[][] arr){
        // 0 = left
        // 1 = down
        // 2 = right
        // 3 = up
        int state = 0;
        int rightBound = arr[0].length - 1;
        int downBound = arr.length - 1;
        int leftBound = 0;
        int upperBound = 0;
        System.out.print("CClockwise: ");

        //now lets print it ccw
        while(!stopCondition(rightBound, downBound, leftBound, upperBound)){
            switch( state ){
                case 0 :  // <
                    int i = upperBound;
                    for(int j = rightBound; j >= leftBound; j--){
                        System.out.print(arr[i][j] + " ");
                    }
                    upperBound++;
                    break;
                case 1 : // V
                    int j_1 = leftBound;
                    for(int i_1 = upperBound; i_1 <= downBound; i_1++){
                        System.out.print(arr[i_1][j_1] + " ");
                    }
                    leftBound++;
                    break;
                case 2 : // >
                    int i_2 = downBound;
                    for(int j_2 = leftBound; j_2 <= rightBound; j_2++){
                        System.out.print(arr[i_2][j_2] + " ");
                    }
                    downBound--;
                    break;
                case 3 : // ^
                    int j_3 = rightBound;
                    for(int i_3 = downBound; i_3 >= upperBound; i_3--){
                        System.out.print(arr[i_3][j_3] + " ");
                    }
                    rightBound--;
                    break;
            }
            state = (state + 1)% 4;
      }
      System.out.println();
  }

    /**
     * Tests if we can print any more of the array
     * @param r right bound
     * @param d down bound
     * @param l left bound
     * @param u upper bound
     * @return true if we should stop; false if we should continue
     */
    public static boolean stopCondition(int r, int d, int l, int u){
        if (r - l == -1 || d - u == -1 || r - 1 == -1){
            return true;
        }

      return false;
    }
}