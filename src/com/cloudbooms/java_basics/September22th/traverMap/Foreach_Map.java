package com.cloudbooms.java_basics.September22th.traverMap;

import java.util.HashMap;
import java.util.Map;

public class Foreach_Map {
    public static void main(String[] args) {

        //定义一个双列集合 map
        Map map = new HashMap();
        map.put("第一个map", "第一个map的值");
        map.put("第二个map", "第二个map的值");

        //原则上map集合是无法使用增强for循环来迭代的，因为增强for循环只能针对实现了Iterable接口的集合进行迭代。
        //而实际上，我们可以通过某种方式来使用增强for循环，还是使用map.entrySet获得所有的键值对Entry对象遍历
        for (Object obj : map.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
