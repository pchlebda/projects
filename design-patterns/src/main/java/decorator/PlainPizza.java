package decorator;

/**
 * Created by Piotr on 2015-04-10.
 */
public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
