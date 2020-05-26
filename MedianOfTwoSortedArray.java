/*There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
*/
class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        double median=0;
        double s1=0,s2=0;
        double m1=0,m2=0;
        if(n1.length>0)
        {
        for(int i=0;i<n1.length;i++){
            s1=n1[i]+s1;    
        }
        m1=s1/n1.length;
        }
        else m1=0.0;
        if(n2.length>0)
        {
        for(int i=0;i<n2.length;i++){
            s2=n2[i]+s2;    
        }
        m2=s2/n2.length;
         }
        else
            m2=0.0;
        if(m1>0 && m2>0)
        median=(m1+m2)/2.0;
        else if(m1==0)
            median=m2;
        else if(m2==0)
            median=m1;
     return median;
    }
   
}
