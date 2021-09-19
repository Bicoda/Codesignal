// Some people are standing in a row in a park. There are trees between them which cannot be moved.
// Your task is to rearrange the people by their heights in a non-descending order without moving the trees.

final class SortByHeight {
    
    int[] sortByHeight(int[] a) {

        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]>a[j] && a[i]!=-1 && a[j]!=-1) {
                    a[i] += a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
        return a;
    }
}