/**
 * This programs creates a Computer class, which is the extension of an Entity.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 */
public class Computer extends Entity
{
    /**
     * Constructor method for the class Computer
     * @param n string that holds the name of the computer
     */
    public Computer(String n)
    {
        super(n, 200);
    }
    
    /**
     * Allows the computer to use the doTask method.
     * @param e entity the task is to be done on.
     */
    @Override
    public void doTask(Entity e)
    {
        
    }
}
