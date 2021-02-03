import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class CountingPairs {
    public static void main(String[] args) {
    int arr[]={1,1,2,2,3,3};
    int k=1;
    int res=countPairs(arr,k);
        System.out.println(res);
    }


    public static int countPairs(int arr[],int k) {
        int count = 0;
        TreeSet<Integer> ts=new TreeSet<Integer>();

        for(int e:arr)
        {ts.add(e);}
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.addAll(ts);

        for (int i = 0; i < al.size(); i++)
        {
            for (int j = i + 1; j < al.size(); j++)
                if (al.get(i) + k == al.get(j) || al.get(j) + k == al.get(i))
                {
                    count++;

                }
        }
        return count;
    }



}
