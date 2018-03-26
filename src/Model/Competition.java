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
import java.util.Random;

public class Competition implements Serializable
{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    // Define the members
    private String code;
    private String name;
    private String description;
    private String location;
    private String startDate;
    private String endDate;
    
    // Define the constructor
    public Competition()
    {
        setCode();
        setName();
        setDescription();
        setLocation();
        setStartDate();
        setEndDate();
    }
    public Competition(boolean bl)
    {
        
    }
    
    // Define a method to print the information
    public void printInfo()
    {
        getCode(code);
        getName(name);
        getDescription(description);
        getLocation(location);
        getStartDate(startDate);
        getEndDate(endDate);
    }
    
    // Define the setters
    public void setCode(String CompetitionCode)
    {
        code = CompetitionCode;
    }
    public void setCode()
    {
        // Define the variables
        int i, digit;
        boolean result;
        char letter;
        
        Random rnd = new Random();
        StringBuffer randomID = new StringBuffer();
        
        // Generate the random ID
        // First get the letters
        for(i = 0; i <= 1; ++i)
        {
            letter = (char) (rnd.nextInt(26) + 'A');
            randomID.append(letter);
        }
        
        // Then get the digits
        for(i = 2; i <= 3; ++i)
        {
            digit = rnd.nextInt(9) + 0;
            randomID.append(digit);
        }
        
        // Store the generated code in the member ID
        code = randomID.toString();
    }
    
    public void setName(String CompetitionName)
    {
        name = CompetitionName;
    }
    public void setName()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            System.out.print("Enter the competition name: ");
            name = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
    }
    
    public void setDescription(String CompetitionDescription)
    {
        description = CompetitionDescription;
    }
    public void setDescription()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            System.out.print("Enter the description: ");
            description = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
    }
    
    public void setLocation(String CompetitionLocation)
    {
        location = CompetitionLocation;
    }
    public void setLocation()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            System.out.print("Enter the location: ");
            location = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
    }
    
    public void setStartDate(String CompetitionStartDate)
    {
        startDate = CompetitionStartDate;
    }
    public void setStartDate()
    {
        // Define the variables
        String line = null;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        SimpleDateFormat df = new SimpleDateFormat("DD/MM/YYYY");
        
        // Ask for the date and store the answer
        System.out.print("Enter the start date (dd/mm/yyyy): ");
        try
        {
            startDate = reader.readLine();
            //line = reader.readLine();
        }
        catch (IOException ex1)
        {
            System.out.println("Couldn't read.");
        }
        
        /*
        // Parse the information to date format
        try
        {
            startDate = df.parse(line);
        }
        catch (ParseException ex2)
        {
            System.out.println(ANSI_RED + "Incorrect date format. Please, enter the information again." + ANSI_RESET);
            setStartDate();
        }
*/
    }
    
    public void setEndDate(String CompetitionEndDate)
    {
        endDate = CompetitionEndDate;
    }
    public void setEndDate()
    {
        // Define the variables
        String line = null;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        SimpleDateFormat df = new SimpleDateFormat("DD/MM/YYYY");
        
        // Ask for the date and store the answer
        System.out.print("Enter the end date (dd/mm/yyyy): ");
        
        try
        {
            endDate = reader.readLine();
            //line = reader.readLine();
        }
        catch(IOException ex1)
        {
            System.out.println("Couldn't read.");
        }
        
        /*
        try
        {
            endDate = df.parse(line);
        }
        catch(ParseException ex2)
        {
            System.out.println(ANSI_RED + "Incorrect date format. Please, enter the information again." + ANSI_RESET);
            setEndDate();
        }
*/
    }
    
    // Define the getters
    public String getCode()
    {
        return code;
    }
    public void getCode(String CompetitionCode)
    {
        System.out.println("Code: " + CompetitionCode);
    }

    public String getName()
    {
        return name;
    }
    public void getName(String CompetitionName)
    {
        System.out.println("Name: " + CompetitionName);
    }
    
    public String getDescription()
    {
        return description;
    }
    public void getDescription(String CompetitionDescription)
    {
        System.out.println("Description: " + CompetitionDescription);
    }
    
    public String getLocation()
    {
        return location;
    }
    public void getLocation(String CompetitionLocation)
    {
        System.out.println("Location: " + CompetitionLocation);
    }
    
    public String getStartDate()
    {
        return startDate;
    }
    public void getStartDate(String CompetitionStartDate)
    {
        System.out.println("Start date: " + CompetitionStartDate);
    }
    
    public String getEndDate()
    {
        return endDate;
    }
    public void getEndDate(String CompetitionEndDate)
    {
        System.out.println("End date: " + CompetitionEndDate);
    }
}
