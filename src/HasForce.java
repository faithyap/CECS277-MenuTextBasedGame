/**
 * This interface is to be implemented into other classes so that they may use the useForce method.
 * 
 * @author Faith Yap
 * @since 2/3/2016
 * @version 1.0
 */
public interface HasForce
{
    /**
     * Allows the force to be used on an entity
     * @param e entity that the force will be used on
     */
    void useForce(Entity e);
}
