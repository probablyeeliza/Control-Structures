import java.util.Scanner;
/**
 * The Menu class has a method that displays a menu and a method that allows the user to pick
 * an option
 *
 * @author Eliza
 * @version 01/11/2023
 */
public class Menu
{
    /**
     * This is the main method, it creates an instance of the Menu class and calls the 
     * processUserChoices method
     * 
     */
    public static void main(String[] args)
    {
        Menu m = new Menu();
        m.processUserChoices();
     }
     /**
      * Displays a menu to the user
      */
    public void displayMenu()
    {
        System.out.println("Please select one of the options below");
        System.out.println("1. Grade");
        System.out.println("2. Table");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }
    /**
     * Initialzes choice variable, calls displayMenu method, creates instance of Choice class, 
     * uses Scanner to assign user input to choice variable
     * then uses if statements to perform different actions depending on user input
     * all of that is in a do while loop that loops the method as long as the choice inputted
     * is no 0
     */
    public void processUserChoices()
    {
        int choice;
        do
        {
        displayMenu();
        Choice c = new Choice();
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        
        if (choice == 1)
        {System.out.println("Please enter the percentage");
        c.displayGrade(); }
        if (choice == 2)
        { System.out.println("Please follow the instructions");
        c.displayTable(); }
        if (choice == 3)
        {c.displayStatistics(); }
        if (choice == 0)
        {c.displayExit(); }
        if ((choice < 0) || (choice > 3))
        {c.displayIncorrect();}
    } while (choice !=0);

    }
}
