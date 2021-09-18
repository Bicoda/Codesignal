// Given an array of strings, return another array containing all of its longest strings.

import java.util.stream.Stream;

final class AllLongestStrings {
    
    String[] allLongestStrings(String[] inputArray) {
        int iLongest = 0;
        for (int i = 0; i < inputArray.length; i++)
        {
            if (inputArray[i].length() > iLongest)
            {
                iLongest = inputArray[i].length();
            }
        }
        final int fiLongest = iLongest;
       String[] aResult = Stream.of(inputArray).filter(s -> s.length() == fiLongest).toArray(String[]::new);
        return aResult;
    }
}