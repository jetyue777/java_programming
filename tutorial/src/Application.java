import ocean.*;
import ocean.plants.Seaweed;

class Person implements Info {

    // Instance variables (data or "state")
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public static String description;
    public static final int ok = 777;
    public static int count;


    public void showInfo() {
        System.out.println("Person Name is: " + name);
    }

    public Person() {
        this("bob"); //Calling constructor within a constructor need to be at the first line

        id = count;
        count ++;

        System.out.println("inside Person constructor");
    }

    public Person(String name) {
        this(28);
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Class can contain 1 Data 2 Subroutines (methods)
    void speak() {
        System.out.println("My name is: " + name + " and my age is: " + age);
    }

    int calculateYearsToRetirement() {
        int yearsLeft = 64 - age;
        return yearsLeft;
    }

    public void greet() {
        System.out.println("Hello there. ");
    }

}

public class Application {

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setAge(26);
        person1.setName("Jet");

        System.out.println(person1.getAge());

        Person.description = "how are you doing?";
        System.out.println(Person.description);

        System.out.println(Math.PI);
        System.out.println(Person.ok);

        Person person2 = new Person();

        System.out.println(person1.getId());
        System.out.println(person2.getId());

        person1.showInfo();

        Fish fish = new Fish();
        Seaweed seaweed = new Seaweed();

        Info info1 = new Machine();
        info1.showInfo();

        Info info2 = new Person();
        info2.showInfo();

        System.out.println();

        outputInfo(person1);
        outputInfo(info1);
    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }
}
