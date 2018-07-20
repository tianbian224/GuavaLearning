package GuavaDemo;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * joiner 用于连接元素
 */
public class joinerDemo {

    @Test
    public void test1() {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4);
        System.out.println(Joiner.on("-").join(list));//使用-连接 ,有null 会抛出异常


        List<Integer> list2 = Lists.newArrayList(1, 2, 3, null, 4);
        System.out.println(Joiner.on("-").skipNulls().join(list2));//使用-连接,但是忽略null值

        List<Integer> list3 = Lists.newArrayList(1, 2, null, 3, 4);
        System.out.println(Joiner.on("-").useForNull("6").join(list3));//使用-连接,将null替换为6

        Map<String, String> map = Maps.newHashMap();
        map.put("name", "lvcang");
        map.put("gender", "male");
        System.out.println(Joiner.on("&").withKeyValueSeparator("=").join(map));// map的价和值使用=连接，键值对使用&连接

    }
}
