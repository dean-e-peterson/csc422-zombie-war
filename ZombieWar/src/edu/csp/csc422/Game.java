/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-07
 */
package edu.csp.csc422;

import java.util.ArrayList;

/**
 * Stub Game class, mainly to demonstrate roughly how other classes and
 * Interfaces might be used.
 */
public class Game {
    IUserInterface ui;
    ICharacterFactory factory;
    ArrayList<ICharacter> survivors;
    ArrayList<ICharacter> zombies;
    
    public Game(IUserInterface ui, ICharacterFactory factory) {
        this.ui = ui;
        this.factory = factory;
        survivors = factory.makeSurvivors();
        zombies = factory.makeZombies();        
    }
    
    public void runSimulation() {
        ui.printReport("Pretending to start simulation.");
        
        // Note:  There may be better algorithms for attack rounds.
        // In particular, removing dead zombies and survivors from the lists
        // results in no record of how many zombies were around before they
        // died to report to the user at the end.
        
        while (survivors.size() > 0 && zombies.size() > 0) {
            runAttackRound();
        }
    }
    
    private void runAttackRound() {
        // Survivors go first.  Zombies are slow.
        for (ICharacter survivor : survivors) {
            // Always pick on the first (remaining) zombie.
            ICharacter zombie = zombies.get(0);
            zombie.damage(survivor.calculateAttackDamage());
            if (zombie.getHealthPoints() == 0) {
                // Dead.  Bye, zombie.
                ui.printReport(survivor.getName() + " killed " + zombie.getName());
                zombies.remove(0);
                // If that was last zombie, stop trying to hurt more.
                if (zombies.size() == 0) {
                    break;
                }
            }
        }
        
        // Zombies go last.
        for (ICharacter zombie : zombies) {
            // Always pick on the first (remaining) survivor.
            ICharacter survivor = survivors.get(0);
            survivor.damage(zombie.calculateAttackDamage());
            if (survivor.getHealthPoints() == 0) {
                // Dead.  Bye, survivor.
                ui.printReport(zombie.getName() + " killed " + survivor.getName());
                survivors.remove(0);
                // If that was last zombie, stop trying to hurt more.
                if (survivors.size() == 0) {
                    break;
                }
            }
        }
    }
}
