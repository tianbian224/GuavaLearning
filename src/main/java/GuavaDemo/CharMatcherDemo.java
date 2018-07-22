package GuavaDemo;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import org.junit.Test;

/**
 * Created by cang.lv at 2018/7/19 14:27.
 */
public class CharMatcherDemo {
    @Test
    public void test() {
        String s="a1b2c3d4aa";
        CharMatcher matcher=CharMatcher.anyOf("abcd");
        System.out.println(matcher.removeFrom(s));// 删除 abcd
        System.out.println(matcher.retainFrom(s));// 保留abcd



        // 配合splitter 使用，将abcdtrim掉
        String ss="a89,c090,d32,r232,d23c";
        System.out.println(Splitter.on(",").trimResults(CharMatcher.anyOf("abcd")).split(ss));

    }
}
