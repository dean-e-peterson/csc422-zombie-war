/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-10
 */
package edu.csp.csc422;
import java.util.*;
import java.util.Random;

public class ZombieWar {

    /**
     * @param args the command line arguments
     */
    
    private static int incrementingNumber = 0;
    
    public static void main(String[] args) {
        List<Survivor> survivorList = new ArrayList<Survivor>();
        List<Zombie> zombieList = new ArrayList<Zombie>();
        
        // Randomly choose total number of Survivors and Zombies.
        Random rand = new Random();
        int survivorCount = rand.nextInt(10) + 20;
        int zombieCount = rand.nextInt(10) + 10;

        for (int i = 0; i < survivorCount; i++) {
            survivorList.add(generateSurvivor());
        }
        
        for (int i = 0; i < zombieCount; i++) {
            zombieList.add(generateZombie());
        }
        
        //Starting console dialog
        System.out.println("Welcome To Zombie War!");
        System.out.println("Press Enter to Start the Game.");
        
        //Output to the console
        System.out.println("We have " + survivorList.size() + " survivors trying to make it to safety.");
        System.out.println("But there are " + zombieList.size() + " zombies waiting for them.");
        
        // Go until some team is all gone.
        while((zombieList.size() > 0) && (survivorList.size() > 0)) {
       
            for (Survivor survivor : survivorList) {
                // Each survivor attacks each zombie
                int damage = survivor.getDamage();
                
                for (int i = 0;i<zombieList.size();i++) {
                    
                    zombieList.get(i).setHealth(zombieList.get(i).getHealth() - damage);

                    if (zombieList.get(i).getHealth() <= 0) {
                        // Dead.  Bye, zombie.
                        System.out.println(survivor.getName() + " killed " + zombieList.get(i).getName());
                        zombieList.remove(i);
                    }
                    // If that was last zombie, stop trying to hurt more.
                    if (zombieList.size() == 0) {
                        break;
                    }
                }
            }

            // Zombies go last.
            for (Zombie zombie : zombieList) {
                // Always pick on the first (remaining) survivor.
                int damage = zombie.getDamage();
                
                for (int i = 0;i<survivorList.size();i++) {
                    survivorList.get(i).setHealth(survivorList.get(i).getHealth() - damage);
                    if (survivorList.get(i).getHealth() <= 0) {
                        // Dead.  Bye, survivor.
                        System.out.println(zombie.getName() + " killed " + survivorList.get(i).getName());
                        survivorList.remove(i);
                    }
                    
                    // If that was last survivor, stop trying to hurt more.
                    if (survivorList.size() == 0) {
                        break;
                    }
                }
            }
        }
        
        System.out.println("There are " + survivorList.size() + " survivors left.");
        System.out.println("There are " + zombieList.size() + " zombies left.");
        
        System.exit(0);
    }
    
    private static Survivor generateSurvivor() {
        // Randomly choose which TYPE of Survivor to make.        
        Random rand = new Random();
        int zombieTypeCode = rand.nextInt(3);
        switch (zombieTypeCode) {
            case 0: 
                return new Soldier("Soldier " + incrementingNumber++);
            case 1:
                return new Teacher("Teacher " + incrementingNumber++);
            default:
                return new Child("Child " + incrementingNumber++);
        }
    }

    private static Zombie generateZombie() {
        // Randomly choose which TYPE of Zombie to make.
        Random rand = new Random();
        int zombieTypeCode = rand.nextInt(2);
        switch (zombieTypeCode) {
            case 0: 
                return new CommonInfected();
            default:
                return new Tank();
        }
    }
    
}
