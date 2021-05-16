import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        for (int i = 1; i <=20; i++) {
            System.out.println(passwordGeneratorMethod(i));
        }
    }

    private static String passwordGeneratorMethod(int length){
        String chars="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
        StringBuilder sb=new StringBuilder(length);
        Random rn=new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rn.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
