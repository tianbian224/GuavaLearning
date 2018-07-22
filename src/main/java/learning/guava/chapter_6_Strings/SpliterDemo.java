package learning.guava.chapter_6_Strings;

import com.google.common.base.Splitter;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by cang.lv at 2018/7/19 11:58.
 * 用于将字符串分割为list或者map
 */
public class SpliterDemo {
    @Test
    public void test() {
        String c=" ,a, b,";
        String[] item=c.split(",");
        System.out.println(Arrays.toString(item));
        System.out.println(Splitter.on(",").split(c));// 比split截断的多了最后的空串

        System.out.println(Splitter.on(",").trimResults().split(c));// 将结果进行trim
        System.out.println(Splitter.on(",").omitEmptyStrings().trimResults().split(c));//忽略空串

        String mapString="a=1&b=2&c=3";
        System.out.println(Splitter.on("&").withKeyValueSeparator("=").split(mapString));//  切分为 map

    }

}
