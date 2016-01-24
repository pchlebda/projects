package strategy;

/**
 * Created by Piotr on 24.01.2016.
 */
public class Dog extends Animal {

    public Dog(String name, double height) {
        super(name, height);
        setFlyingType(new CantFly());
    }


}
