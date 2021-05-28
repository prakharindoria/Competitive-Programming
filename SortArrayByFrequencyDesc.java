/*
Sort array by frequency desc.
*/
import java.util.*;
import java.util.stream.Collectors;

public class DecendingOrderOfFrequency {
    public static void main(String[] args) {
        int arr[]={2,5,6,2,3,5,5};//output {5, 5, 5, 2, 2, 6, 3}
        HashMap<Integer, Integer> hm=new HashMap<>();
        for (int i:arr) {
//            if(hm.containsKey(arr[i]))hm.put(arr[i],hm.get(arr[i])+1);
//            else hm.put(arr[i],1);
            if(!hm.containsKey(i))hm.put(i,1);
            else hm.replace(i,hm.get(i),hm.get(i)+1);
        }
        System.out.println(hm);
        int brr[]=new int[hm.size()];
        int x=0;
        for(Map.Entry e:hm.entrySet()){
            brr[x++]=(int)e.getValue();
        }
        Arrays.sort(brr);
        for (int i:brr) System.out.println(i);

        for (int i = brr.length; i >0; i--) {
                //logic for printing key 'n' times.
        }


    }

}
