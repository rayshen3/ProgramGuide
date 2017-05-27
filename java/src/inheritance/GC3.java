package inheritance;

/**
 * Created by ray on 17/5/25.
 */

public class GC3<T> extends C3 implements I2, GI1<T> {

    @Override
    public String getI2(String words) {
        return words;
    }

//泛型类实现泛型接口不应该指定类型参数
/*    public String getGI1(String words) {
        return words;
    }
*/

    public T getGC3(T words) {
        return words;
    }

    @Override
    public T getGI1(T words) {
        return words;
    }
}
