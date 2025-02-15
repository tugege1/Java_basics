package com.cloudbooms;

import com.sun.deploy.util.StringUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        StringBuilder newStr = new StringBuilder("qwertqwio");
        List<String> assignList = Arrays.asList("qw", "we", "io");
        for (String assignStr : assignList) {
            if (newStr.toString().contains(assignStr)) {
                while (newStr.indexOf(assignStr) != -1) {
                    int assignIndex = newStr.indexOf(assignStr);
                    if (assignIndex == 0) {
                        //在开头
                        newStr = new StringBuilder(newStr.substring(assignStr.length()));
                    } else if (assignIndex == newStr.length() - assignStr.length()) {
                        //在结尾
                        newStr = new StringBuilder(newStr.substring(0, newStr.lastIndexOf(assignStr)));
                    } else if (assignIndex < (newStr.length() - assignStr.length())) {
                        //在中间
                        String frontStr = newStr.substring(0, assignIndex);
                        String lastStr = newStr.substring(assignIndex + assignStr.length());
                        newStr = new StringBuilder(frontStr + lastStr);
                    }
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

        //获取月份最后一天，清空，单独操作等   getActualMaximum使用注意，前面set不会立即生效，需要先clear再set，或者同时set日期
        Calendar resetCalendar = Calendar.getInstance();
        int year = resetCalendar.get(Calendar.YEAR);
        int month = resetCalendar.get(Calendar.MONTH);
        resetCalendar.set(year, month, resetCalendar.getActualMaximum(Calendar.DAY_OF_MONTH), 23, 59, 59);
        //resetCalendar.set(year, month, resetCalendar.getActualMinimum(Calendar.DAY_OF_MONTH), 0, 0, 0);
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
        BigDecimal sumAge = studentEntityStreamTest.stream().map(StudentEntity::getAge).filter(age -> age.compareTo(new BigDecimal(5)) > 0).reduce(new BigDecimal(5), BigDecimal::add);
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

        //分割出的字符串是否按照顺序，会按照顺序
        String splitStr = "bbb,ggg,www,222,999";
        List<String> splitList = Arrays.asList(splitStr.split(","));
        System.out.println(splitList);

        //判断对象(字段)是否改变，注意Arrays.asList返回的集合不能加减操作   内层循环break，只会跳出当前循环  避免数据计算错误：remove防止外层数据重复,break防止内层数据重复
        List<String> breakList1 = new ArrayList<>(Arrays.asList("aaa", "aaa", "ccc", "ddd", "eee"));
        List<String> breakList2 = new ArrayList<>(Arrays.asList("aaa", "bbb", "aaa", "ddd", "ccc"));
        int count = 0;
        for (String break1 : breakList1) {
            for (String break2 : breakList2) {
                if (break1.equals(break2)) {
                    count++;
                    breakList2.remove(break2);
                    break;
                }
            }
        }
        boolean ifChange = count == breakList1.size();
        System.out.println(ifChange);

        //正则表达式截取指定范围字符串 (?<=exp2)exp1:查询2后面的1   exp1(?=exp2):查询2前面的1   另外，正则中特殊符号要加\   ?表示非贪婪，获取第一个符合要求的数据(.和*默认获取尽可能多的数据)
        String regexStr = "sdfsd手动阀手动阀\n222退保文书号[123456]\n十分士大夫十分\n333退保文书号[abcdefg]gggg";
        String regex = "(?<=退保文书号\\[).*?(?=\\])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regexStr);
        //match可以理解为自带一个循环，每次找到后下次就不在查之前的  循环可以获取多个符合条件的
        /*while (matcher.find()){
            System.out.println(matcher.group());
        }*/
        //直接取，则只会拿第一个符合条件的  matcher.group(0)表示第一个，直接用下标找会越界
        if (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(0));
            //System.out.println(matcher.group(1));
        }

        //校验一个字符串是否为纯数字,不能为null    ^开始，0-9标识数字，+标识出现一次或多次，$表示结尾     意思是从开始到结尾都是数字
        //matches是String的一个方法，用于检测整个字符串是否匹配指定的正则表达式。它允许你在不编写复杂的字符串解析代码的情况下，轻松地验证字符串的格式或内容
        String mathRegex = "^[0-9]+$";
        String mathRegexStr1 = "   ";
        String mathRegexStr2 = " 123  ";
        String mathRegexStr3 = "123a#";
        String mathRegexStr4 = "12345";
        System.out.println(mathRegexStr1.matches(mathRegex));
        System.out.println(mathRegexStr2.matches(mathRegex));
        System.out.println(mathRegexStr3.matches(mathRegex));
        System.out.println(mathRegexStr4.matches(mathRegex));

        //校验对象中的字符串，改变是否影响对象中的字段    不会，字符串每次声明都会使用一个新的地址，StringBuffer和Builder是一个地址
        StudentEntityEO stuStringValid = new StudentEntityEO();
        stuStringValid.setName("张三-修改前");
        String beforeName = stuStringValid.getName();
        System.out.println(beforeName);
        beforeName = "张三-修改后";
        System.out.println(beforeName);

        String entryStr = null;
        if (null == entryStr || entryStr.length() == 0) {
            entryStr = null;
            entryStr = "张三";
        } else {
            entryStr = "里斯";
        }
        System.out.println(entryStr);


        //返回指定字符的数值，注意字母不分大小写，从A-Z从10到35，中文返回-1
        String testSignNo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String testSignNoSmall = "abcdefghijklmnopqrstuvwxyz";
        //A:10 B:11 C:12 D:13 E:14 F:15 G:16 H:17 I:18 J:19 K:20 L:21
        //M:22 N:23 O:24 P:25 Q:26 R:27 S:28 T:29 U:30 V:31 W:32 X:33 Y:34 Z:35
        String relSignNo = "320509U4JYAC4107";
        //String relSignNo = "320500UG02A70415";
        int[] weightValue = {1, 3, 5, 7, 11, 2, 13, 1, 1, 17, 19, 97, 23, 29};
        int[] checkValue = new int[100];
        int totalValue = 0;
        for (int i = 0; i < relSignNo.substring(0, 14).length(); i++) {
            checkValue[i] = Character.getNumericValue(relSignNo.substring(0, 14).charAt(i));
            totalValue += weightValue[i] * checkValue[i];
        }
        int endValue = totalValue % 97 + 1;
        String endStr = String.valueOf(endValue);
        if (endStr.length() == 1) {
            endStr = '0' + endStr;
        }
        System.out.println(endStr.equals(relSignNo.substring(14, 16)));


        //截取List集合中前1000个元素，使用subList（set需变为List有序集合）。  这里模拟10个，注意判断集合长度需大于等于截取长度
        //切记：Arrays.asList返回的集合不能加减操作，需创建一个集合对象，然后在构造器赋值
        List<String> subTestList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"));
        if (subTestList.size() >= 10) {
            List<String> tenSubList = subTestList.subList(0, 10);
            System.out.println("原集合数据：" + subTestList);
            System.out.println("截取元素数据：" + tenSubList);
            //获取截取元素之后，原集合仍含有数据（只是返回一个视图），可在操作后调用clear清除原集合数据
            tenSubList.clear();
            System.out.println("清除后原集合数据：" + subTestList);
            System.out.println("清除后截取元素数据：" + tenSubList);
        } else {
            System.out.println(subTestList);
        }
        System.out.println("-------------------集合截取测试2-----------------------");
        //--代码演示
        List<String> subTest2List = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"));
        do {
            System.out.println("-------------**循环**-------------");
            if (subTest2List.size() > 5) {
                List<String> fiveSubList = subTest2List.subList(0, 5);
                System.out.println("原集合数据：" + subTest2List);
                System.out.println("截取元素数据：" + fiveSubList);
                fiveSubList.clear();
                System.out.println("清除后原集合数据：" + subTest2List);
                System.out.println("清除后截取元素数据：" + fiveSubList);
            } else {
                System.out.println("原集合数据：" + subTest2List);
                subTest2List.clear();
                System.out.println("清除后原集合数据：" + subTest2List);
            }
        } while (subTest2List.size() > 0);


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
