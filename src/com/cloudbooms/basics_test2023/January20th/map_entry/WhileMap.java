package com.cloudbooms.basics_test2023.January20th.map_entry;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 使用while完成map循环遍历
 *
 * @author Tu
 * @date 2023/1/22 16:48
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
        //判断是否有值
        while (iterator.hasNext()) {
            Map.Entry<String, Object> mapEntry = iterator.next();
            System.out.println(mapEntry.getKey() + "------" + mapEntry.getValue());
        }
    }

}
