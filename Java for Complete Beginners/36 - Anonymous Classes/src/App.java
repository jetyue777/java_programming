class Machine {
    public void start() {
        System.out.println("Starting machine ...");
    }
}

interface Plant {
    public void grow();
}

public class App {

    public static void main(String[] args) {

        // This is equivalent to creating a class that "extends"
        // Machine and overrides the start method.
        Machine machine1 = new Machine() {
            @Override
            public void start() {
                System.out.println("Camera snapping ....");
            }
            //if override a method in class, then the class is no longer that class
        };

        machine1.start();
        System.out.println(machine1.getClass());  //machine1 class is not machine anymore
        //class App$1, a child class of machine that does not have a name

        // This is equivalent to creating a class that "implements"
        // the Plant interface
        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant growing");

            }
        };

        plant1.grow();
        System.out.println(plant1.getClass());
        //class App$2
    }
}