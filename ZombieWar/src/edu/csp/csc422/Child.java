/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-10
 */
package edu.csp.csc422;

public class Child extends Survivor {
    public static int count = 0;
    
    public Child() {
        setName("Child " + count++);
        setHealth(20);
        setDamage(2);
    }

}
