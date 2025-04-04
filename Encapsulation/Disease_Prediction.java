class Patient {
    private String name;
    private int age;
    private double weight;
    private String[] symptoms;

      public Patient(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.symptoms = new String[0]; 
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String[] getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String[] symptoms) {
        this.symptoms = symptoms;
        System.out.println("Symptoms updated for " + name);
    }

    public void predictDisease() {
        if (symptoms.length == 0) {
            System.out.println("No symptoms recorded. Cannot predict disease.");
            return;
        }

        System.out.print("Analyzing symptoms... ");
        if (containsSymptom("fever") && containsSymptom("cough")) {
            System.out.println("Possible Diagnosis: Flu or COVID-19.");
        } else if (containsSymptom("chest pain") && containsSymptom("shortness of breath")) {
            System.out.println("Possible Diagnosis: Heart Disease.");
        } else {
            System.out.println("No known disease detected. Further tests recommended.");
        }
    }

    private boolean containsSymptom(String symptom) {
        for (String s : symptoms) {
            if (s.equals(symptom)) return true;
        }
        return false;
    }
}

public class DiseasePredictionSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Rohith", 30, 75.5);

        patient1.setSymptoms(new String[]{"fever", "cough"});
        
        patient1.predictDisease();
    }
}
