package inheritance;

/**
 * Created by ray on 17/5/25.
 */

public class C4 extends GC1 implements I3, I4, GI1<String> {
    public String getC4(String words) {
        return words;
    }

    @Override
    public String getGI1(String words) {
        return words;
    }

    @Override
    public String getI3(String words) {
        return words;
    }

    @Override
    public String getI4(String words) {
        return words;
    }

}

