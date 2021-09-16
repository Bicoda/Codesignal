// Given the string, check if it is a palindrome.

final class CheckPalindrome {
    
    boolean checkPalindrome(String inputString) {
        int iLength = inputString.length();
        for (int i=0; i < iLength/2; i++){
            if (inputString.charAt(i) != inputString.charAt(iLength - i - 1)) return false;
        }
        return true;
    }
}