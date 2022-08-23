public class Character {
    // Attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    // Method
    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }

    // Method
    public void sayMyAgility() {
        System.out.println("My Agility is " + agility);
    }

    // Method
    public void sayMyIntelligence() {
        System.out.println("My Intelligence is " + intelligence);
    }

    // Method
    public void sayMyStrength() {
        System.out.println("My Strength is " + strength);
    }

    // Constructor
    public Character(int str, int agi, int intel, String characterName) {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = characterName;
    }
}
