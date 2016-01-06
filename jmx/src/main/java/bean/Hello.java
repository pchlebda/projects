package bean;

/**
 * Created by Piotr on 06.01.2016.
 */
public class Hello implements HelloMBean {

    private String message;

    public Hello() {
        this.message = "Hello world!";
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void sayHello() {
        System.out.println(message);
    }
}
