// Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

import java.util.stream.IntStream;

final class AdjacentElementsProduct {

    int adjacentElementsProduct(int[] inputArray) {
        int iResult = inputArray[1] * inputArray[0];
        for (int i = 2; i < inputArray.length; i++)
        {
            if (iResult < inputArray[i] * inputArray[i-1])
            {
                iResult = inputArray[i] * inputArray[i-1];
            }
        }
        return  iResult;
    }

    int adjacentElementsProductAlternative(int[] inputArray) {
        return IntStream.range(1, inputArray.length).map(i->inputArray[i]*inputArray[i-1]).max().getAsInt();
    }
}