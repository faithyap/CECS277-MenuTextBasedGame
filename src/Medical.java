/**
 * This programs creates a Medical class, which is the extension of a Droid.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 */
import java.util.Random;
public class Medical extends Droid
{
    /**
     * Constructor method for the class Medical
     * @param n string that holds the name of the medical droid
     * @param t int value that holds the task number of the medical droid.
     */
    public Medical(String n, int t)
    {
        super(n, 35, t);
    }
    
    /**
     * Allows the medical droid to execute their given task.
     * @param e entity the task is to be done on.
     */
    @Override
    public void doTask(Entity e)
    {
        Random generator = new Random();
        int rng = generator.nextInt(6) + 10;
        if (e instanceof Healable)
        {
            Healable character = (Healable) e;
            character.heal(rng);
            System.out.println(e.getName() + " has been healed for " + rng + " health.");
        }
    }
}
