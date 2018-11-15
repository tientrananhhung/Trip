package edu.poly.common;

import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeUtils {

    /**
     * Get current time
     *
     * @return current time
     */


    public static Timestamp getCurrentTime() {
//        Date currentTime = new Date();
//        DateFormat currentFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
//        currentFormat.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
//        String ausTime  = currentFormat.format(currentTime);
//        System.out.println(currentFormat.getTimeZone());
//        Date ausTimeInLocal = null;
//        try {
//            ausTimeInLocal = currentFormat.parse(ausTime);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        //get the time stamp object using above date object
//        Timestamp ausTimeStampInLocal = new Timestamp(ausTimeInLocal.getTime());
//
//        Calendar cSchedStartCal = Calendar.getInstance();
//        cSchedStartCal.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
//        System.out.println(cSchedStartCal.getTimeZone());
//        return new Timestamp(cSchedStartCal.getTimeInMillis());
        return  new Timestamp(System.currentTimeMillis()+25200000);
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
