

import java.util.* ;

public class SumOfMinAndMax {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Write your code here.
      
    
     Arrays.sort(arr);
      return arr[0]+arr[arr.length-1];
      
  }
}