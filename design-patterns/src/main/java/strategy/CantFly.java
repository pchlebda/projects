package strategy;

/**
 * Created by Piotr on 24.01.2016.
 */
public class CantFly implements Flys {
    @Override
    public String fly() {
        return "I can't fly";
    }
}
