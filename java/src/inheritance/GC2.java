package inheritance;

/**
 * Created by ray on 17/5/25.
 */
public class GC2<T> implements GI1<T>, GI2<T> {

    @Override
    public T getGI1(T words) {
        return words;
    }

    @Override
    public T getGI2(T words) {
        return words;
    }
}
