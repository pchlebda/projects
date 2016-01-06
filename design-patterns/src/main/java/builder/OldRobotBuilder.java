package builder;

/**
 * Created by Piotr on 2015-06-11.
 */
public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {
        robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin head");
    }

    @Override
    public void buildRobotTorso() {

        robot.setRobotTorso("Tin Torso");

    }

    @Override
    public void buildRobotArms() {

        robot.setRobotArms("Blowtorch arms");

    }

    @Override
    public void buildRobotLegs() {

        robot.setRobotLegs("Roller Skates");

    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
