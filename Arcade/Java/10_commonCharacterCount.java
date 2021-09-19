// Given two strings, find the number of common characters between them.

final class CommonCharacterCount{

    int commonCharacterCount(String s1, String s2) {
        int iResult = 0;
        for (int i = 0; i < s1.length(); i++)
        {
            if (s2.contains(String.valueOf(s1.charAt(i))))
            {
                iResult ++;
                s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");            
            }
        }
        return iResult;
    }
}