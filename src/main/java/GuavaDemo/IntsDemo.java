package GuavaDemo;

import com.google.common.primitives.Ints;
import org.junit.Test;

import java.util.Arrays;

/**
 * guava  补充Java中integer和arrays中对int的操作
 */
public class IntsDemo {

    public static void main(String[] args) {

    }


    @Test
    public void testCompare() {
        System.out.println(Ints.compare(1, 34));// 比较大小

        System.out.println(Ints.contains(new int[]{1, 2, 3}, 3));// 数组中是否包含 元素

        System.out.println(Ints.min(1, 2, 3, 4));
        System.out.println(Ints.max(1, 2, 3, 4));


        int[] arr = {1, 2, 3, 4};
        int[] brr = {5, 6, 7, 8};
        System.out.println(Arrays.asList(arr, brr));// java 是可变数量参数
        System.out.println(Ints.asList(arr));// guava  是将数组变成list,返回list
        System.out.println(Ints.asList(brr).get(0));
//        System.out.println(Ints.asList(brr).add(23));// 不支持添加，实际上返回的是不可变list
//        System.out.println(Ints.asList(brr).remove(2));// 也不支持删除
    }
}
