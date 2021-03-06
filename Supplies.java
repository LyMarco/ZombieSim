import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The "Supplies" class for this Zombie Simulation, that includes supply crates of food and weapons.
 * 
 * @author Jasper Tu, Tyler Zhang, Ahrenn Sivananthan
 * @version Oct 2014
 */
public class Supplies extends Structure
{
    /**
     * Default constructor of the "Supplies" class.
     */
    public Supplies()
    {
        // For the amount of weapons, generate a random integer between 1 and 5.
        weapons = Greenfoot.getRandomNumber(5) + 2;
        // For the amount of food, generate a random integer between 1 and 20.
        food = Greenfoot.getRandomNumber(30) + 5;
    }

    /**
     * Act - do whatever the Supplies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Call the helper method, to destroy the supply crate object when necessary.
        destroyCrate();
    }    

    /**
     * A "private" or helper method that destroys the supply crate, should the number of supplies be reduced to 0.
     */
    private void destroyCrate()
    {
        if(weapons == 0 && food == 0)
        {
            getWorld().removeObject(this);
        }
    }

    /**
     * Take away a number of the food supply.
     * 
     * @param amount The amount of food that will be taken.
     */
    public void takeFood(int amount){
        if (amount > 0) {
            food -= amount;
        }
    }

    /**
     * Take away a number of the weapon supply.
     * 
     * @param amount The amount of weapon that will be taken.
     */
    public void takeWeapons(int amount){
        if (amount > 0) {
            weapons -= amount;
        }
    }
}

