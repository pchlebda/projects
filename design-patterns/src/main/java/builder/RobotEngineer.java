package builder;

/**
 * Created by Piotr on 2015-06-11.
 */
public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot() {
        return robotBuilder.getRobot();
    }

    public void makeRobot() {
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotTorso();
        robotBuilder.buildRobotArms();
        robotBuilder.buildRobotLegs();
    }
}
