package String;

public class RemovingOuterMostParenthesis {

    public String removeOuterParentheses(String s) {
        int count =0;
        String ans ="";
        int prev=0;
        for(int i=0;i<s.length();i++){
             prev = count;
            if(s.charAt(i)=='('){
               
                count++;
            }
            else if( s.charAt(i)==')'){
                count--;
            }
            if(count==0){
                continue;
            }
            if(prev==0&&count ==1){
                continue;
            }

            ans+= s.charAt(i);
        }
        return ans;

    }
}