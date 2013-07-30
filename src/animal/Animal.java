package animal;

/**
 * Created by Administrator on 13-7-30.
 */
public interface Animal {
    String consist="cell";
    int maxweight=9999;

    public abstract void breath();
    public abstract void eat();
    public abstract String respond(String s);


}
