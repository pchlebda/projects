package decorator;

/**
 * Created by Piotr on 2015-04-10.
 */
public class TomatoSauce extends ToppingDecorator {
    protected TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.35;
    }
}
