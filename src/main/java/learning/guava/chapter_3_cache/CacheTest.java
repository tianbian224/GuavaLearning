package learning.guava.chapter_3_cache;//  Lvcang created at  2018-07-22 10:44,have fun~

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.sun.istack.internal.NotNull;
import learning.guava.chapter_1_basic_tools.testModel.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author cang.lv
 */
public class CacheTest
{
    private static Map<String, Person> database = new HashMap<>(30);

    /**
     * 测试前先向数据库中加数据
     */
    @Before
    public void loadDataToDataBase()
    {
        for (int i = 0; i < 30; i++)
        {
            Person person = new Person("name" + i, i, i % 2 == 1 ? "男" : "女");
            database.put("name" + i, person);
        }

    }


    @Test
    public void testCache()
    {
        LoadingCache<String, Person> cache = CacheBuilder.newBuilder()
                .maximumSize(10)
                .expireAfterWrite(1, TimeUnit.SECONDS)
                .build(new CacheLoader<String, Person>()
                {
                    @Override
                    public Person load(@NotNull String name) throws Exception
                    {
                        //  通过名字查找Person
                        return getPersonByName(name);
                    }
                });
        try
        {
            System.out.println(cache.get("name20"));
            Thread.sleep(2000);
            System.out.println(cache.get("name20"));
            cache.put("ca",new Person("ca"));
            System.out.println(database.get("ca"));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    private Person getPersonByName(String name)
    {

        return database.get(name);
    }
}
