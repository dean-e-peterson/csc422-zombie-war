/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-07
 */
package edu.csp.csc422;

import java.util.ArrayList;

/**
 * Stub character factory.
 * Just creates a few StubCharacter test dummies as both the
 * zombies and the survivors.
 */
public class StubCharacterFactory implements ICharacterFactory {

    @Override
    public ArrayList<ICharacter> makeSurvivors() {
        ArrayList<ICharacter> results = new ArrayList<>();
        for (int i=0; i < 5; i++) {
            results.add(new StubCharacter());
        }
        return results;
    }

    @Override
    public ArrayList<ICharacter> makeZombies() {
        ArrayList<ICharacter> results = new ArrayList<>();
        for (int i=0; i < 5; i++) {
            results.add(new StubCharacter());
        }
        return results;
    }
    
}
