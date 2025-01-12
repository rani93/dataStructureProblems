package String;

import java.util.HashMap;
import java.util.Map;

public class RomeToNumber {
    
    public int romanToInt(String s) {
       Map<Character, Integer> Rometable = new HashMap<>();
       int ans =0;
       
       Rometable.put('I',1);
       Rometable.put('V',5);
       Rometable.put('X',10);
       Rometable.put('L',50);
       Rometable.put('C',100);
       Rometable.put('D',500);
       Rometable.put('M',1000);
       for(int i=0;i<s.length();i++){
        if(i==s.length()-1){
            ans+=Rometable.get(s.charAt(i));
            break;
        }
        if(Rometable.get(s.charAt(i))>=Rometable.get(s.charAt(i+1))){
            ans+=Rometable.get(s.charAt(i));
        }
        else{
            ans-=Rometable.get(s.charAt(i));
        }

       }

return ans;
        
    }

}
