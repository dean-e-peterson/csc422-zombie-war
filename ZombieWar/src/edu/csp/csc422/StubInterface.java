/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-07
 */
package edu.csp.csc422;

import java.util.Scanner;

/**
 * Stub implementation of user interface.
 * The minimum to test some things.
 */
public class StubInterface implements IUserInterface {
    Scanner input;

    public StubInterface() {
        input = new Scanner(System.in);
    }

    @Override
    public int promptForInt(String prompt) {
        System.out.println(prompt);
        return input.nextInt();
    }

    @Override
    public String promptForString(String prompt) {
        System.out.println(prompt);
        return input.next();
    }

    @Override
    public void printReport(String report) {
        System.out.println(report);
    }
    
}
