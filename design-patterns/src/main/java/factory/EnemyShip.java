package factory;

/**
 * Created by Piotr on 2015-05-03.
 */
public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }


    public void followHero(){
        System.out.println(getName()+" is followng hero");
    }

    public void displayEnemyShip(){
        System.out.println(getName()+" is on the screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName()+" attacks and does "+getAmtDamage());
    }
}
