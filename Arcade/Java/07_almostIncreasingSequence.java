// Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

final class AlmostIncreasingSequence {
    
    boolean almostIncreasingSequence(int[] sequence) {
        boolean bRemoved = false;
        for (int i = 0; i < sequence.length-1; i++)
        {
            if (sequence[i] - sequence[i+1] >= 0)
            {
                if (bRemoved || (i-1 >= 0 && i+2 < sequence.length && sequence[i-1] - sequence[i+1] >= 0 && sequence[i] - sequence[i+2] >= 0))
                {
                    return false;
                }
                bRemoved = true;
            }
        }
        return true;
    }
}