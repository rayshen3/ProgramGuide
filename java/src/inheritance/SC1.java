package inheritance;

/**
 * Created by ray on 17/5/26.
 */
public abstract class SC1 implements I1,GI4<String> {


    @Override
    public abstract String getI1(String words);

    @Override
    public abstract String getI1A(String words);

    @Override
    public abstract String getGI4(String words);

}
