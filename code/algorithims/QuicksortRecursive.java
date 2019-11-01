import java.util.Arrays;

/** 
 * @author Anthony Bruno - brun0074 
 * Recursively quicksorts an array of ints.
 * All code is created by me unless otherwise indicated
 *
 * Instructions of use: java QuicksortRecursive [array size] [number of tests to perform]
 */
public class QuicksortRecursive {
        private static int[] arr;

        public static void main(String[] args) {
 		        int arraySize = args.length > 0 ? Integer.parseInt(args[0]) : 1000;
                int noOfTests = args.length > 1 ? Integer.parseInt(args[1]) : 100000/arraySize;
                System.out.println("Using an array size of: " + arraySize + " Number of tests: " +noOfTests);

                arr = new int[arraySize];
                for (int j = 0; j < noOfTests; j++) {
                    for (int i = 0; i < arr.length; i++) {
                            arr[i] = (int)(Math.random() * arraySize);
                    }
                    int left = 0;
                    int right = arr.length - 1;
                    int[] testArray = Arrays.copyOfRange(arr,0, arraySize);
                    
                    
                    long timeStarted = System.currentTimeMillis();
                    quickSort(left,right);
                    long timeEnded = System.currentTimeMillis(); 
                    long timeTaken = timeEnded - timeStarted; 
    
                    System.out.println(timeTaken);
                    Arrays.sort(testArray);
                    if (!Arrays.equals(arr, testArray)) {
                       System.out.println("ARRAY WAS NOT SORTED, STOPPING"); 
                       System.exit(0);
                    }
                }
        }

        /** 
         *  The recursive function 
         * @param left The leftmost/first element to be sorted  in subarray 
         * @param right The rightmost/last element to be sorted in subarray
         */
        public static void quickSort(int left, int right) {                
            if (right > left) {
                int pivot = partition(left, right);
                    
                if (right - (pivot+1) > (pivot-1) - left) { //sorts smaller partition first
                    quickSort(left, pivot-1);
                    quickSort(pivot+1, right);
                } else {
                    quickSort(pivot+1, right);
                    quickSort(left, pivot-1);
                }
            }
        } 

        /** 
         * Sorts array from left element to right element, and returns the pivot. 
         * @param left The leftmost/first element that is sorted
         * @param right The rightmost/last element that is sorted
         * @return the pivot
         */
        public static int partition(int left, int right) {
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
                   swap(left,right);
                   left++;
                   right--;
                }
           }
           if (arr[right] < arr[pivot]) {
                swap(pivot,right);
           }
           pivot = right; 
           return pivot;
            
        }

        /** 
         * Swaps 2 elements in the 'arr' array. 
         * @param first The first element to be swapped
         * @param second The second element to be swapped
         */
        public static void swap(int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
}
