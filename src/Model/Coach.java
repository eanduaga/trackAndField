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

public class Coach extends Person implements Serializable
{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    // Define the members
    private Date startYear;
    
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
    public void setStartYear(Date CoachStartYear)
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
        try
        {
            startYear = df.parse(line);
        }
        catch (ParseException ex2)
        {
            System.out.println(ANSI_RED + "Incorrect date format. Please, introduce the information again." + ANSI_RESET);
            setStartYear();
        }
    }
    
    // Define the getters
    public Date getStartYear()
    {
        return startYear;
    }
    public void getStartYear(Date CoachStartYear)
    {
        System.out.println("Start Year: " + CoachStartYear);
    }
}
