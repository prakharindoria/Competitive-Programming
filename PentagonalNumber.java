import java.util.ArrayList;

public class PentagonalNumber {
    public static ArrayList<Integer> al=new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            al.add(pen(i));

        }
        System.out.println(isPen(5));
    }
//Func to check numbers
    public static int pen(int n){
        return n*(3*n-1)/2;
    }

    public static boolean isPen(int n){
        return al.contains(n);



    }

}
