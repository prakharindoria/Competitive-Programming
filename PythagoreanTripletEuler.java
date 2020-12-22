/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
public class PythagoreanTripletV2 {
    public static void main(String[] args) {
        boolean flag = false;
        int product = 0;
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                int k = 1000 - (i + j);
                if (i + j + k == 1000) {
                    int lhs = (j * j) + (k * k);
                    int rhs = i * i;
                    if (lhs == rhs) {
                        flag = true;
                        product = i * j * k;
                    }
                }
                if (flag == true) break;
            }
            if (flag == true) break;
            }
            System.out.println(product);

        }
    }

