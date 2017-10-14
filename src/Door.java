/**
 * This programs creates a Door class, which is the extension of an Entity.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 */
public class Door extends Entity
{
    /**
     * Constructor method for the class Door
     * @param n string that holds the name of the door
     */
    public Door(String n)
    {
        super(n, 10);
    }
    
    /**
     * Allows the door to use the doTask method.
     * @param e entity the task is to be done on.
     */
    @Override
    public void doTask(Entity e)
    {
        
    }
}
