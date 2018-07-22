package learning.guava.chapter_1_basic_tools;

import learning.guava.chapter_1_basic_tools.testModel.Person;
import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;
import org.junit.Test;

/**
 * Created by cang.lv at 2018/7/19 14:15.
 */
public class ObjectsDemo {

    @Test
    public void test() {
        String a = null;
        String b = null;
        //  System.out.println(a.equals(b));// 注意a不能是null
        System.out.println(Objects.equal(a, b));//  true  null,null

        System.out.println(Objects.hashCode(1, 2, 3, "n"));// hashcode，顺序敏感

    }

    @Test // 测试comparechain
    public void testchain() {
        Person p1=new Person("");
        Person p2=new Person("");
        ComparisonChain.start().compare(p1.getName(),p2.getName())
                .compare(p1.getAge(),p2.getAge())
                .compare(p1.getGender(),p2.getGender());

    }
}
