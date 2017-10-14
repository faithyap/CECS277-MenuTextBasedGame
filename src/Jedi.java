/**
 * 
 * This program creates a Jedi class, which is an extension of the Person class and also implements both the Healable and hasForce interfaces.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 * 
 */
import java.util.Random;
public class Jedi extends Person implements Healable, HasForce
{
    /**
     * String that holds the color of the lightsaber
     */
    private String saberColor;
    /**
     * Constructor method for the class Jedi
     * @param n string that holds the name of the jedi
     * @param q string that holds the quote of the jedi
     * @param c string that holds the lightsaber color of the jedi
     */
    public Jedi (String n, String q, String c)
    {
        super(n, 100, "Lightsaber", q);
        saberColor = c;
    }
    
    /**
     * Heals the jedi for a certain amount
     * @param hp amount to be healed by
     */
    @Override
    public void heal(int hp)
    {
        modifyHp(hp*(-1));
        System.out.println(getName() + " has been healed for " + hp + " health!");
    }
    
    /**
     * Makes the jedi attack with a lightsaber
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
     * Makes the jedi attack using the force
     * @param e entity to be attacked
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
            System.out.println(getName() + " is now attacking! They aim for " + e.getName() + "!");
            System.out.println(e.getName() + " lost " + rng + " health!");
            System.out.print(getName() + " says ");
            sayCatchPhrase();
        }
        else
        {
            System.out.println(getName() + " is now attacking! They aim for " + e.getName() + "!");
            System.out.println("The attack failed!");
        }
    }
    
    /**
     * Allows the jedi to use the doTask method
     * @param e entity the task is to be done on.
     */
    @Override
    public void doTask(Entity e)
    {
        if (getTask().equals("1"))
        {
            attack(e);
        }
        else
        {
            useForce(e);
        }
    }
}
