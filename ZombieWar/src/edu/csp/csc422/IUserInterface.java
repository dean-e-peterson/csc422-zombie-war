/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-07
 */
package edu.csp.csc422;

/**
 * Interface to generic user interface functionality.
 * Intended to allow replacement of text user interface with a graphical
 * user interface with minimum disruption.
 */
public interface IUserInterface {
    /**
     * Prompts the user for an integer and returns it to the caller.
     * @param prompt Prompt to display to the user.
     * @return Returns int entered by the user.
     */
    int promptForInt(String prompt);
    
    /**
     * Prompts the user for a String and returns it to the caller.
     * @param prompt Prompt to display to the user.
     * @return  Returns the String entered by the user.
     */
    String promptForString(String prompt);
    
    /**
     * Displays a status report, or any String really, to the user.
     * @param report String to display.
     */
    void printReport(String report);
    
    /**
     * NOTE:  For future use with a graphical user interface.
     *        Likely would do nothing on a text interface.
     * Displays a character's symbol on the screen.
     * @param character Character to display.
     */
    //void displayCharacter(ICharacter character);
}
