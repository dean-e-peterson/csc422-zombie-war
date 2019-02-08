/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-07
 */
package edu.csp.csc422;

/**
 * Stub implementation of a generic character.
 * This would be replaced with Character, Zombie, Survivor, etc. hierarchy.
 * Meets very minimum requirements of ICharacter for other testing.
 * See also StubCharacterFactory.
 */
public class StubCharacter implements ICharacter {
    static int dummyCount = 0;
    private int healthPoints = 50;
    private String name;
    
    public StubCharacter() {
        name = "Test dummy " + dummyCount++;
    }

    @Override
    public int calculateAttackDamage() {
        // Just some random damage 1 to 20.
        return (int)(Math.random() * 20) + 1;
    }

    @Override
    public void damage(int damage) {
        // Uh-oh, took damage.
        if (damage > healthPoints) {
            healthPoints = 0; // dead.
        }
        else {
            healthPoints -= damage;
        }
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
