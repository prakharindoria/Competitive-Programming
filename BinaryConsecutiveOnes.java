//PS: Find No. Of Consecutive 1's in a given Number's Binary Representation.

public class Solution {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<Integer> al = new ArrayList<>();
        int n=k;
        while (n > 0) {
            if (n % 2 == 0) {
                al.add(0);
            } else {
                al.add(1);
            }
            n /= 2;

        }    
     int s=al.size();
     int count=0,res=0;
        for (int i = 0; i < s; i++) {
            if(al.get(i)==0)
                count=0;
            else
                count++;
            res=Math.max(res, count);
            
        }
        System.out.println(res);
       
        scanner.close();
    }
}
