package factory;

import java.util.Scanner;

/**
 * Created by Piotr on 2015-05-03.
 */
public class EnemyShipTesting {

    public static void main(String[] args) {
        EnemyShip enemyShip = null;
        Scanner sc = new Scanner(System.in);
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        System.out.println("What type  of ship?(U/R/B)");

        if (sc.hasNext()) {
            String typeOfShip = sc.nextLine();
            enemyShip = enemyShipFactory.makeEnemyShip(typeOfShip);
        }
            if(enemyShip!=null) {
                doStuffEnemy(enemyShip);
            }else{
                System.out.println("Enter a U, R, B next time");
            }
    }

    public static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHero();
        enemyShip.enemyShipShoots();
    }
}
