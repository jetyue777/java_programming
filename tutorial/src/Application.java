class Person {

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


    public static void showInfo() {
        System.out.println("hello!" + description);
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


}

public class Application {

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setAge(26);
        person1.setName("Jet");

        System.out.println(person1.getAge());

        Person.description = "how are you doing?";
        System.out.println(Person.description);
        Person.showInfo();

        System.out.println(Math.PI);
        System.out.println(Person.ok);

        Person person2 = new Person();

        System.out.println(person1.getId());
        System.out.println(person2.getId());
    }
}
