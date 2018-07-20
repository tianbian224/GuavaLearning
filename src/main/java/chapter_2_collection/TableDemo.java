package chapter_2_collection;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.junit.Test;

import java.util.Map;

/**
 * Created by cang.lv at 2018/7/20 20:35.
 */
public class TableDemo {
    @Test
    public void test() {
        Table<Integer, Integer, String> table = HashBasedTable.create();
        table.put(1, 1, "姓名");
        table.put(1, 2, "x性别");
        table.put(2, 1, "xi");
        table.put(2, 2, "man");

        Map<Integer, Map<Integer, String>> rowMap = table.rowMap();
        Map<Integer,String> rows= table.row(1);
    }
}
