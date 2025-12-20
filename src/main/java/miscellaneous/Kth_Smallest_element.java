package miscellaneous;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_Smallest_element {

     public int KthSmallestElement(int[] arr, int B)
     {
         PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i: arr)
        {
            pq.add(i);
            if(pq.size()>B)
            {
                pq.poll();
            }
        }
         return pq.poll();
     }
}


/*
* public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {

ArrayList<Integer> C=new ArrayList<>(A);

for(int i=0;i<B;i++)////7 2 9 4 6 5 1
{
    int min=i;

for(int j=i+1;j<C.size();j++)
{
    if(C.get(j)<C.get(min))
    {min=j;}
}
int temp=C.get(i);
C.set(i, C.get(min));
C.set(min ,temp);

}

return C.get(B-1);

    }
}



/*
ArrayList<Integer> b= new ArrayList<>(A);

for(int i=0;i<B;i++)
{
 int min =i;
for(int j=i+1;j<b.size();j++)
{
    if(b.get(j)<b.get(min))
    {
         min =j;
    }


}

int temp=b.get(min);
b.set(min, b.get(i));
b.set(i, temp);

*/
