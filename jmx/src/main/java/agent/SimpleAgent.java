package agent;

import bean.Hello;
import bean.HelloMBean;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created by Piotr on 06.01.2016.
 */
public class SimpleAgent {

    private MBeanServer mBeanServer;


    public static void main(String[] args) {
        SimpleAgent simpleAgent = new SimpleAgent();
        System.out.println("Simple agent is waiting..");
        waitForEnterPressed();
    }

    public SimpleAgent() {
        mBeanServer = ManagementFactory.getPlatformMBeanServer();
        HelloMBean hello = new Hello();

        ObjectName helloName = null;

        try {
            helloName = new ObjectName("FOO:name=helloBean");
            mBeanServer.registerMBean(hello, helloName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void waitForEnterPressed() {
        try {
            System.out.println("Press  to continue...");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
