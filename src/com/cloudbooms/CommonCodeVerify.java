package com.cloudbooms;

import com.sun.deploy.util.StringUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 日常代码验证测试
 *
 * @author Tu
 * @date 2023/2/9 10:36
 */
public class CommonCodeVerify {

    public static void main(String[] args) throws ParseException {
        String email = "aaa@123.com.cn,bbb@123.com.cn";
        List<String> strings = Arrays.asList(email.split(","));
        System.out.println(strings);

        String a = " Bureau Veritas ";
        String b = StringUtils.trimWhitespace(a);
        System.out.println(b);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date1 = simpleDateFormat.parse("2022-11-24 00:00:00");
        Date date2 = simpleDateFormat.parse("2052-11-24 00:00:00");
        LocalDateTime localDateTime1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime localDateTime2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        long years = ChronoUnit.YEARS.between(localDateTime1, localDateTime2);
        System.err.println(years);

        BigDecimal d1 = new BigDecimal("0");
        BigDecimal d2 = new BigDecimal("999999999999");
        BigDecimal divide = d1.divide(d2, 8, BigDecimal.ROUND_HALF_UP);
        System.out.println(divide.toString());
        System.out.println(divide.toPlainString());

        List<String> strList = Arrays.asList("aa", "bb", "cc");
        String dd = null;
        System.out.println(strList.contains(dd));

        //两个时间都不能为空
        Date date3 = simpleDateFormat.parse("2022-11-24 00:00:00");
        Date date4 = simpleDateFormat.parse("2022-11-24 00:00:00");
        System.out.println(date3.before(date4));

        List<String> strList2 = new ArrayList<>();
        strList2.forEach(e -> {
            System.out.println("aa");
        });

        //集合为空是否可以使用流
        //List<String> strList3 = null;
        List<String> strList3 = new ArrayList<>();
        strList3.stream().filter(e -> {
            return true;
        });

        //字符串为空字符串是否可以去空格
        String str = "";
        String str2 = str.trim();
        System.out.println(str2);

    }

}
