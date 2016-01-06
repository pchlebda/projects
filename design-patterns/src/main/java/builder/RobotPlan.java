package builder;

/**
 * Created by Piotr on 2015-06-11.
 */
public interface RobotPlan {

    public void setRobotHead(String head);

    public void setRobotTorso(String torso);

    public void setRobotArms(String arms);

    public void setRobotLegs(String legs);

    public String getRobotHead();

    public String getRobotTorso();

    public String getRobotArms();

    public String getRobotLegs();

}
