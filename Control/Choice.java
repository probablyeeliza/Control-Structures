import java.util.Scanner;
import java.util.Formatter;
import java.lang.Math;
/**
 * The Choice class has a method that displays the user's grade,
 * a method that displays a table of values
 * a method that displays the statistics of values
 * a method that displays an exit message
 * a method that displays an error message
 *
 * @author Eliza
 * @version 01/11/2023
 */
public class Choice
{
    /**
     * Initializes grade variable
     * Uses a Scanner to assign user input to grade variable
     * Uses if statements to define the grade boundaries and display the correct message
     */
    public static void displayGrade()
    {
        double grade;
        Scanner s = new Scanner(System.in);
        grade = s.nextDouble();
        
        if (grade > 69.0)
        System.out.println("Grade is A");
        if ((grade > 59.0) && (grade < 69.0))
        System.out.println("Grade is B");
        if ((grade > 49.0) && (grade < 59.0))
        System.out.println("Grade is C");
        if ((grade > 39.0) && (grade < 49.0))
        System.out.println("Grade is D");
        if (grade < 40.0)
        System.out.println("Grade is E");
    }
    /**
     * Initializes a lower and upper variable
     * Uses a scanner to assign user input to lower and upper variable
     * Displays the titles for the table's columns
     * Uses a for loop to allow for numbers between the lower and upper values to be included
     * Initializes variables for the square, cube and square root values
     */
    public static void displayTable()
    {
        int lower;
        int upper;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lower value");
        lower = s.nextInt();
        System.out.println("Enter the upper value");
        upper = s.nextInt();
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Value", "Square", "Cube", "Square Root");
        for (int i = lower ; i < upper; i++)
        {
        int a = i*i;
        int b = i*i*i;
        double c = Math.sqrt(i);
        System.out.printf("%-10s %-10s %-10s %-10s\n", i, a, b, c);
        }
        int d = upper*upper;
        int e = upper*upper*upper;
        double f = Math.sqrt(upper);
        System.out.printf("%-10s %-10s %-10s %-10s\n", upper, d, e, f);
    }
    /**
     * Initializes variables
     * Uses a while loop takes in user input and loops until -1 is entered
     * then calculates and displays total, average, minimum and maximum
     */
    public static void displayStatistics()
    {
        int total = 0;
        int average =0;
        int minimum = 0;
        int maximum =0;
        int counter = 0;
        
        while (counter >= 0 )
        {
            int number;
            counter++;
            System.out.println("Please enter your numbers up to 5");
            Scanner s = new Scanner(System.in);
            number = s.nextInt();
            
            if (number == -1)
            {
                break;
            }
            total = total + number;
            average = total/counter;
            if (counter ==1)
            {
                minimum = number;
                maximum = number;
            }
            else if (number > maximum)
            {
                maximum = number;
            }
            else if (number < minimum)
            {
                minimum = number;
            }
            if (counter == 5)
            {
                break;
            }
        }
        System.out.println("Here are the statistics:");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Total", "Average", "Maximum", "Minimum");
        System.out.printf("%-10s %-10s %-10s %-10s\n", total, average, maximum, minimum);
    }
    /**
     * Displays an exit message
     */
    public static void displayExit()
    {
        System.out.println("Goodbye");
    }
    /**
     * Display an error message
     */
    public static void displayIncorrect()
    {
        System.out.println("Please enter a choice from the Menu");
    }
}
