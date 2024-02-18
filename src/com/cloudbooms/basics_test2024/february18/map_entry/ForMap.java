package com.cloudbooms.basics_test2024.february18.map_entry;

import java.util.HashMap;
import java.util.Map;

/**
 * 循环遍历map集合
 *
 * @author Tu
 * @date 2024/2/18 19:31
 */
public class ForMap {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("aaa", "1111");
        map.put("bbb", "2222");

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "------" + entry.getValue());
        }

    }

}
