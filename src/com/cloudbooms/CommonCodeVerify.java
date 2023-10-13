package com.cloudbooms;

import com.sun.deploy.util.StringUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

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

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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

        //集合为空是否可以使用流，报错空指针，空集合不会
        //List<String> strList3 = null;
        List<String> strList3 = new ArrayList<>(Arrays.asList("aa"));
        List<String> collect = strList3.stream().filter(e -> "aa".equals(e)).collect(Collectors.toList());

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

        //字符串操作空指针 null
        String isContains = "";
        System.out.println(isContains.contains("a"));

        //map集合合并 合并集合不能为空
        Map<String, Object> map1 = new HashMap<>();
        map1.put("1", "aaa");
        map1.put("2", "bbb");
        Map<String, Object> map2 = new HashMap<>();
        //map2.put("3","aaa");
        //map2.put("2","bbb");
        System.out.println(map1);
        map1.putAll(map2);
        System.out.println(map1);

        //集合引用，可以直接引用
        List<String> listUse1 = new ArrayList<>();
        List<String> listUse2 = Arrays.asList("aaa", "bbb");
        listUse1.addAll(listUse2);
        List<String> listUse3 = listUse1;
        System.out.println(listUse2);
        System.out.println(listUse3);

        //BigDecimal添加，相乘空报空指针
        BigDecimal bigDecimal1 = BigDecimal.ZERO;
        BigDecimal bigNull = BigDecimal.ZERO;
        BigDecimal bigDecimal2 = bigDecimal1.add(bigNull);
        BigDecimal multiplyNull = new BigDecimal("1").multiply(BigDecimal.ZERO).setScale(2, BigDecimal.ROUND_HALF_UP);

        //可直接转换
        List<StudentEntityEO> studentEntityEOList = new ArrayList<>();
        StudentEntityEO studentEntityEO1 = new StudentEntityEO();
        studentEntityEO1.setCode("11");
        studentEntityEO1.setName("张三");
        studentEntityEO1.setLike("跑步");
        studentEntityEOList.add(studentEntityEO1);
        List<StudentEntity> studentEntityList = new ArrayList<>(studentEntityEOList);
        studentEntityList.forEach(e -> System.out.println(e.getCode() + e.getName()));

        //小数bigdecimal转字符串拼接
        BigDecimal strFormat = new BigDecimal("50000000001236.333654");
        String toStr = "限额为" + strFormat + "元";
        System.out.println(toStr);

        //BigDecimal取余
        BigDecimal bigDecimalValue = new BigDecimal("100");
        BigDecimal[] divideAndRemainder = bigDecimalValue.divideAndRemainder(new BigDecimal("3"));
        System.out.println(divideAndRemainder[0]);
        System.out.println(divideAndRemainder[1]);
        System.out.println(divideAndRemainder[1].compareTo(BigDecimal.ZERO) == 0);

        //字符串填充
        String m = "ER-";
        for (int i = 0; i < 2; i++) {
            String format = String.format("%06d", i);
            System.out.println(m + format);
        }
        String formatValue = "000001";
        String newValue = String.format("%06d", Integer.parseInt(formatValue) + 1);
        System.out.println(newValue);

        //集合转换为逗号隔开的字符串
        List<String> listTransition = Arrays.asList("1", "2", "3", "4");
        String transitionStr = String.join(",", listTransition);
        System.out.println(transitionStr);

        //String拼接null，append添加null，会把null当成字符串拼接，使用空字符串添加则没反应
        String strNull = "";
        String strNull2 = null;
        String strCon1 = "aaa" + strNull + "bbb";
        System.out.println(strCon1);
        StringBuilder stringBuilder = new StringBuilder("aaa");
        stringBuilder.append("bbb").append(strNull).append("ccc");
        System.out.println(stringBuilder.toString());

        //字符串拼接空格
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("aaa\n");
        strBuilder.append("bbb\n");
        String strConcat = strBuilder.toString();
        System.out.println(strConcat);

        //使用Calendar进行日期的加减，有两种方式，重新set时间中的某个部分，add直接对时间中的某部分进行加减操作
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DATE, day - 1);
        String calendarFormat = simpleDateFormat.format(calendar.getTime());
        System.out.println(calendarFormat);
        System.out.println("***********************************");
        System.out.println("***********************************");
        calendar.add(Calendar.MONTH, -9);
        String calendarFormat2 = simpleDateFormat.format(calendar.getTime());
        System.out.println(calendarFormat2);

        //获取月份最后一天，清空，单独操作等
        Calendar resetCalendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        int year = resetCalendar.get(Calendar.YEAR);
        int month = resetCalendar.get(Calendar.MONTH);
        //resetCalendar.set(year, month, resetCalendar.getActualMaximum(Calendar.DAY_OF_MONTH), 23, 59, 59);
        resetCalendar.set(year, month, resetCalendar.getActualMinimum(Calendar.DAY_OF_MONTH), 0, 0, 0);
        String resetTime = simpleDateFormat.format(resetCalendar.getTime());
        System.out.println(resetTime);
        System.out.println("***********************************");
        resetCalendar.clear();
        resetCalendar.set(year, month, 1);
        resetCalendar.add(Calendar.MONTH, -3);
        String resetOldTime = simpleDateFormat.format(resetCalendar.getTime());
        System.out.println(resetOldTime);
        System.out.println("***********************************");
        calendar.roll(Calendar.MONTH, -9);
        String rollTime = simpleDateFormat.format(resetCalendar.getTime());
        System.out.println(rollTime);

        //集合过滤后为空，map，reduce是否报错，不会，会返回设置的默认值  中途报错为对象属性为空
        List<StudentEntity> studentEntityStreamTest = new ArrayList<>();
        StudentEntity studentTest1 = new StudentEntity();
        studentTest1.setAge(new BigDecimal(2));
        studentEntityStreamTest.add(studentTest1);
        StudentEntity studentTest2 = new StudentEntity();
        studentTest2.setAge(new BigDecimal(1));
        studentEntityStreamTest.add(studentTest2);
        BigDecimal sumAge = studentEntityStreamTest.stream().filter(e -> e.getAge().compareTo(new BigDecimal(5)) > 0).map(StudentEntity::getAge).reduce(new BigDecimal(5), BigDecimal::add);
        System.out.println(sumAge);

        //bigDecimal类型参数传递值是否更新   不会，需要返回
        BigDecimal big1 = BigDecimal.ZERO;
        System.out.println(big1);

        //stream去重字符串，字符串为空。会计算为元素
        List<String> stringDis = Arrays.asList("aaa", null, "", "bbb", "aaa", null, "", "ccc");
        List<String> strDisList = stringDis.stream().distinct().collect(Collectors.toList());
        if (strDisList.size() > 1) {
            System.out.println(strDisList);
        }

    }

    /**
     * BigDecimal不能用作参数传递，不会带出去，只有引用类型且非空对象才能传递
     *
     * @param big1
     * @param big2
     */
    private void bigValueSet(BigDecimal big1, BigDecimal big2) {
        BigDecimal add = big1.add(new BigDecimal("3"));
    }

}
