import java.lang.*;
class Person {
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

public class Main {
    public static void main(String[] args) {
        // write the code here
    }
}
