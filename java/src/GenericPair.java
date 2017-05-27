/**
 * Created by ray on 17/5/23.
 */

/**
 * 泛型类中的类型变量一般使用大写单个字母
 *      K,V key value
 *      E   Element(List Iterator Set)
 *      N   Number
 *      T   Type(String Integer)
 *      SUV
 * @param <T>
 */
public class GenericPair <T> {
    private T first;
    private T second;

    /**
     *存在非空参数的构造函数, 而且没设置默认值, new对象时需要传入非空的参数
     * @param
     * @return
     */
    public GenericPair() {}

/*  //same with: public GenericPair() {}
    public GenericPair() {
        first = null;
        second = null;
    }
*/

    /**
     *
     * @param first
     * @param second
     */
    public GenericPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    /**
     * 泛型类中的类型变量指定方法的返回值类型或成员 局部变量的类型
     * @return
     */
    public T getFirst() {
        return this.first;
    }

    public T getSecond() {
        return this.second;
    }

    public void setFirst(T newValue) {
        System.out.println("setting first...");
        this.first = newValue;
    }

    public void setSecond(T newValue) {
        System.out.println("setting second...");
        this.second = newValue;
    }

    public static void main(String[] args) {
        GenericPair<String> gp1 = new GenericPair<>();
        GenericPair gp3 = new GenericPair();

        gp1.setFirst("i am first");
        String result1 = (String) gp1.getFirst();
        System.out.println(result1);


        gp3.setFirst("i am first-new from gp3 instance");
        //要避免这种情况, 这里没指定泛型类型, 默认使用Object代替, 所以可以传Integer, 而且可以通过编译, 但执行到强制转换会还是会报错
        //gp3.setFirst(100);
        String result2 = (String) gp3.getFirst();
        System.out.println(result2);

    }

}
