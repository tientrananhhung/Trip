package edu.poly.common;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

    /**
     * Get current time
     *
     * @return current time
     */
    public static Timestamp getCurrentTime() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static Date convertDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date date1 = new Date();
        try {
            date1 = dateFormat.parse(date);
        } catch (Exception ex) {
            date1 = null;
        }
        return date1;
    }
}
