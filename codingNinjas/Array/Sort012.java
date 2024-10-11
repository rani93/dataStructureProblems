public class Sort012 {
    public static void sort012(int[] arr)
    {
        //Write your code here
        int zero=0;
        int one =0;
        int two =0;
        int index = 0;
        while(index!=arr.length){
            switch(arr[index]){
                case 0 : {zero++;
                break;}
                case 1:{
                    one++;
                    break;
                }
                case 2:{ two++;
                break;
                }
            }
            index++;
        }
        // System.out.println(zero +" " +one +" "+two);
         index = 0;
       while(zero!=0){
           arr[index] =0;
           index++;
           zero--;
       }
       while(one!=0){
           arr[index] =1;
           index++;
           one--;
       }
       while(two!=0){
           arr[index] =2;
           index++;
           two--;
       }

    }
}
