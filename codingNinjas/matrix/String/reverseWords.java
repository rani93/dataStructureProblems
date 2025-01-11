package String;

public class reverseWords {
    public String reverseWords(String s) {
        String answer="" ;
        for(int i=0;i<s.length();i++){
         if(s.charAt(i)==' ') continue;
         String word ="";
         while(i<s.length() && s.charAt(i)!=' '){
             word += s.charAt(i);
             i++;
         }
 
         // System.out.println(word);
         answer = word +" " + answer;
        }
        return answer.trim(); 
 
     }
}
