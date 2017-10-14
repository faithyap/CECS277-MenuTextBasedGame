/**
 * This program creates a Droid class, which is the extension of an Entity.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 */
public abstract class Droid extends Entity
{
    /**
     * Int value that holds the number of tasks
     */
    private int numTasks;
    /**
     * Constructor method for the class Droid
     * @param n string that holds the name of the droid
     * @param h int that holds the hp value of the droid
     * @param t int that holds the task number of the droid
     */
    public Droid(String n, int h, int t)
    {
        super(n, h);
        numTasks = t;
    }
    
    /**
     * Gets the task number of the droid
     * @return the task number of the droid
     */
    public int getNumTasks()
    {
        return numTasks;
    }
    
    /**
     * Executes the task of the droid
     */
    public void useTask()
    {
        System.out.println("BB8 has successfully broken the door. The rebels may now enter.");
    }
    
}
