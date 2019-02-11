 /* 
  *Concordia CSC422 - Zombie War Group Assignment.
  * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
  * 2019-02-10
  *
  */
 package edu.csp.csc422;

 public abstract class Survivor {
     private int health;
     private int damage;
     private String name;

     public Survivor() {

     }

     public int getHealth() {
         return health;
     }
     public void setHealth(int health) {
         this.health = health;
     }
     public int getDamage() {
         return damage;
     }
     public void setDamage(int damage) {
         this.damage = damage;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
 }
