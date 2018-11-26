package edu.poly.common;

import java.security.SecureRandom;
import java.util.Arrays;

public class TokenUtils {

    public String makeToken() {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        String token = Arrays.toString(bytes);
        return token;
    }

    public static String getRandomString() {
        String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        SecureRandom rnd = new SecureRandom();

        StringBuilder sb = new StringBuilder(50);
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                sb.append(character.charAt(rnd.nextInt(character.length())));
            } else {
                sb.append(number.charAt(rnd.nextInt(number.length())));
            }
        }
        return sb.toString();
    }

}
