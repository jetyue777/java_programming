/**
 * Created by YUEJ2 on 5/15/2017.
 */
public class Machine implements Info{
    private int id = 7;

    public void start() {
        System.out.println("Machine started!");
    }

    public void showInfo() {
        System.out.println("Machine id is: " + id);
    }
}

class Camera extends Machine {
    public void start() {
        System.out.println("Camera started.");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}
