package decorator;

/**
 * Created by Piotr on 2015-04-10.
 */
public class Mozzarella extends ToppingDecorator {

    protected Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.5;
    }
}
