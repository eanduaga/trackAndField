/*
 * To change this license header, choose License Headers in
 * Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DM3-1-03
 */

// Import the libraries
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Year;

public class Coach extends Person implements Serializable
{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    // Define the members
    private Year startYear;
    
    // Define the constructor
    public Coach()
    {
        super();
        setStartYear();
    }
    public Coach(boolean bl)
    {
        super(false);
    }

    // Define a method to print the information
    @Override
    public void printInfo()
    {
        super.printInfo();
        getStartYear(startYear);
    }
    
    // Define the setters
    public void setStartYear(Year CoachStartYear)
    {
        startYear = CoachStartYear;
    }
    public void setStartYear()
    {
        // Define the variables
        String line = null;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat df = new SimpleDateFormat("YYYY");
        
        // Ask for the year and store the answer
        System.out.print("Enter your start year as a coach: ");
        try
        {
            line = reader.readLine();
        }
        catch (IOException ex1)
        {
            System.out.println("Couldn't read.");
        }
        
        // Parse the information to date format
        startYear = Year.parse(line);
    }
    
    // Define the getters
    public Year getStartYear()
    {
        return startYear;
    }
    public void getStartYear(Year CoachStartYear)
    {
        System.out.println("Start Year: " + CoachStartYear);
    }
}
