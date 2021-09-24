package com.cloudbooms.java_basics.September24th.traverMap;

import java.util.Hashtable;
import java.util.Map;

public class For_Map {
    public static void main(String[] args) {

        //创建map集合
        Map map = new Hashtable();
        map.put("aaa", "bbbb");

        //使用map.entrySet获得集合，循环遍历，使用Map.Entry对象接收
        for (Object obj : map.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
