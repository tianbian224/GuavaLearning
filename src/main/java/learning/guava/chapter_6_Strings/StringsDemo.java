package learning.guava.chapter_6_Strings;

import com.google.common.base.Strings;
import org.junit.Test;

public class StringsDemo {
    public static void main(String[] args) {
        String a = "";
        Strings.isNullOrEmpty(a); // null |  ""返回true
        Strings.nullToEmpty(a);  // 将null-->""
    }

    @Test
    public void testFix() {
        String a = "bcd123";
        String b = "abcd423";
        System.out.println(Strings.commonPrefix(a, b));
        System.out.println(Strings.commonSuffix(a, b));
    }

    @Test
    public void testpad() {
        String a = "aa|";
        System.out.println(Strings.padStart(a, 5, 'p')); // 在a前面加上p加完之后 长度是5
        System.out.println(Strings.padEnd(a, 5, 'p'));// 在a后面加
        System.out.println(Strings.repeat(a, 2));
    }


}
