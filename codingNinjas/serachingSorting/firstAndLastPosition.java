class firstAndLastPosition{
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.

        int low = 0;
        int high = n;
        int count =0;
        int [] ans = new int[2];
        ans[0] = binarySearchfirst( arr,  n, k);
        ans[1] = binarySearchlast( arr, n,k);

        return ans;

    }
    public static int binarySearchfirst(ArrayList<Integer> arr, int n, int k){
        int index = -1;
        int low =0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            // System.out.println("mid ==" + mid);
            if(arr.get(mid)==k){
                index = mid;
                // System.out.println("index of first ==" + index);
                high = mid-1;

            }
            else if(arr.get(mid)<k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }


        }
        return index;
    }

    public static int binarySearchlast(ArrayList<Integer> arr, int n, int k){
        int index = -1;
        int low =0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid)==k){
// System.out.println("index of last ==" + index);
                index = mid;
                low = mid+1;

            }
            else if(arr.get(mid)<k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }


        }
        return index;
    }
}