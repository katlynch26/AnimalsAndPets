
/**
 * Write a description of class Fox here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fox extends Animal
{
    public Fox ()
    {
        super();
        setSpecies("fox");
    }
    
    public void eat()
    {
        System.out.print ("Yum! mice and rabbits! \t");
    }
    
    public void speak ()
    {
        System.out.print ("nobody knows");
    }
}