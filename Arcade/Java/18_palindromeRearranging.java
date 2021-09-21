// Given a string, find out if its characters can be rearranged to form a palindrome.

import java.util.Set;
import java.util.HashSet;

final class PalindromeRearranging {
    
    boolean palindromeRearranging(String inputString) {
    
        Set<Character> sChars = new HashSet<Character>();
        for (int i = 0; i < inputString.length();  ++i) {
            char c = inputString.charAt(i);
            if (sChars.contains(c))
            {
                sChars.remove(c);
            }
            else
            {
                sChars.add(c);
            }
        }
        return sChars.size() <= 1; 
    }
}