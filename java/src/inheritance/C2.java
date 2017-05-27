package inheritance;

/**
 * Created by ray on 17/5/25.
 */
public class C2 implements I1 {

    @Override
    public String getI1(String words) {
        return words;
    }

    @Override
    public String getI1A(String words) {
        return null;
    }

    @Override
    public String getI1B(String words) {
        return null;
    }

    @Override
    public String getI1C(String words) {
        return null;
    }

    public String getGI1(String words) {
        return words;
    }

    public String getGI2(String words) {
        return words;
    }

    @Override
    public Object getGI1(Object words) {
        return null;
    }

    @Override
    public Object getGI2(Object words) {
        return null;
    }
}
