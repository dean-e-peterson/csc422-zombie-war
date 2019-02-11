/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-10
 */
package edu.csp.csc422;

public class Tank extends Zombie {
    private static int count = 0;
    
    public Tank() {
        setName("Tank " + count++);
        setHealth(150);
        setDamage(20);
    }
    
}
