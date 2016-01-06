package builder;

/**
 * Created by Piotr on 2015-06-11.
 */
public interface RobotBuilder {

    public void buildRobotHead();

    public void buildRobotTorso();

    public void buildRobotArms();

    public void buildRobotLegs();

    public Robot getRobot();

}


