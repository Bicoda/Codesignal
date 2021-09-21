// A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
// Given a ticket number n, determine if it's lucky or not.

final class IsLucky {

    boolean isLucky(int n) {
        String sN = Integer.toString(n);
        int iDifference = 0;
        for (int i = 0; i < sN.length()/2; i++)
        {
            iDifference += sN.charAt(i) - sN.charAt(sN.length() - 1 - i);
        }
        return iDifference == 0;
    }    
}