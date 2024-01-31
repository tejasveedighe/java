import java.lang.*;
class Person {
    private int secretId;
    private String secretAPIKey;
    protected int someValue; // the sub class can access it within the same class or package

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

class Employee {
    // final variables are constant variables
    // final methods are created to prevent method overriding
    // final classes cannot be inherited
    final private int salary;
    public int emp_id;

    static int count = 0;

    public Employee(int salary) {
        this.salary = salary;
        this.emp_id = ++count;
    }

    public int getSalary() {
        return this.salary;
    }
}

class Test {
    static final int var;
    static {
        var = 0;
    }
}


class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public Human() {
        this.name = "Tejasvee";
    }
    public void talk() {
        System.out.println("Hello Nature, i am " + this.name);
    }
}

class BabyHuman extends Human {
    public BabyHuman(String name) {
        super(name);
    }

    public BabyHuman() {
        super();
    }

    public void talk() {
        System.out.println("I cannot talk, my name is " + super.name);
    }

}

class Man extends Person {
    public Man(String name) {
        super(name);
    }
    public Man() {
        super();
    }

    public void talk() {
        System.out.println("I am a Man, my name is " + super.name);
    }
}

public class Main {
    public static void main(String[] args) {
        // write the code here

        Human Tejasvee = new Human("Tejasvee");
        Tejasvee.talk();

        BabyHuman Dexter = new BabyHuman("Dexter");
        Dexter.talk();
    }
}
