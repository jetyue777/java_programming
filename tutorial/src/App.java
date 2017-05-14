class Robot {
    public void speak(String text) {
        System.out.println(text);
    }

    public void move(String direction, double distance) {
        System.out.println(direction + distance);
    }
}


public class App {
    public static void main(String[] args) {
        Robot jet = new Robot();
        String greeting = "good moring";
        jet.speak("Jet Good.");
        jet.speak(greeting);

        jet.move("east", 2.3);

    }
}
