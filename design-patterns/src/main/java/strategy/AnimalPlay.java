package strategy;

/**
 * Created by Piotr on 24.01.2016.
 */
public class AnimalPlay {

    public static void main(String[] args) {
        Animal sparky = new Dog("sparky",0.9);
        Animal tweety = new Bird("tweety",0.3);

        System.out.println("Dog: "+sparky.tryToFly());
        System.out.println("Bird: "+tweety.tryToFly());

        sparky.setFlyingType(new ItFlys());
        System.out.println("Dog: "+sparky.tryToFly());

    }

}
