package strategy;

/**
 * Created by Piotr on 24.01.2016.
 */
public abstract class Animal {

    private String name;
    private double height;
    private Flys flyingType;


    public Animal(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public void setFlyingType(Flys flyingType) {
        this.flyingType = flyingType;
    }


    public String tryToFly() {
        return flyingType.fly();
    }
}
