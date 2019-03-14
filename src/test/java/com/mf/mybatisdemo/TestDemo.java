package com.mf.mybatisdemo;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author Maven
 * @since 2018-11-09 16:39
 */
public class TestDemo {

    private static final String PAY_CANCEL_START_TIME = "01:00";
    private static final String PAY_CANCEL_END_TIME = "23:00";

    private static final Integer PAY_CANCEL_START_TIME_BEGIN = 1;
    private static final Integer PAY_CANCEL_START_TIME_END = 23;


    public static void main(String[] args) {

        LocalTime zero = LocalTime.of(23, 0, 0); // 00:00:00

        System.out.println(zero);
        // LocalTime mid = LocalTime.parse("12:00:00"); // 12:00:00
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        LocalTime startLocalTime = LocalTime.parse("17:22");
        LocalTime endLocalTime = LocalTime.parse(PAY_CANCEL_END_TIME);
        System.out.println(startLocalTime);
        System.out.println(endLocalTime);

        System.out.println(nowTime.isAfter(startLocalTime));
        System.out.println(nowTime.isBefore(endLocalTime));





    }




    /**
     * 判断时间是否在时间段内*
     *
     * @param date         当前时间 yyyy-MM-dd HH:mm:ss
     * @param strDateBegin 开始时间 00:00:00
     * @param strDateEnd   结束时间 00:05:00
     * @return
     */

    public static boolean isInDate(Date date, String strDateBegin,

                                   String strDateEnd) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String strDate = sdf.format(date);

// 截取当前时间时分秒

        int strDateH = Integer.parseInt(strDate.substring(11, 13));

        int strDateM = Integer.parseInt(strDate.substring(14, 16));

        int strDateS = Integer.parseInt(strDate.substring(17, 19));

// 截取开始时间时分秒

        int strDateBeginH = Integer.parseInt(strDateBegin.substring(0, 2));

        int strDateBeginM = Integer.parseInt(strDateBegin.substring(3, 5));

        int strDateBeginS = Integer.parseInt(strDateBegin.substring(6, 8));

// 截取结束时间时分秒

        int strDateEndH = Integer.parseInt(strDateEnd.substring(0, 2));

        int strDateEndM = Integer.parseInt(strDateEnd.substring(3, 5));

        int strDateEndS = Integer.parseInt(strDateEnd.substring(6, 8));

        if ((strDateH >= strDateBeginH && strDateH <= strDateEndH)) {

// 当前时间小时数在开始时间和结束时间小时数之间

            if (strDateH > strDateBeginH && strDateH < strDateEndH) {

                return true;

// 当前时间小时数等于开始时间小时数，分钟数在开始和结束之间

            } else if (strDateH == strDateBeginH && strDateM >= strDateBeginM

                    && strDateM <= strDateEndM) {

                return true;

// 当前时间小时数等于开始时间小时数，分钟数等于开始时间分钟数，秒数在开始和结束之间

            } else if (strDateH == strDateBeginH && strDateM == strDateBeginM

                    && strDateS >= strDateBeginS && strDateS <= strDateEndS) {

                return true;

            }

// 当前时间小时数大等于开始时间小时数，等于结束时间小时数，分钟数小等于结束时间分钟数

            else if (strDateH >= strDateBeginH && strDateH == strDateEndH

                    && strDateM <= strDateEndM) {

                return true;

// 当前时间小时数大等于开始时间小时数，等于结束时间小时数，分钟数等于结束时间分钟数，秒数小等于结束时间秒数

            } else if (strDateH >= strDateBeginH && strDateH == strDateEndH

                    && strDateM == strDateEndM && strDateS <= strDateEndS) {

                return true;

            } else {

                return false;

            }

        } else {

            return false;

        }

    }


}