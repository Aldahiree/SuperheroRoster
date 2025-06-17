import java.util.Scanner;
public class SuperheroRoster {
public static void main(String[] args) {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
            String[] heroNames = {"Spideer-Man", "Iron Man", "Black Widow"};
            String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat"};
            int[] powerLevels = {85, 90, 80};
        // 2. Print each hero's details using a loop
        // for (int i = 0; i < heroNames.length; i++) { ... }
        System.out.println("=== Superherp Roster ===")
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println();
        }
        // Search using user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hero name to search: ");
        String targetName = scanner.nextLine();
        searchHero(heroNames, abilities, powerLevels, targetName);

        // Calculate average power
        double avg = calculateAveragePower(powerLevels);
        System.out.println("\nAverage Power Level: " + avg);

        // Create Superhero objects
        Superhero[] heroes = new Superhero[3];
        heroes[0] = new Superhero("Spider-Man", "Web-slinging", 85);
        heroes[1] = new Superhero("Iron Man", "Flying and high-tech armor", 90);
        heroes[2] = new Superhero("Black Widow", "Stealth and combat", 80);

        // Display with OOP
        System.out.println("\n=== Object-Oriented Display ===");
        for (Superhero hero : heroes) {
            hero.displayHero();
            System.out.println();
        }

        // Sort and display by power
        System.out.println("=== Sorted by Power Level (Descending) ===");
        sortHeroesByPower(heroes);
        for (Superhero hero : heroes) {
            hero.displayHero();
            System.out.println();
        }

        scanner.close();
}

 
        // 3. Call the searchHero method to find a specific hero by name
        public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("\nHero Found!");
                System.out.println("Name: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero not found.");
        }
    }
 
        // 4. Calculate and display the average power level by calling calculateAveragePower method
        public static double calculateAveragePower(int[] powerLevels) {
        int total = 0;
        for (int level : powerLevels) {
            total += level;
        }
        return (double) total / powerLevels.length;
    }

    // Sort heroes by power (descending)
    public static void sortHeroesByPower(Superhero[] heroes) {
        for (int i = 0; i < heroes.length - 1; i++) {
            for (int j = i + 1; j < heroes.length; j++) {
                if (heroes[i].powerLevel < heroes[j].powerLevel) {
                    // swap
                    Superhero temp = heroes[i];
                    heroes[i] = heroes[j];
                    heroes[j] = temp;
                }
            }
        }
    }
}
// Sort heroes by power (descending)
    public static void sortHeroesByPower(Superhero[] heroes) {
        for (int i = 0; i < heroes.length - 1; i++) {
            for (int j = i + 1; j < heroes.length; j++) {
                if (heroes[i].powerLevel < heroes[j].powerLevel) {
                    // swap
                    Superhero temp = heroes[i];
                    heroes[i] = heroes[j];
                    heroes[j] = temp;
                }
            }
        }
    }
}
