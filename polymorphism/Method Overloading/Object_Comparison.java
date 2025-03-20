class Comparator {

    public boolean compare(int a, int b) {
        return a == b;
    }

    public boolean compare(String a, String b) {
        return a.equals(b);
    }

    public boolean compare(Person a, Person b) {
        return a.name.equals(b.name) && a.age == b.age;
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectComparison {
    public static void main(String[] args) {
        Comparator comparator = new Comparator();

        System.out.println("Are 5 and 5 equal? " + comparator.compare(5, 5));
        System.out.println("Are 'Hello' and 'World' equal? " + comparator.compare("Hello", "World"));

        Person person1 = new Person("Ask", 30);
        Person person2 = new Person("Ask", 30);
        System.out.println("Are Ask and Ask equal? " + comparator.compare(person1, person2));
    }
}
