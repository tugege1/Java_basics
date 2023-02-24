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

        //集合为空是否可以使用流，报错空指针
        //List<String> strList3 = null;
        List<String> strList3 = new ArrayList<>();
        strList3.stream().filter(e -> {
            return true;
        });

        //字符串为空字符串是否可以去空格
        String str = " ";
        String str2 = str.trim();
        System.out.println("trim：" + str2);

        BigDecimal bigDecimal = new BigDecimal(0);
        System.out.println("bigDecimal" + bigDecimal.toString());

        //去除指定字符串 不用管空格，需要注意：要去除的字符串必须在原字符串包含，否则indexOf为-1，会越界
        StringBuilder newStr = new StringBuilder("qwertyuio");
        List<String> assignList = Arrays.asList("qw", "t", "io");
        for (String assignStr : assignList) {
            if (newStr.toString().contains(assignStr)) {
                if (newStr.indexOf(assignStr) == 0) {
                    //在开头
                    newStr = new StringBuilder(newStr.substring(assignStr.length()));
                } else if (newStr.indexOf(assignStr) == newStr.length() - assignStr.length()) {
                    //在结尾
                    newStr = new StringBuilder(newStr.substring(0, newStr.lastIndexOf(assignStr)));
                } else if (newStr.indexOf(assignStr) < (newStr.length() - assignStr.length())) {
                    //在中间
                    String frontStr = newStr.substring(0, newStr.indexOf(assignStr));
                    String lastStr = newStr.substring(newStr.indexOf(assignStr) + assignStr.length());
                    newStr = new StringBuilder(frontStr + lastStr);
                }
            }
        }
        System.out.println(newStr);

        //流中循环，return不会跳出，而是跳过
        List<String> strList6 = Arrays.asList("aaa", "bbb", "ccc");
        strList6.forEach(e -> {
            if ("bbb".equals(e)) {
                return;
            }
            System.out.println(e);
        });

        //日期格式化
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM");
        Date dateMonth = simpleDateFormat2.parse("2022-11-24 00:00:00");
        System.out.println(simpleDateFormat.format(dateMonth));

        //char类型转String，String类型要放在最前面，后续即可自动转换
        char charA = '我';
        char charB = '牛';
        String charToString = String.valueOf(charA) + charB;
        System.out.println(charToString);

        //匹配指定数量字符串，实际使用需要判空及判断字符串长度是否符合
        String strA = "qwertyuio";
        String strB = "11tyu22";
        char[] charArrayB = strB.toCharArray();
        //遍历长度小的字符串，长度-2，防止下标越界，用于后续连续字符串拼接
        for (int i = 0; i < strB.length() - 2; i++) {
            //获取三个连续的字
            String adjacentStr = String.valueOf(charArrayB[i]) + charArrayB[i + 1] + charArrayB[i + 2];
            if (strA.contains(adjacentStr)) {
                System.out.println("符合条件");
            }
        }

    }

}
