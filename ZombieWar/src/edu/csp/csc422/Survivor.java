 /* 
  *Concordia CSC422 - Zombie War Group Assignment.
  * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
  * 2019-02-16
  *
  */
 package edu.csp.csc422;

import java.util.Random;

 public abstract class Survivor {
     private int health;
     private String name;
     private Weapon currentWeapon;
    
     public Survivor (){
        currentWeapon = generateWeapon();
     }
     public String getWeaponName(){
         return currentWeapon.getName();
     }
     public int getDamage() {
         return currentWeapon.getactualDamage();
     }
     public int getHealth() {
         return health;
     }
     public void setHealth(int health) {
         this.health = health;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     private static Weapon generateWeapon() {
        // Randomly choose which weapon to use.
        Random rand = new Random();
        int weaponTypeCode = rand.nextInt(6);
        switch (weaponTypeCode) {
            case 0: 
                return new Musket();
            case 1:
                return new KeyBlade();
            case 2:
                return new Pistol();
            case 3:
                return new Quarterstaff();
            case 4:
                return new BecDeCorbin();
            default:
                return new Bazooka();
        }
    }
 }
