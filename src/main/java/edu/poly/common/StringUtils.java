package edu.poly.common;

import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtils {

    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * Check empty of string
     *
     * @return true : is empty string.
     */
    public static boolean isEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    /**
     * Check is number
     *
     * @param src for check
     * @return true = is number, false = isn't number
     */
    public static boolean isNumber(String src) {
        if (isEmpty(src)) {
            return false;
        }
        try {
            Integer.parseInt(src);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * Random string 8 characters include character & number
     *
     * @return new code about 8 characters include character & number
     */
    public static String getRandomString() {
        String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        SecureRandom rnd = new SecureRandom();

        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                sb.append(character.charAt(rnd.nextInt(character.length())));
            } else {
                sb.append(number.charAt(rnd.nextInt(number.length())));
            }
        }
        return "ST" + sb.toString();
    }

    /**
     * Get extention from files
     *
     * @param filename for get
     * @return extention of file
     */
    public static String getExtention(String filename) {
        String extention = "";
        if (filename != null) {
            int index = filename.lastIndexOf(".");
            if (index != -1) {
                // . を除いて切り出し
                extention = filename.substring(index + 1);
            }
        }
        return extention;
    }

    /**
     * Get current time
     *
     * @return String
     */
    public static String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat stringFormatDate = new SimpleDateFormat(DATE_FORMAT);
        String result = stringFormatDate.format(date);
        return result;
    }

    public static String formatCurrency(String currency){
        NumberFormat formatter = new DecimalFormat("###,###");
        String resp = formatter.format(Integer.parseInt(currency));
        resp = resp.replaceAll(",", ".");
        return resp;
    }

}
