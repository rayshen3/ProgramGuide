package inheritance;

/**
 * Created by ray on 17/5/25.
 */
public class C1 implements GI1<String>, GI2<String> {

    @Override
    public String getGI1(String words) {
        return words;
    }

    @Override
    public String getGI2(String words) {
        return words;
    }

    public static void main(String[] args) {
        C1 c1 = new C1();
        System.out.println(c1.getGI1("from C1.getGI1()"));
    }
}
