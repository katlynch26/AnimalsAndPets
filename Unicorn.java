
/**
 * A unicorn!
 *
 * @author Ella Kazazic
 * @version 2019-04
 */
public class Unicorn extends Animal
{
    public Unicorn ()
    {
        super();
        setSpecies("unicorn");
    }
    
    public void eat()
    {
        System.out.print("Yum! Skittles! \t");
    }
    
    public void speak()
    {
        System.out.print (" < godly noises > ");
    }
}
