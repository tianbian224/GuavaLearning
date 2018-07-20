package chapter_2_collection;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by cang.lv at 2018/7/20 19:33.
 */
public class MulitiSetDemo {
    @Test // hashmultiSet
    public void test(){
        // 添加元素
        Multiset<Integer> set=HashMultiset.create();
        set.addAll(Arrays.asList(1,2,3,1,2,4));
        System.out.println(set);

        System.out.println(set.count(3));// 3有几个
        System.out.println(set.elementSet());// 不重复元素
        set.remove(3,1);
        System.out.println(set);//把3 减少一个

        set.add(3,100);
        System.out.println(set);
    }


}
