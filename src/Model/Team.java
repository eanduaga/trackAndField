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
import java.util.Random;

public class Team implements Serializable
{
    // Define the members
    private String code;
    private String name;
    private String country;
    private String town;
    
    // Define the constructor
    public Team()
    {
        setCode();
        setName();
        setCountry();
        setTown();
    }
    public Team(boolean bl)
    {
        
    }
    
    // Define a method to print the information
    public void printInfo()
    {
        getCode(code);
        getName(name);
        getCountry(country);
        getTown(town);
    }
    
    // Define the setters
    public void setCode(String TeamCode)
    {
        code = TeamCode;
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
    
    public void setName(String TeamName)
    {
        name = TeamName;
    }
    public void setName()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            System.out.print("Enter the team name: ");
            name = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
    }
    
    public void setCountry(String TeamCountry)
    {
        country = TeamCountry;
    }
    public void setCountry()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            System.out.print("Enter the country: ");
            country = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
    }
    
    public void setTown(String TeamTown)
    {
        town = TeamTown;
    }
    public void setTown()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            System.out.print("Enter the town: ");
            town = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
    }
    
    
    // Define the getters
    public String getCode()
    {
        return code;
    }
    public void getCode(String TeamCode)
    {
        System.out.println("Code: " + TeamCode);
    }

    public String getName()
    {
        return name;
    }
    public void getName(String TeamName)
    {
        System.out.println("Name: " + TeamName);
    }
    
    public String getCountry()
    {
        return country;
    }
    public void getCountry(String TeamCountry)
    {
        System.out.println("Country: " + TeamCountry);
    }
    
    public String getTown()
    {
        return town;
    }
    public void getTown(String TeamTown)
    {
        System.out.println("Town: " + TeamTown);
    }
}
