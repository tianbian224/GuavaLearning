package chapter_2_collection;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Test;

/**
 * Created by cang.lv at 2018/7/20 20:27.
 */
public class BiMapDemo {
    @Test
    public void test() {
        BiMap<String, Integer> m = HashBiMap.create();
        m.put("c", 99);
        m.put("b", 98);
        System.out.println(m);
        System.out.println(m.inverse());// 翻转键值映射


    }
}
