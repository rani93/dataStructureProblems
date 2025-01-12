package String;
import java.util.*;

public class shortingCharacterByFrequency {
   
//     public String frequencySort(String s) {
//         Pair str = new Pair();
//         for(int i=0 ; i<s.length;i++){
//             char c = s.charAt(i);
//             int Index = str.symbol.IndexOf(c);
//             if(Index == -1){
//             str.symbol.add(c);
//             str.frequency.add(1);

//             }
//             else{
//                 str.frequency.set(Index, str.frequency.get(Index)+1);
//             }
                   

//         }
//         String s = "";
//         for
//     }
//     class Pair{
//         ArrayList<Character> symbol = new ArrayList<>();
//         ArrayList<Integer> frequency = new ArrayList<>();
//     }


// 


    public String frequencySort(String s) {
        // Create a list to store the character-frequency pairs
        List<Pair> pairList = new ArrayList<>();
        
        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = -1;
            for (int j = 0; j < pairList.size(); j++) {
                if (pairList.get(j).Symbol == c) {
                    index = j;
                    break;
                }
            }
            if (index == -1) {
                pairList.add(new Pair(c, 1));
            } else {
                pairList.get(index).freq++;
            }
        }
        
        // Sort the list based on frequency in descending order
        pairList.sort((a, b) -> b.freq.compareTo(a.freq));
        
        // Build the result string
        StringBuilder result = new StringBuilder();
        for (Pair pair : pairList) {
            result.append(String.valueOf(pair.Symbol).repeat(pair.freq));
        }
        
        return result.toString();
    }
    
    class Pair {
        Character Symbol;
        Integer freq;
        
        Pair(Character c, Integer f) {
            Symbol = c;
            freq = f;
        }
    }
}

    

