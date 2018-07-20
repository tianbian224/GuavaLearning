package GuavaDemo;

import com.google.common.base.Function;
import org.junit.Test;

import java.util.Date;

/**
 * Created by cang.lv at 2018/7/19 18:45.
 */
public class FunctionDemo {

    //  function 主要作用是类型转换
    @Test
    public void test() {
        Function<Date, String> function = new Function<Date, String>() {
            public String apply(Date date) {// 将date转换成 string
                if (date == null) return null;
                else return date.toString();
            }
        };
        String ss = function.apply(new Date());
        System.out.println(ss);
    }


    // 判断某个参数是否 符合条件
    @Test
    public void testPredicate() {
//        Predicate<Integer> pre = new Predicate<Integer>() {
//
//            public boolean apply(Integer a) {
//                if (a >= 10) return true;
//                else return false;
//            }
//        };
//        List<Integer> list = Lists.newArrayList(1, 2, 11);
//        Optional<Integer> op = Iterables.tryFind(list, pre);
//        if (op.isPresent())
//            System.out.println(op.get());
    }

    @Test
    public void exrecise()
    {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        Object o2 = new Integer(1);
        System.out.println(o1);
        System.out.println(o2);
    }
}
