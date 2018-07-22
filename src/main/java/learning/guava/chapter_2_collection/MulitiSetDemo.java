package learning.guava.chapter_2_collection;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by cang.lv at 2018/7/20 19:33.
 */
public class MulitiSetDemo
{
    @Test // hashmultiSet
    public void test()
    {
        // 添加元素
        Multiset<String> set = HashMultiset.create();
        set.addAll(Arrays.asList("a", "b", "c", "d", "a", "b", "c", "b", "b", "b"));
        System.out.println(set);

        // count 计算某个元素有几个
        System.out.println(set.count("b"));

        // 不重复元素输出为set
        System.out.println(set.elementSet());

        // 某个元素减少指定的数量
        set.remove("b", 2);
        System.out.println(set);

        //增加指定的数量
        set.add("b", 2);
        System.out.println(set);

        //遍历，重复也会被遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // 遍历
        for (Multiset.Entry<String> e : set.entrySet())
        {
            System.out.println(e.getElement() + "-->" + e.getCount());
        }

    }

}
