/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-10
 */
package edu.csp.csc422;

public class Teacher extends Survivor {
    public static int count = 0;
    
    public Teacher() {
        setName("Teacher " + count++);
        setHealth(50);
        setDamage(5);
    }

}
