import java.util.Arrays;
import java.lang.Math;

/** 
 * @author Anthony Bruno - brun0074
 * Iteratively quicksorts an array of ints.
 * All code is created by me unless otherwise indicated.
 *
 * Instructions of use: java QuicksortIterative [array size] [number of tests to perform]
 */
public class QuicksortIterative {


        public static void main(String[] args) {
                int arraySize = args.length > 0 ? Integer.parseInt(args[0]) : 1000;
                int noOfTests = args.length > 1 ? Integer.parseInt(args[1]) : 100000/arraySize;
                System.out.println("Using an array size of: " + arraySize + " Number of tests: " +noOfTests);
                
                int[] randomArr = new int[arraySize];
                for (int j = 0; j < noOfTests; j++) {
                    for (int i = 0; i < randomArr.length; i++) {
                            randomArr[i] = (int)(Math.random() * arraySize);
                    }
                    int left = 0;
                    int right = randomArr.length - 1;
                    int[] testArray = Arrays.copyOfRange(randomArr,0, arraySize);
                    
                    
                    long timeStarted = System.currentTimeMillis();
                    quickSort(randomArr,left,right);
                    long timeEnded = System.currentTimeMillis(); 
                    long timeTaken = timeEnded - timeStarted; 
    
                    System.out.println(timeTaken);
                    Arrays.sort(testArray);
                    if (!Arrays.equals(randomArr, testArray)) {
                       System.out.println("ARRAY WAS NOT SORTED, STOPPING"); 
                       System.exit(0);
                    }
                }

        }

        public static void quickSort(int[] arr, int left, int right) {
                int[] stack = new int[arr.length];
                int stackPointer = 0;
                stack[stackPointer++] = left;
                stack[stackPointer++] = right;
                
                //while loop
                while (stackPointer > 0) {
                    right = stack[--stackPointer];
                    left = stack[--stackPointer];
                    if (right > left ) {
                        int pivot = partition(arr, left, right);
                        if ((pivot-1) - left > right - (pivot+1)){ //pushes largest pair first
                            stack[stackPointer++] = left; //Left
                            stack[stackPointer++] = pivot-1; // Right
                            stack[stackPointer++] = pivot+1; // Left
                            stack[stackPointer++] = right; //Right
                        } else {
                            stack[stackPointer++] = pivot+1; // Left
                            stack[stackPointer++] = right; //Right
                            stack[stackPointer++] = left; //Left
                            stack[stackPointer++] = pivot-1; // Right

                        }
                    }
                }
                
        }

        /** 
         * Sorts the given subarray. Uses leftmost element as pivot. 
         * @param arr the array to be sorted
         * @param left the left bound of the sub array
         * @param right the right bound of the sub array 
         * @return where the pivot is locate in the array
         */
        public static int partition(int[] arr, int left, int right) {
           int pivot = left; 
           left++;
           while (left <= right) {
                //increment left
                while (left <= right && arr[left] <= arr[pivot]) {
                    left++;
                }

                //increment right
                while (left <= right && arr[right] >= arr[pivot]){
                    right--;    
                }

                //found elements that need swapping
                if (left < right) {
                   swap(left,right,arr);
                   left++;
                   right--;
                }
           }
           if (arr[right] < arr[pivot]) {
                swap(pivot,right,arr);
           }
           pivot = right; 
           return pivot;
        }

        /** 
         * Swaps two elements in an array. 
         * @param firstPosition The position of the first element
         * @param secondPosition The position of the second element
         * @param a The array
         */
        public static void swap(int firstPosition, int secondPosition, int[] a) {
            int temp = a[firstPosition];
            a[firstPosition] = a[secondPosition];
            a[secondPosition] = temp;
        }
            


}
