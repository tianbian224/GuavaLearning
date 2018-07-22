package learning.guava.chapter_2_collection;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Test;

/**
 * Created by cang.lv at 2018/7/20 20:27.
 * @author cang.lv
 */
public class BiMapTest
{
    @Test
    public void test()
    {
        BiMap<String, Integer> m = HashBiMap.create();
        m.put("c", 99);
        m.put("b", 98);
        System.out.println(m);

        // 翻转键值映射
        BiMap<Integer, String> c = m.inverse();
        System.out.println(c);


        // 给翻转之后的map添加元素，也相当于给原来是map添加元素
        c.put(100, "d");
        System.out.println(m);
    }
}
