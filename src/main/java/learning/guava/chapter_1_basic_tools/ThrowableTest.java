package learning.guava.chapter_1_basic_tools;//  Lvcang created at  2018-07-21 22:07,have fun~

import com.google.common.base.Throwables;
import org.junit.Test;

import java.io.IOException;

/**
 * @Author cang.lv
 */
public class ThrowableTest
{
    @Test
    public void testTrrow()
    {
        aaa(1);
    }

    private void aaa(int a)
    {
        try
        {
            int ca = 199 / a;
            throw new IOException("");

        } catch (Exception w)
        {
            Throwable s = Throwables.getRootCause(w);
            System.out.println(s);
            Throwables.propagate(w);
        }


    }
}
