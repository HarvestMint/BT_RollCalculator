/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battletechAlphastrike;
import java.util.Scanner;
/**
 *
 * @author keyla
 */
public class AlphaStrikeCalculations {
    public static void main(String[] args) {
    
 Scanner input = new Scanner(System.in);
 
 //Indirect Fire Calc Title.
 System.out.println("Indirect Fire Roll Calculations");
 
 
 
 /*Indirect fire attacks use the range and movement modifier of the attacking 
    unit, the movement modifiers of the target, and terrain and movement 
 modifiers based on the spotter's LOS. An additional +1 to-hit modifier applies 
 to the attack itself.*/
 
 //Variables 
 double pilotSkill;
 double attackerRange;
 double attackerMove;
 double targetMove;
 double spotMove;
 double spotTerraMod;
 
         
        
    //User Inputs
    System.out.println("What is your pillot's skill level?");
        pilotSkill = input.nextDouble();
        
        System.out.println("What is your Range Modifier?");
        attackerRange = input.nextDouble();
        
        System.out.println("What is your movement modifier?");
        attackerMove = input.nextDouble();
        
        System.out.println("What is the Target's TMM?");
        targetMove = input.nextDouble();
        
        System.out.println("What is your spotter's movement modifier?");
        spotMove = input.nextDouble();
        
        System.out.println("What are the spotter's Terrain modifiers, if any?");
        spotTerraMod = input.nextDouble();
    
        //Actual calculation part
        double indirect;
                indirect = pilotSkill + attackerRange + attackerMove + spotMove + spotTerraMod + targetMove;
  
        if (indirect > 12) {
            System.out.println("This roll is not possible");
        }

        else {
//Number to beat with 2d6
        System.out.println("Indirect Fire Modifier: " + indirect);
        System.out.println();}
}}
