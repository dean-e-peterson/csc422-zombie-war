/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-07
 */
package edu.csp.csc422;

public class ZombieWar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stub();
    }
    
    private static void stub() {
        // Stub code
        IUserInterface ui = new StubInterface();
        ICharacterFactory factory;

        do {
            if (ui.promptForString("User-selected scenario?").equalsIgnoreCase("user")) {
                ui.printReport("Pretending to prompt user for # of zombies, etc.");
                // Tailored factory would need a user interface to ask user
                // how many Zombies, etc.
                // factory = new TailoredCharacterFactory(ui);
                factory = new StubCharacterFactory();
            }
            else {
                ui.printReport("Pretending to randomly generate # of zombies, etc.");
                // Random factory wouldn't need a user interface.
                // factory = new UserCharacterFactory();
                factory = new StubCharacterFactory();
            }

            // Creating a fresh Game each time ensures it gets right factory.
            Game game = new Game(ui, factory);
            game.runSimulation();
        }
        while (ui.promptForString("Again?").equalsIgnoreCase("yes"));
    }
    
}
