package inheritance;

/**
 * Created by ray on 17/5/25.
 */

public interface GI3<T> extends GI1<T>, GI2<T>, I2 {
    T getGI3(T words);
}
