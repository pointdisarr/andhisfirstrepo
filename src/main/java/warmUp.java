package tasks;

import java.util.Random;

public class warmUp {


    public static void main(String[] args) {


        String s = strGen(10);
        System.out.println(s);

    }

    private static String strGen(int length) {

        Random rnd = new Random();
        int c, b, e;
        StringBuilder sb = new StringBuilder(length);


        for (int i = 0; i < length; i++) {

            e = rnd.nextInt(2);

            if (e == 1) {
                b = rnd.nextInt(26) + 97;
                sb.append((char) b);
            } else {
                c = rnd.nextInt(26) + 65;
                sb.append((char) c);

            }
            System.out.println();


        } return sb.toString();
    }
}
