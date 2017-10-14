/**
 * This program creates an Astromech class, which is the extension of a Droid.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 */
public class Astromech extends Droid
{
    /**
     * Constructor method for the class Astromech
     * @param n string value that holds the name of the astromech
     * @param t int value that holds the task number of the astromech
     */
    public Astromech(String n, int t)
    {
        super(n, 35, t);
    }
    
    /**
     * Method that tells the Astromech to do their assigned task
     * @param e value that holds the entity to be attacked
     */
    public void doTask(Entity e)
    {
        e.modifyHp(e.getHp());
        System.out.println("Processing...");
        System.out.println(e.getName() + "'s hp is now " + e.getHp());
        useTask();
    }
}
