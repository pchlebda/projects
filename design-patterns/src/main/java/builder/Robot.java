package builder;

/**
 * Created by Piotr on 2015-06-11.
 */
public class Robot implements RobotPlan {

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;


    public void setRobotHead(String head) {
        this.robotHead = head;
    }


    public void setRobotTorso(String torso) {
        this.robotTorso = torso;
    }


    public void setRobotArms(String arms) {
        this.robotArms = arms;
    }


    public void setRobotLegs(String legs) {
        this.robotLegs = legs;
    }


    public String getRobotHead() {
        return robotHead;
    }


    public String getRobotTorso() {
        return robotTorso;
    }


    public String getRobotArms() {
        return robotArms;
    }


    public String getRobotLegs() {
        return robotLegs;
    }
}
