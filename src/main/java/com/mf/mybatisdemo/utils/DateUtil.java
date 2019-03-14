package com.mf.mybatisdemo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Maven
 * @since 2018-10-07 20:54
 */
public class DateUtil {
    public static final String FORMAT_PARTTERN = "yyyy-MM-dd";

    private static SimpleDateFormat dateFormat;

    public static  Date toDateWith_YYYYMMDD(String dateStr) {
        dateFormat = new SimpleDateFormat(FORMAT_PARTTERN);
        Date date = null;
        try {
            date = dateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}