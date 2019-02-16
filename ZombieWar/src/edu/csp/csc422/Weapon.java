 /* 
  *Concordia CSC422 - Zombie War Group Assignment.
  * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
  * 2019-02-10
  *
  */

 package edu.csp.csc422;
 import java.util.Random;

 public abstract class Weapon {
     
     private String Name;
     private int baseDamage;
     private int accuracy;
     
     public Weapon() {

     }
     public String getName() {
         return Name;
     }
     public void setName(String Name) {
         this.Name = Name;
     }
     public int getbaseDamage() {
         return baseDamage;
     }
     public void setbaseDamage(int baseDamage) {
         this.baseDamage = baseDamage;
     }
     public int getactualDamage() {
        Random rand = new Random();
         if(rand.nextInt(100) < getAccuracy()){
             System.out.println("hit");
             return baseDamage;
         }
         else{
             System.out.println("miss");
             return 0;
         }
     }
     public int getAccuracy() {
         return accuracy;
     }
     public void setAccuracy(int accuracy) {
         this.accuracy = accuracy;
     }
 }
