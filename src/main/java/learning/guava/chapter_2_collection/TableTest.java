package learning.guava.chapter_2_collection;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

/**
 * Created by cang.lv at 2018/7/20 20:35.
 */
public class TableTest
{
    @Test
    public void test()
    {
        Table<String, String, String> employeeTable = HashBasedTable.create();
        employeeTable.put("男", "101", "习近平");
        employeeTable.put("女", "102", "李克强");
        employeeTable.put("女", "103", "张高丽");

        employeeTable.put("男", "111", "王岐山");
        employeeTable.put("女", "112", "江泽民");
        employeeTable.put("女", "113", "凤姐");

        employeeTable.put("男", "121", "郭伯雄");
        employeeTable.put("男", "122", "徐才厚");
        employeeTable.put("女", "123", "周永康");


        // 获行的所有信息
        Map<String, String> nan = employeeTable.row("男");
        System.out.println(nan);

        //  获取所有的行，构成set
        Set<String> employers = employeeTable.rowKeySet();
        System.out.println(employers);

        // 获取所有的列
        Set<String> set = employeeTable.columnKeySet();
        System.out.println(set);

        // 通过列键找信息
        Map<String, String> employerMap = employeeTable.column("102");
        System.out.println(employerMap);

        // 遍历单元信息
        Set<Table.Cell<String, String, String>> cells = employeeTable.cellSet();
        for (Table.Cell<String, String, String> cell:cells)
        {
            System.out.println(cell.getRowKey()+"-->"+cell.getColumnKey()+"-->"+cell.getValue());
        }

        //行健作为键，《列键，值》为值
        Map<String, Map<String, String>> mapMap = employeeTable.rowMap();
        for(Map.Entry<String, Map<String, String>> entry:mapMap.entrySet())
        {
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }
}
