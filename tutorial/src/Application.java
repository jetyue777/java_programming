class Person {
    // Instance variables (data or "state")
    String name;
    int age;

    // Class can contain 1 Data 2 Subroutines (methods)
    public void speak() {
        System.out.println("My name is: " + name + " and my age is: " + age);
    }

}

public class Application {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 26;
        person1.name = "Jet";

        person1.speak();

        Person person2 = new Person();
        person2.age = 24;
        person2.name = "Renee";
        person2.speak();
    }
}
