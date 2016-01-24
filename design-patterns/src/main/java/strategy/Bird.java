package strategy;

/**
 * Created by Piotr on 24.01.2016.
 */
public class Bird extends Animal {

    public Bird(String name, double height) {
        super(name, height);
        setFlyingType(new ItFlys());
    }
}
