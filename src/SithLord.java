/**
 * This program creates a SithLord, which is the extension of a Person that implements the hasForce interface.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 */

import java.util.Random;
public class SithLord extends Person implements HasForce
{
    private String saberColor;
    /**
     * Constructor method for the class SithLord
     * @param n string that holds the name of the sith lord
     * @param q string that holds the quote of the sith lord
     * @param c string that holds the color of the lightsaber of the sith lord
     */
    public SithLord(String n, String q, String c)
    {
        super(n, 100, "Lightsaber", q);
        saberColor = c;
    }
    
    /**
     * Makes the sith lord attack with their lightsaber
     * @param e entity to be attacked
     */
    @Override
    public void attack(Entity e)
    {
        // Determine how much damage is dealt
        Random generator = new Random();
        int rng = generator.nextInt(15) + 1;
        
        // Determine if the attack is successful or not
        Random success = new Random();
        int hitOrMiss = generator.nextInt(2);
        if (hitOrMiss == 1)
        {
            e.modifyHp(rng);
            System.out.println(e.getName() + " lost " + rng + " health!");
            System.out.print(getName() + " says ");
            sayCatchPhrase();
        }
        else
        {
            System.out.println("The attack failed!");
        }
    }
    
    /**
     * Makes the sith lord attack with the force
     * @param e  entity to be attacked
     */
    @Override
    public void useForce(Entity e)
    {
        // Determine how much damage is dealt
        Random generator = new Random();
        int rng = generator.nextInt(15) + 11;
        
        // Determine if the attack is successful or not
        Random success = new Random();
        int hitOrMiss = generator.nextInt(2);
        if (hitOrMiss == 1)
        {
            e.modifyHp(rng);
            System.out.println(e.getName() + " lost " + rng + " health!");
            System.out.print(getName() + " says ");
            sayCatchPhrase();
        }
        else
        {
            System.out.println("The attack failed!");
        }
    }
    
    /**
     * Makes the sith lord do their specified task
     * @param e entity the task is to be done on
     */
    @Override
    public void doTask(Entity e)
    {
        attack(e);
    }
    
}
