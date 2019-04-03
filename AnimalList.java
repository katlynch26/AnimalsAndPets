/**
 * Implements a list of Animals as an ArrayList
 * This List will add random animals as written by everyone in the class.
 *
 * @author APCS-A @HB 
 * @version 2019-04
 */

import java.util.ArrayList;

public class AnimalList
{

    public final int NUM_ANIMALS = 10;
    private ArrayList <Animal> aList;
 
    
    public AnimalList ()
    {
        aList = new ArrayList<Animal>();
    }
    
    /** Adds a new random Animal to the list!
     */
    public void addRandomAnimal()
    {
        int n = (int)(Math.random() * NUM_ANIMALS);
        switch (n)
        {
            case 0: aList.add(new ____() ); break;
            case 1: aList.add(new ____() ); break;
            case 2: aList.add(new ____() ); break;
            case 3: aList.add(new ____() ); break;
            case 4: aList.add(new ____() ); break;
            case 5: aList.add(new ____() ); break;
            case 6: aList.add(new ____() ); break;
            case 7: aList.add(new ____() ); break;
            case 8: aList.add(new ____() ); break;
            case 9: aList.add(new ____() ); break;
        }
        
    }
    
    /** Prints the list of Animals  */
    public void printList()
    {
        for (Animal a : aList)
        {
            a.greeting();
            a.speak();
            a.eat();
            System.out.println();
        }
    }
    
    /**
     * Makes a list of Animals!
     */
    public static void main (String[] args)
    {
        AnimalList myList = new AnimalList();
        
        for (int i = 0; i < 15; i++)
        {
            myList.addRandomAnimal();
        }
        
        myList.printList();
    }
}
