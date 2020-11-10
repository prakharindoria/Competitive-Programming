import java.util.*;
public class SolarSystem {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int not=kb.nextInt();
        int cnot=not;
        ArrayList<Boolean> al = new ArrayList<>();
        while(not-->0)
        {
            int[] r = new int[3];
            int[] v = new int[3];
            for (int i = 0; i < 3; i++) {
                r[i] = kb.nextInt();
            }

            for (int i = 0; i < 3; i++) {
                v[i] = kb.nextInt();
            }

            int noc = kb.nextInt();
            double res[] = new double[3];
            for (int i = 0; i < 3; i++) {
                double temp = ((v[i] * noc)%360) / r[i];
                res[i] = temp;
            }

            if (res[0] == res[1] && res[1] == res[2] && res[0] == res[2])al.add(true);
            else al.add(false);
        }

        for (int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }


    }
}
