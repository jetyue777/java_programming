/**
 * Created by YUEJ2 on 5/15/2017.
 */
public class Machine implements Info{
    private int id = 7;

    public void start() {
        System.out.println("Machine started!");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine id is: " + id);
    }
}
