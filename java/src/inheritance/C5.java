package inheritance;

/**
 * Created by ray on 17/5/26.
 */
public class C5 implements I1 {

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

    ;

    @Override
    public Object getGI1(Object words) {
        return null;
    }

    @Override
    public Object getGI2(Object words) {
        return null;
    }
}
