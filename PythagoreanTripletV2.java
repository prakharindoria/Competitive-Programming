public class PythagoreanTripletV2 {
    public static void main(String[] args) {
//Itration 2
        boolean flag = false;
        int product = 0;
//Check for Pythagorean Triplets
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
//check for boolean results
                if (flag == true) break;
            }
            if (flag == true) break;
            }
            System.out.println(product);

        }
    }

