// Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
// Given two arrays a and b, check whether they are similar.

final class AreSimilar {
    
    boolean areSimilar(int[] a, int[] b) {
        int iCount = 0, i = 0, iFirstMissmatchA = 0, iSecondMissmatchA = 0, iFirstMissmatchB = 0, iSecondMissmatchB = 0;

        while(iCount < 3 && i < a.length)
        {
            if(a[i] != b[i])
            {
                iCount++;
                if(iCount == 1)
                {
                    iFirstMissmatchA = a[i];
                    iFirstMissmatchB = b[i];
                }
                else if(iCount == 2)
                {
                    iSecondMissmatchA = a[i];
                    iSecondMissmatchB = b[i];         
                }
            }
            i++;
        }
        return iCount <= 2 && iFirstMissmatchA == iSecondMissmatchB && iFirstMissmatchB == iSecondMissmatchA;
    }
}