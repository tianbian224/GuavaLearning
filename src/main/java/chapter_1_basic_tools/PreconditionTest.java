package chapter_1_basic_tools;//  Lvcang created at  2018-05-12 19:26,have fun~

import com.google.common.base.Preconditions;

import java.util.Date;


public class PreconditionTest
{
    public static void main(String[] args)
    {
        preconditionDemo("ddddddddd", "nandada", 100, new Date());
    }


    // 使用前置条件
    public static void preconditionDemo(String name, String gender, int age, Date birthday)
    {
        Preconditions.checkArgument(name != null, "姓名不能为空！");
        Preconditions.checkArgument(name.length() < 3, "名字太长！", name.length());
        Preconditions.checkNotNull(gender);// 检查非空
        Preconditions.checkState(age < 100, "年龄不能大于100");

    }


}
