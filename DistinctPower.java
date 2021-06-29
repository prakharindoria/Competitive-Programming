import java.math.BigInteger;
import java.util.TreeSet;

public class DistinctPower {
    public static void main(String[] args) {

        TreeSet<BigInteger> ts=new TreeSet<BigInteger>();

        for (int i = 2; i <= 100; i++)
        {
            for (int j = 2; j <= 100 ; j++)
            {
                BigInteger bigI=new BigInteger(""+i);
                BigInteger bigProduct=new BigInteger(""+bigI.pow(j));
                ts.add(bigProduct);
            }

        }
        System.out.println(ts.size());
    }
}
