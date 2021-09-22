// Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

final class ArrayMaximalAdjacentDifference {

    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int iResult = 0;
        for(int i=0; i<inputArray.length-1; i++)
        {
            iResult = Math.max(iResult, Math.abs(inputArray[i] - inputArray[i+1]));
        }
        return iResult;
    }
}