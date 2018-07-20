package chapter_2_collection;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.*;

/**
 * Created by cang.lv at 2018/7/20 10:03.
 */
public class ListDemo {

    @Test
    public void test() {

        List<String> list1 = Lists.newLinkedList(Arrays.asList("a", "b", "c"));
        for (ListIterator<String> i = list1.listIterator(); i.hasNext(); ) {
            String c = i.next();
            System.out.println(c);
            i.remove();
        }
        System.out.println(list1);

    }

    @Test
    public void test2() {
        ArrayList<Integer> lis = Lists.newArrayList(1, 2, 3, 4);
        Collections.shuffle(lis);// 打乱顺序
        System.out.println(lis);

        Collections.sort(lis, Ordering.<Integer>natural().reversed());
        System.out.println(lis);// 在原地排序
    }


}
