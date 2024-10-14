import java.util.ArrayList;

class separateNegativeAndPositive{
     public static int[] separateNegativeAndPositive(int a[]) {
        // ArrayList<Integer> negative = new ArrayList<>();
        // ArrayList <Integer> positive = new ArrayList<>();
        // int[]ans = new int[a.length];
        // for(int i=0;i< a.length;i++){
        //     if(a[i]<0){
        //         negative.add(a[i]);
        //     }
        //     else{
        //         positive.add(a[i]);
        //     }

        // }
        // int i=0;
        // while(i!=negative.size()){
        //     ans[i]=negative.get(i);
        //     i++;

        // }
        // while(i!=a.length){
        //     ans[i]=positive.get(i-negative.size());
        //     i++;
        // }

        // return ans;




       
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>();
        int[] ans = new int[a.length];

        // Separate negative and positive numbers
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                negative.add(a[i]);
            } else {
                positive.add(a[i]);
            }
        }

        int i = 0;

        // Copy negative numbers into ans[]
        for (int neg : negative) {
            ans[i++] = neg;
        }

        // Copy positive numbers into ans[]
        for (int pos : positive) {
            ans[i++] = pos;
        }

        return ans;
    


    }
}