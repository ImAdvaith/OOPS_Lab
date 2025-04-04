class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayAnimalInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

class Lion extends Animal {
    String species;

    Lion(String name, int age, String species) {
        super(name, age);  
        this.species = species;
    }

    void displayLionInfo() {
        displayAnimalInfo();  
        System.out.println("Species: " + species);
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5, "Panthera leo");
        lion.displayLionInfo();
    }
}
