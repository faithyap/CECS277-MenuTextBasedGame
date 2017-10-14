/**
 * This interface is to be implemented into other classes so that they may use the heal method.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 */
public interface Healable
{
    /**
     * Method that heals the user by a certain amount
     * @param hp int value that holds how much hp to be healed by.
     */
    public void heal(int hp);
}
