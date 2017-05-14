/**
 * Created by jetyue on 2017-05-14.
 */
public class InheritanceTut {

    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.start();
        robot1.speak("good");

        Car car1 = new Car();
        car1.start();
        car1.wipeWindShield();
    }
}
