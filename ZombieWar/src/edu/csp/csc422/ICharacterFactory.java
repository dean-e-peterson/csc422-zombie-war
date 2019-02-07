/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-07
 */
package edu.csp.csc422;

import java.util.ArrayList;

/**
 * Interface for a factory class that can create two sets of characters,
 * the Zombies and the Survivors.  Implementations could include a class that
 * creates a random variety of zombies and survivors, and a class
 * that lets the user choose the types and quantities of zombies and survivors.
 */
public interface ICharacterFactory {
    /**
     * Create a set of survivor class instances to act as team survivor.
     * @return Survivors
     */
    ArrayList<ICharacter> makeSurvivors();
    
    /**
     * Create a set of zombie class instances to act as team zombie.
     * @return Zombies
     */
    ArrayList<ICharacter> makeZombies();
}
