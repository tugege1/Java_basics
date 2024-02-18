package com.cloudbooms.basics_test2024.february18.map_entry;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 使用迭代器遍历map集合
 *
 * @author Tu
 * @date 2024/2/18 19:35
 */
public class WhileMap {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("aaa", "1111");
        map.put("bbb", "2222");

        //获取所有的entry对象（实现迭代器），hashMap主干是一个entry数组
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        //获取迭代器
        Iterator<Map.Entry<String, Object>> iterator = entries.iterator();
        //判断是否有值，注意这里会提示简化为for循环方式，这里知道迭代器原理即可
        while (iterator.hasNext()) {
            Map.Entry<String, Object> mapEntry = iterator.next();
            System.out.println(mapEntry.getKey() + "------" + mapEntry.getValue());
        }

    }

}
