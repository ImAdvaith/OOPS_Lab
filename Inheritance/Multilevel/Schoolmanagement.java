class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    void displayStudentInfo() {
        displayPersonInfo();
        System.out.println("Course: " + course);
    }
}


class GraduateStudent extends Student {
    String thesisTopic;

    GraduateStudent(String name, int age, String course, String thesisTopic) {
        super(name, age, course);
        this.thesisTopic = thesisTopic;
    }

    void displayGraduateStudentInfo() {
        displayStudentInfo();
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        GraduateStudent gradStudent = new GraduateStudent("Advaith", 24, "Computer Science", "AI in Healthcare");
        gradStudent.displayGraduateStudentInfo();
    }
}
