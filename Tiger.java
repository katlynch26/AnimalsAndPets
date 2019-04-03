
/**
 * Write a description of class Tiger here.
 *
 * @author Kim Lin
 * @version 2019-04
 */
public class Tiger extends Animal
{
    public Tiger ()
    {
        super();
        setSpecies("tiger");
    }
    
    public void eat()
    {
        System.out.print("Yum! Deer, pigs, buffalo, and antelopes! \t");
    }
    
    public void speak()
    {
        System.out.print("Roar!");
    }
}
