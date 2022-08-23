public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
        // Calls the sayMyName method
        knight.sayMyName();
        // Calls the sayMyAgility method
        knight.sayMyAgility();
        // Calls the sayMyIntellignece method
        knight.sayMyIntelligence();
        // Calls the sayMyStrength method
        knight.sayMyStrength();



        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Akasha");
        // Calls the sayMyName method
        mage.sayMyName();
        // Calls the sayMyAgility method
        mage.sayMyAgility();
        // Calls the sayMyIntellignece method
        mage.sayMyIntelligence();
        // Calls the sayMyStrength method
        mage.sayMyStrength();


        // Creates a new object named "mage" from Character class
        Character thief = new Character(5, 10, 0, "Gondar");
        // Calls the sayMyName method
        thief.sayMyName();
        // Calls the sayMyAgility method
        thief.sayMyAgility();
        // Calls the sayMyIntellignece method
        thief.sayMyIntelligence();
        // Calls the sayMyStrength method
        thief.sayMyStrength();


        // Creates a new object named "mage" from Character class
        Character healer = new Character(99999, 999999, 9999999, "Elane");
        // Calls the sayMyName method
        healer.sayMyName();
        // Calls the sayMyAgility method
        healer.sayMyAgility();
        // Calls the sayMyIntellignece method
        healer.sayMyIntelligence();
        // Calls the sayMyStrength method
        healer.sayMyStrength();

    }
}
