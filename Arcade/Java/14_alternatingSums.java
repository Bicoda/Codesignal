// Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete

final class AlternatingSums {
    
    int[] alternatingSums(int[] a) {

        int [] aResult = new int[2];
        for(int i=0; i<a.length; i++)
        {
            aResult[i%2] += a[i];
        }    
        return aResult;
    }
}