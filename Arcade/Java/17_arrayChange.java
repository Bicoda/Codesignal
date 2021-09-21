// You are given an array of integers. On each move you are allowed to increase exactly one of its element by one.
// Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

final class ArrayChange {
 
    int arrayChange(int[] a) {
        int iResult = 0;
        for(int i = 0; i < a.length-1; i++)
        {
            if(a[i] >= a[i+1])
            {
                iResult += a[i] + 1 - a[i+1];
                a[i+1] = a[i] + 1;
            }
        }
        return iResult;
    }
}