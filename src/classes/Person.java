package classes;
public class Person {
    private int secretId;
    private String secretAPIKey;
    protected int someValue; // the subclass can access it within the same class or package

    int defaultSpecifier; // no specifier so it package-private

    String name;
    int id = 0;
    /*
    Static variable will not have its memory reallocated when new object is created
    of Person class, also it will retain its value throughout the entire program
    * */
    static int peopleCount = 0;
    public Person(String name) {
        this.name = name;
        this.id++;
        peopleCount++;
    }

    // Overloading the constructor of Person class
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
        peopleCount++;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
