public class Cat { 
    static String family = "Felidae";
    String name;
    int age;
    Character gender;
    double weight;

    public Cat(String name, int age, Character gender, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void brain() {
        System.out.println("Кот умный и знает команды ...");
    }

    public String sleep() {
        return "Кот спит на ...";
    }

    public void infoCat() {
        if (gender == 'f') {
            System.out.printf("Эту кошку зовут %s, ей %d лет и весит она %.2f кг. \n", name, age, weight);
        } else {
            System.out.printf("Этого кота зовут %s, ему %d лет и весит он %.2f кг.\n", name, age, weight);
        }
    }
}
