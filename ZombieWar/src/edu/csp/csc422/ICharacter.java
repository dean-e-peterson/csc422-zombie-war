/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-07
 */
package edu.csp.csc422;

/**
 * Generic interface for any character, zombie or survivor, within the
 * ZombieWar game.  Includes what is needed by a Game class to handle
 * both sides of a battle.
 */
public interface ICharacter {
    /**
     * Calculates the attack damage this character does to any other character.
     * @return Damage amount in number of health points to subtract from the
     * other character.
     */
    int calculateAttackDamage();
    
    /**
     * Applies the specified amount of damage to this character, reducing
     * its health points.
     * @param damage The number of health points to deduct from this character.
     */
    void damage(int damage);
    
    /**
     * Gets this character's remaining health points.
     * @return The number of health points the character has, or 0 if dead.
     */
    int getHealthPoints();
    
    /**
     * Gets a name to call this character in reports to the user.
     * This could be generic names like "Soldier 0" or "Teacher 4".
     * @return Some identifying string that won't make the user feel too
     * bad when they find out the character has died.
     */
    String getName();    
}
