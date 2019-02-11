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
    
    
    
    public static void main(String[] args) {
        //create instances of character classes
        Tank tank = new Tank("Tank"); 
        CommonInfected comInfect = new CommonInfected("Common Infected");
        Soldier soldier = new Soldier("Soldier");
        Teacher teacher = new Teacher("Teacher");
        Child child = new Child("Child");
    
        //create list for just Zombies
        List<String> zombieList = new ArrayList<String>();
        zombieList.add(tank.getName());
        zombieList.add(comInfect.getName());
        
        //create list or just Survivors
        List<String> survivorList = new ArrayList<String>();
        survivorList.add(teacher.getName());
        survivorList.add(child.getName());
        survivorList.add(soldier.getName());
   
        //random Zombie List
        int low = 10;
        int high = 20;
        Random randInt1 = new Random();
        int randomInt1 = randInt1.nextInt(high - low) + low; //randomly chooses a number between 10 and 20  for the size of the list
        
        List<String> randomZombieList = new ArrayList<String>(randomInt1);
        Random random1 = new Random();
        
        for(int i = 0;i<randomZombieList.size();i++){
            String rand1 = zombieList.get(random1.nextInt(zombieList.size()));
            
            randomZombieList.add(rand1);
        }
        
        
        //random Survivor List
        Random randInt2 = new Random();
        int randomInt2 = randInt2.nextInt(high - low) + low; //randomly chooses a number between 10 and 20  for the size of the list
        
        List<String> randomSurvivorList = new ArrayList<String>(randomInt2);
        Random random2 = new Random();
        
        for(int i = 0;i<randomSurvivorList.size();i++){
            String rand2 = survivorList.get(random2.nextInt(survivorList.size()));
            
            randomSurvivorList.add(rand2);
        }
        
        //Starting console dialog
        System.out.println("Welcome To Zombie War!");
        System.out.println("Press Enter to Start the Game.");
        
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        
        //Output to the console
        System.out.println("We have " + randomSurvivorList.size() + " survivors trying to make it to safety.");
        
        System.out.println("But there are " + randomZombieList.size() + " zombies waiting for them");
        
        //initializing values for while loop
        int x = 0;
        int val1 = 0;
        int val2 = 0;
        int dam1 = 0;
        int dam2 = 0;
        
        
        //game logic
        //while both list sizes are greater than 0, have survivor in index 0 attack
        //zombie in index 0, repeat but with zombie attacking survivor
        while((randomZombieList.size() > 0) || (randomSurvivorList.size() > 0)){
            if(randomSurvivorList.get(x).equals("Soldier")) {
                val1 = soldier.getHealth();
                dam1 = soldier.getDamage();
            } else if (randomSurvivorList.get(x).equals("Teacher")) {
                val1 = teacher.getHealth();
                dam1 = teacher.getDamage();
            } else if (randomSurvivorList.get(x).equals("Child")) {
                val1 = child.getHealth();
                dam1 = child.getDamage();
            }
            
            if(randomZombieList.get(x).equals("Tank")) {
                val2 = tank.getHealth();
                dam2 = tank.getDamage();
            } else if(randomZombieList.get(x).equals("Common Infected")) {
                val2 = comInfect.getHealth();
                dam2 = comInfect.getDamage();
            }
            
            //survivor attacking zombie
            val2 = val2 - dam1;
            
            //set health points of zombie to equal val2
            if(randomZombieList.get(x).equals("Tank")) {
                tank.setHealth(val2);
                
                //check if the survivor or zombie has less than 0 health points
                //if less than 0 then remove them from their array
                if(tank.getHealth() <= 0) {
                    randomZombieList.remove(x);
                }
            } else if(randomZombieList.get(x).equals("Common Infected")) {
                comInfect.setHealth(val2);
                
                //check if the survivor or zombie has less than 0 health points
                //if less than 0 then remove them from their array
                if(comInfect.getHealth() <= 0) {
                    randomZombieList.remove(x);
                }
            }
            
            //zombie attacking survivor
            val1 = val1 - dam2;
            
            //set health points of survivor to eqaul val1
            if(randomSurvivorList.get(x).equals("Soldier")) {
                soldier.setHealth(val1);
                
                //check if the survivor or zombie has less than 0 health points
                //if less than 0 then remove them from their array
                if(soldier.getHealth() <= 0) {
                    randomSurvivorList.remove(x);
                }
            } else if (randomSurvivorList.get(x).equals("Teacher")) {
                teacher.setHealth(val1);
                
                //check if the survivor or zombie has less than 0 health points
                //if less than 0 then remove them from their array
                if(teacher.getHealth() <= 0) {
                    randomSurvivorList.remove(x);
                }
            } else if (randomSurvivorList.get(x).equals("Child")) {
                child.setHealth(val1);
                
                //check if the survivor or zombie has less than 0 health points
                //if less than 0 then remove them from their array
                if(child.getHealth() <= 0) {
                    randomSurvivorList.remove(x);
                }
            }
        }
        
        //Output to the console
        if(randomSurvivorList.size() > 0) {
            System.out.println("It seems " + randomSurvivorList.size() + " survivors have made it to safety");
        } else {
            System.out.println("None of the survivors made it.");
        }
    }
}
