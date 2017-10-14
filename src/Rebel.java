/**
 * This program creates a Rebel, which is the extension of a Person that implements the Healable interface.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 */

import java.util.Random;
public class Rebel extends Person implements Healable
{
    /**
     * Constructor method for the class Rebel
     * @param n string that holds the name of the rebel
     * @param q string that holds the quote of the rebel
     */
    public Rebel(String n, String q)
    {
        super(n, 50, "Blaster", q);
    }
    
    /**
     * Allows the rebel to be healed by a certain amount
     * @param hp int value that holds how much to be healed by
     */
    @Override
    public void heal(int hp)
    {
        modifyHp(hp*(-1));
        System.out.println(getName() + " has been healed for " + hp + " health!");
    }
    
    /**
     * Makes the rebel do their attack
     * @param e entity that the attack will be done to
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
     * Makes the rebel do their task
     * @param e entity that task is to be done on.
     */
    @Override
    public void doTask(Entity e)
    {
        attack(e);
    }
    
}
