package classes;

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

    public void talk() {
        System.out.println("I am a Man, my name is " + super.name);
    }
}

public class Classes {
    public static void main(String[] args) {
        System.out.println("hello from main of classes");
    }
}
