// Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index.

final class FirstDuplicate {

    int firstDuplicate(int[] a) {
        for(int i=0;i<a.length;i++)

            if(a[Math.abs(a[i])-1]<0)
                return Math.abs(a[i]);
            else{
                a[Math.abs(a[i])-1]=-a[Math.abs(a[i])-1];
            }
        return -1;
    }
}