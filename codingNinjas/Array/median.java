public class median {
    public static double median(int[] a, int[] b) {
    	// Write your code here.
        if (a.length > b.length) {
            return median(b, a);
        }

        int n = a.length;
        int m = b.length;
        int low = 0, high = n;

        while (low <= high) {
            int partitionA = (low + high) / 2;
            int partitionB = (n + m + 1) / 2 - partitionA;

            // Edge cases for partition (left elements out of bounds)
            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : a[partitionA - 1];
            int minRightA = (partitionA == n) ? Integer.MAX_VALUE : a[partitionA];

            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : b[partitionB - 1];
            int minRightB = (partitionB == m) ? Integer.MAX_VALUE : b[partitionB];

            // Check if we have a correct partition
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                // Found the median
                if ((n + m) % 2 == 0) {
                    return ((double) Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2;
                } else {
                    return (double) Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                // Move towards the left in array `a`
                high = partitionA - 1;
            } else {
                // Move towards the right in array `a`
                low = partitionA + 1;
            }
        }
        return 0.0;
}
    
}
