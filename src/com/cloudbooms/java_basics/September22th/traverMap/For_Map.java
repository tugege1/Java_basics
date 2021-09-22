package com.cloudbooms.java_basics.September22th.traverMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class For_Map {
    public static void main(String[] args) {

        //定义一个双列集合 map
        //HashMap键和值可以为空，是用来代替hashtable的    HashTable不可以
        Map map = new HashMap();
        map.put("第一个map", "第一个map的值");
        map.put("第二个map", "第二个map的值");


        // 传统方式：必须掌握这种方式
        //获得所有的键值对Entry对象
        Set entrys = map.entrySet();
        //2.迭代出所有的entry
        //iterator:迭代器，基本操作是next：返回下一个元素并更新状态。hasNext:检测集合是否有元素。remove:将集合中数据删除
        Iterator iterator = entrys.iterator();//(因特瑞特)
        while (iterator.hasNext()) {
            //赋值
            Map.Entry next = (Map.Entry) iterator.next();
            //获取键值
            String key = (String) next.getKey();
            String value = (String) next.getValue();
            //最后放的先出来，类似一个袋子
            System.out.println(key + "=" + value);
        }

    }
}
