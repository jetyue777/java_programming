/**
 * Created by jetyue on 2017-05-14.
 */
public class Car extends Robot {
    public void wipeWindShield() {
        System.out.println("Wiping windshields.");
    }

    public void start() {
        System.out.println("car started.");
    }

    private Plant plant = new Plant();
    public Car() {
        System.out.println(plant.size);
    }

}
