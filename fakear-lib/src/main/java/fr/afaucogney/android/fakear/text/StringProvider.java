package fr.afaucogney.android.fakear.text;

import java.util.Random;

/**
 * Created by afaucogney on 12/12/2016.
 */

public class StringProvider {

    public static String getRandomString(int size) {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }
}
