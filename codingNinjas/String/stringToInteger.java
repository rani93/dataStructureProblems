package String;
class stringToInteger{
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        s = s.trim(); // Remove leading/trailing whitespaces
        if (s.length() == 0) {
            return 0;
        }
         boolean subt = false;
         double result = 0;
         String str = s.trim();
         if(str.charAt(0)=='-'||str.charAt(0)=='+' ){
            if(str.charAt(0)=='-'){subt = true;}
            str = str.substring(1, str.length());
         }
         for(int i=0;i<str.length();i++){
            int value = str.charAt(i)-'0';
            if(value >9 || value <0){
                
                break;
            }
            result = result*10 + value;
            System.out.println(result +"==================="+i+" "+value +" "+str.length()+ subt);
         }

         if(subt){
            result*=-1;
         }
         if(result > Integer.MAX_VALUE){
            return (int) Math.pow(2,31);
         }
         if(result < Integer.MIN_VALUE){
            return (int)(-Math.pow(2,31));
         }
         return (int)result;
        
    }


    //method 
        public int myAtoi2(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
    
            s = s.trim(); // Remove leading/trailing whitespaces
            if (s.length() == 0) {
                return 0;
            }
    
            int index = 0;
            int sign = 1;
            long result = 0; // Use long to handle overflow during computation
    
            // Handle sign
            if (s.charAt(index) == '-' || s.charAt(index) == '+') {
                sign = (s.charAt(index) == '-') ? -1 : 1;
                index++;
            }
    
            // Process digits
            while (index < s.length() && Character.isDigit(s.charAt(index))) {
                int digit = s.charAt(index) - '0';
                result = result * 10 + digit;
    
                // Check for overflow/underflow
                if (result * sign > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (result * sign < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
    
                index++;
            }
    
            return (int) (result * sign);
        }
    
    

}