package com.cloudbooms.basics_test2022.other_test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期类型比较
 *
 * @author Tu
 * @date 2022/6/28 10:02
 */
public class DateTest {

    public static void main(String[] args) {
        String beginTime = "2022-6-27 10:02:32";
        String middleTime = "2022-6-28 10:02:32";
        String endTime = "2022-6-29 10:02:32";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date1 = format.parse(beginTime);
            Date date2 = format.parse(endTime);
            //before 判断前一个时间是否在指定日期之前  即 date1 < date2
            boolean before = date1.before(date2);
            //after 判断前一个时间是否在指定日期之后，即 date2 > date1
            //日期相等比较都会false，可以用非来进行 >= 或 <=的实现
            boolean after = date2.after(date1);
            System.out.println(before);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
