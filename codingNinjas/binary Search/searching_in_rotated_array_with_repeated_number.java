public class searching_in_rotated_array_with_repeated_number {
    public boolean search(int[] arr, int target) {
        
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            System.out.println(low+"-"+high+"----------"+mid +"-"+ arr[mid]+"-"+ target+"---------------");
            if(target==arr[mid]){
                return true;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
            }
            else if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1; // Target in the left sorted half
                } else {
                    low = mid + 1; // Target in the right half
                }
            }
            // Otherwise, the right half is sorted
            else {
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1; // Target in the right sorted half
                } else {
                    high = mid - 1; // Target in the left half
                }
            }
        }
        return false;

    }
}
