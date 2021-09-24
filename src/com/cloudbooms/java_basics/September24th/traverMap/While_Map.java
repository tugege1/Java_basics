package com.cloudbooms.java_basics.September24th.traverMap;

import java.util.*;

public class While_Map {
    public static void main(String[] args) {

        /**
         * HashMap：数组+链表；1.8后链表长度8转红黑树，为6恢复链表  键值可为null
         * 主干是一个Entry数组,当entry的next为null时，代表没有链表，链表出现越少，性能越高
         * key可以重复，会替换
         */
        Map map = new HashMap();
        /**
         * HashTable：线程安全，加synchronized锁， 键值不允许为空
         */
        Map map2 = new Hashtable();
        /**
         * TreeMap：实现了红黑树，key不允许重复，键值可为空
         */
        Map map3 = new TreeMap();


        //赋值
        map.put("第一个map值", 11111);
        //获得所有的Entry对象
        Set entrys = map.entrySet();
        //获取迭代器
        Iterator iterator = entrys.iterator();
        while (iterator.hasNext()) {
            //循环，注意要用Entry对象接收
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
