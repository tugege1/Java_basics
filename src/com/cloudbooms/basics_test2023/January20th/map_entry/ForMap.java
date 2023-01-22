package com.cloudbooms.basics_test2023.January20th.map_entry;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用for循环遍历map集合
 *
 * @author Tu
 * @date 2023/1/22 16:53
 */
public class ForMap {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("aaa", "1111");
        map.put("bbb", "2222");
        //使用for循环不需要获取迭代器，相比更加简洁。但需要进行一个强转操作
        for (Object obj : map.entrySet()) {
            Map.Entry mapEntry = (Map.Entry) obj;
            System.out.println(mapEntry.getKey() + "------" + mapEntry.getValue());
        }
    }

}
