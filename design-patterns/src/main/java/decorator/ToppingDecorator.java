package decorator;

/**
 * Created by Piotr on 2015-04-10.
 */
public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    protected ToppingDecorator(Pizza newPizza) {
        this.tempPizza = newPizza;
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
