package learning.guava.chapter_1_basic_tools;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import org.junit.Test;

/**
 * Created by cang.lv at 2018/7/19 14:40.
 */
public class OptionalDemo {
    @Test
    // 1. 显示提示返回的结果可能是null
    public void test() {
        String c = "";//null;
        Preconditions.checkNotNull(c, "变量c不能是null");

        // 使用guava
        Optional<String> o = getStrings(12);
        if (o.isPresent())
            System.out.println("null");
    }

        // 提示函数的结果可能返回 null
    public static Optional<String> getStrings(int c) {
        return c == 0 ? Optional.<String>absent() : Optional.of("abcd");
    }

    @Test// 创建optional对象
    public void test2() {
        // 1.  of方法：创建指定引用的 Optional 实例，若引用为 null 则快速失败
        Optional<String> op = Optional.of("abc");
        System.out.println(op.isPresent());

        // 2. absent:创建引用缺失的 Optional 实例
        Optional<String> op1 = Optional.absent();
        System.out.println(op1.isPresent());

        // 3.创建指定引用的 Optional 实例，若引用为 null 则表示缺失
        Optional<Integer> op3 = Optional.fromNullable(90);
        System.out.println(op3.isPresent());
    }

}

