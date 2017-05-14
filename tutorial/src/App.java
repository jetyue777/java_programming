class Robot {
    public void speak(String text) {
        System.out.println(text);
    }

    public void move(String direction, double distance) {
        System.out.println(direction + distance);
    }

    public String toString() {
        return "hello robot toString";
    }

    public void start() {
        System.out.println("Machine started.");
    }

    public void stop() {
        System.out.println("Machine Stopped");
    }
}


public class App {
    public static void main(String[] args) {
        Robot jet = new Robot();
        String greeting = "good moring";
        jet.speak("Jet Good.");
        jet.speak(greeting);

        jet.move("east", 2.3);


        Robot robot1 = new Robot();


        Object obj = new Object();
        System.out.println(obj);

        System.out.println(robot1);
    }
}
