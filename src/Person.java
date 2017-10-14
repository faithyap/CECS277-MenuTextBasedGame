/**
 * This program creates a Person class, which is the extension of an Entity.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 */

public abstract class Person extends Entity
{
    /**
     * String value that holds the name of the person's weapon
     */
    private String weapon;
    /**
     * String value that holds the quote of the person
     */
    private String quip;
    /**
     * Constructor method for the class Person
     * @param n string that holds the name of the person
     * @param h int that holds the hp value of the person
     * @param w string that holds the weapon of the person
     * @param q string that holds the quote of the person
     */
    public Person(String n, int h, String w, String q)
    {
        super(n, h);
        weapon = w;
        quip = q;
    }
    
    /**
     * Makes the person say their catch phrase
     */
    public void sayCatchPhrase()
    {
        System.out.println(quip);
    }
    
    /**
     * Returns the weapon of the person
     * @return string that holds the weapon of the person
     */
    public String getWeapon()
    {
        return weapon;
    }
   
    /**
     * Makes the person execute their attack
     * @param e entity that is to be attacked
     */
    public abstract void attack(Entity e);
}
