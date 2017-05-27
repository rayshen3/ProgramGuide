package inheritance;

/**
 * Created by ray on 17/5/25.
 */
public interface I5 extends GI1<String>, GI2<String> {

    String getI5(String words);
    String getI5A(String words);
    String getI5B(String words);
    String getI5C(String words);
}
