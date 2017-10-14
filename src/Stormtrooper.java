/**
 * This program creates a Stormtrooper class, which is the extension of a Person.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 */
import java.util.Random;
public class Stormtrooper extends Person
{
    /**
     * Constructor method for the class Stormtrooper
     * @param n string that holds the name of the stormtrooper
     * @param q string that holds the quote of the stormtrooper
     */
    public Stormtrooper(String n, String q)
    {
        super(n, 50, "Blaster", q);
    }
    
    /**
     * Makes the stormtrooper do their attack
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
     * Makes the stormtrooper do their task
     * @param e entity that the task is to be done on.
     */
    @Override
    public void doTask(Entity e)
    {
        attack(e);
    }
}
