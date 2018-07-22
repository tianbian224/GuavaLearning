package learning.guava.chapter_1_basic_tools.testModel;

import com.google.common.base.MoreObjects;

/**
 * Created by cang.lv at 2018/7/20 16:01.
 */
public class Person {
   public Person(String name) {
        this.name = name;
        this.age = 19;
    }
    public Person(String name,int age,String gender) {
        this.name = name;
        this.age = age;
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Person{"+this.name+","+this.age+","+this.gender+"}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private String id;
    private String gender;
    private int age;
}
