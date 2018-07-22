package learning.guava.chapter_8_range;//  Lvcang created at  2018-07-21 16:57,have fun~

import com.google.common.collect.BoundType;
import com.google.common.collect.Range;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author cang.lv
 */
public class RangeTest
{
    public static void main(String[] args)
    {

    }

    @Test
    /**
     * 创建范围类
     */
    public void testBuildRange()
    {
        // 1. use function to build range
        Range<Integer> closed = Range.closed(1, 10);
        //[1,10]
        Range<Integer> integerRange = Range.greaterThan(10);
        //[10,+inf)
        Range<Integer> range = Range.range(1, BoundType.CLOSED, 10, BoundType.OPEN);
        // 自定义区间开闭
        System.out.println(range);
    }

    @Test
    /**
     *     关系运算
     */
    public void testCalulate()
    {
        Range<Integer> large = Range.openClosed(1, 10);
        Range<Integer> small = Range.open(3, 7);
        System.out.println(large.encloses(small));
        // encloses 包含关系

        System.out.println(large.isConnected(small));
        // 测试区间相连，也就是有公共值

        System.out.println(large.intersection(small));
        // 计算交集，只有相连才有交集，否则抛出异常

        System.out.println(large.span(small));
        // 计算最小区间

    }

    @Test
    /**
     * 查询Range类
     */
    public void queryRange()
    {
        Range<Integer> range = Range.closedOpen(1, 10);
        System.out.println(range.contains(5));
        System.out.println(range.contains(22));
        System.out.println(range.containsAll(Arrays.asList(1, 2, 3, 12)));


        System.out.println(range.lowerBoundType());
        // 下界类型
        System.out.println(range.upperBoundType());
        // 上界类型

        System.out.println(range.hasLowerBound());
        // 是否有下界
        System.out.println(range.hasUpperBound());
        // 是否有上界

        System.out.println(range.lowerEndpoint());
        // 下界点
        System.out.println(range.upperBoundType());
        //上界点

    }
}
