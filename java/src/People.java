/**
 * Created by ray on 17/5/16.
 */

import java.util.*;




/**
 * @author ray
 * @throws test class
 * @return return is string type
 */
public class People implements PeopleBio, PeopleLearn {
    public String name;
    public String city;
    public int age;
    public static String englishname = "rayshen";
    //static String username;
    //String nickname;

    public People(String name, String city) {
        this.name = name;
        this.city = city;
    }

    /**
     * 重载(overloading) People的构造函数
     * @param name
     * @param city
     * @param age
     */
    public People(String name, String city, int age) {
        this(name, city);
        this.age = age;
    }

    /**
     *重写PeopleBio接口中的  thePhone方法
     * @param  phoneNumber
     * @return string
     */
    @Override
    public String thePhone(String phoneNumber) {
        return "your phone is: " + phoneNumber;
    }

    /**
     * 重写PeopleLearn接口中的 readBook方法
     * @param bookName
     * @return
     */
    @Override
    public String readBook(String bookName) {
        return "you are reading: <<" + bookName + ">>";
    }

    public String sayRun(String word) {
        return this.name + " said:'"+word + "' and " + runEat(100);
    }

    public String runEat(int km) {
        return this.name + " run " + km + "km in " + this.city + ". " + eat("rice") + " " + thePhone("13811043811 ") +
            readBook("core java");

    }

    private String play(String game) {
        return this.name + " is playing [" + game + "] in " + this.city;
    }

    private String eat(String food) {
        return "welcome " + this.name + ". are you eating "+ food + "? your age is " + this.age;
    }

    public static void main(String[] args) {
        //String s = new Date().toString();
        //System.out.println(new Date());
        //System.out.println(s);
    }

}



