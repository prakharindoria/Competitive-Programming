import java.util.HashSet;
import java.util.Set;

public class AmicableNumber {
    public static void main(String[] args) {
        int amisum=0;
//Iterate till range of n.
        for (int n = 1; n < 10000; n++)
        {
//find the amicalblity
            int sumdiv=0;
            for (int j = 1; j < n; j++)
            {
                if(n%j==0)sumdiv+=j;
            }
            int cn=sumdiv;// cn is copy of number
            int sumchk=0; // sum check
            for (int i = 1; i < cn; i++)
            {
                if(cn%i==0)sumchk+=i;
            }

            if(sumdiv==sumchk)
            {
                amisum+=n;

            }
        }
        System.out.println(amisum);
    }
}
