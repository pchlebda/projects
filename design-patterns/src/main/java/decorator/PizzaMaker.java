package decorator;

/**
 * Created by Piotr on 2015-04-10.
 */
public class PizzaMaker {

    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Price: " + basicPizza.getCost());

    }
}
