package String;

public class LongestPalindromicSubString {
    // class Solution {
//     public String longestPalindrome(String s) {
//         String ans ="";
       
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                String sub = new StringBuilder(s.substring(i,j+1)).reverse().toString();
//                if(sub.length()>ans.length() && s.substring(i,j+1).equals(sub)){
//                 ans = sub;
//                } 
//             }
//         }

//         return ans;
        
//     }
// }
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }

            // Check for even-length palindromes
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }

        return longest;
    }

    private String expandAroundCenter(String s, int left, int right) {
        // Expand outward as long as the characters match
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the palindrome substring
        return s.substring(left + 1, right);
    }
}

}
