package learning.guava.chapter_1_basic_tools;

import learning.guava.chapter_1_basic_tools.testModel.Person;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.*;

/**
 * Created by cang.lv at 2018/7/20 17:42.
 */
public class OrderingDemo {


    // 1. 使用ordering 排序

    @Test
    public void listSort() {
        ArrayList<Integer> lis = Lists.newArrayList(1, 2, 3, 4);
        List<Integer> copyList = Ordering.natural().reverse().sortedCopy(lis);
        System.out.println(copyList);// 复制了新数组
        List<Person> personList = Lists.newArrayList(Arrays.asList(new Person("lvcang"), new Person("aaa")));
        Collections.sort(personList, Ordering.usingToString());
        System.out.println("personList:" + personList);// ;


        //  自定义按照字符串长度倒序 排列
        List<String> list = Lists.newArrayList("cdac", "vvs", "dvsvfdv", "scv", "cds");
        Collections.sort(list, Ordering.natural().reverse().onResultOf(new Function<String, Integer>() {
            @Override
            public Integer apply(String ss) {
                return ss == null ? 0 : ss.length();
            }
        }));
        System.out.println(list);


        // 先 按照 长度倒序排列，长度相同再按照字典序排列
        List<String> list2 = Lists.newArrayList("aaaaa", "aaaab", "aaaaac", "aaaac", "aaac");
        Collections.sort(list2, Ordering.natural().reverse().onResultOf(new Function<String, Integer>() {
            @Override
            public Integer apply(String ss) {
                return ss == null ? 0 : ss.length();
            }
        }).compound(Ordering.natural()));
        System.out.println(list2);

    }


    // 2. 得到第几大的数字
    @Test
    public  void tetst() {
        List<Integer> list = Lists.newArrayList(Arrays.asList(1, 2, 3, 4));
        List<Integer> list1 = Ordering.natural().greatestOf(list, 2);
        System.out.println(list1);
    }
}
