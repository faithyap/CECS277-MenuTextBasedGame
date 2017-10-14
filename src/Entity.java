/**
 * This program creates an Entity, which is an object that holds a name, a health value, an activity boolean and a task.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 */

public abstract class Entity
{
    /**
     * String that holds the name of the entity
     */
    private String name;
    /**
     * Int that holds the hp value of the entity
     */
    private int hp;
    /**
     * Boolean value that determines whether the entity is active or not
     */
    private boolean active;
    /**
     * String value that determines the task of the entity
     */
    private String task;
    
    /**
     * Constructor method for the class Entity
     * @param n string value that holds the name of the entity
     * @param h int value that holds the hp value of the entity
     */
    public Entity(String n, int h)
    {
        name = n;
        hp = h;
    }
    
    /**
     * Method that functions as a general command for all entities
     * @param e value that holds the entity to do this task on
     */
    public abstract void doTask(Entity e);
    
    /**
     * Returns a string that contains the name of the entity
     * @return string that contains the name of the entity
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns an int that contains the hp value of the entity
     * @return int that contains the hp value of the entity
     */
    public int getHp()
    {
        return hp;
    }
    
    /**
     * Returns a boolean that indicates whether the entity is active
     * @return boolean that indicates whether the entity is active
     */
    public boolean getActive()
    {
        if (hp <= 0)
        {
            active = false;
        }
        else
        {
            active = true;
        }
        return active;
    }
    
    /**
     * Returns a string that holds the task of the entity
     * @return string that holds the task of the entity
     */
    public String getTask()
    {
        return task;
    }
    
    /**
     * Alters the hp value of the entity by a certain amount
     * @param h amount of hp to be added or subtracted
     */
    public void modifyHp(int h)
    {
        hp = hp - h;
        if (hp <= 0)
        {
            hp = 0;
            active = false;
        }
    }
    
    /**
     * Sets the task of the entity
     * @param t string that holds the task of the entity
     */
    public void setTask(String t)
    {
        task = t;
    }
}