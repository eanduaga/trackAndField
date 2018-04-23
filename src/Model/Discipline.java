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
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Discipline implements Serializable
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
    private float[] worldRecord;
    
    // Define the constructor
    public Discipline()
    {
        setCode();
        setName();
        setDescription();
        setWorldRecord();
    }
    public Discipline(boolean bl)
    {
        
    }
    
    // Define a method to print the information
    public void printInfo()
    {
        getCode(code);
        getName(name);
        getDescription(description);
        getWorldRecord(worldRecord);
    }
    
    
    // Define the setters
    public void setCode(String DisciplineCode)
    {
        code = DisciplineCode;
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

    public void setName(String DisciplineName)
    {
        name = DisciplineName;
    }
    public void setName()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the discipline name: ");
        name = in.nextLine();
    }
    
    public void setDescription(String DisciplineDescription)
    {
        description = DisciplineDescription;
    }
    public void setDescription()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the description: ");
        description = in.nextLine();
    }
    
    public void setWorldRecord(float[] DisciplineWorldRecord)
    {
        worldRecord = DisciplineWorldRecord;
    }
    public void setWorldRecord()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the male World Record (WR): ");
        try
        {
            worldRecord[0] = in.nextFloat();
        }
        catch(InputMismatchException ex1)
        {
            System.out.println(ANSI_RED + "Please, enter a float number using the comma." + ANSI_RESET);
            setWorldRecord();
        }
        
        System.out.print("Enter the female World Record (WR): ");
        try
        {
            worldRecord[1] = in.nextFloat();
        }
        catch(InputMismatchException ex1)
        {
            System.out.println(ANSI_RED + "Please, enter a float number using the comma." + ANSI_RESET);
            setWorldRecord();
        }
    }
            
    // Define the getters
    public String getCode()
    {
        return code;
    }
    public void getCode(String DisciplineCode)
    {
        System.out.println("Code: " + DisciplineCode);
    }

    public String getName()
    {
        return name;
    }
    public void getName(String DisciplineName)
    {
        System.out.println("Name: " + DisciplineName);
    }
    
    public String getDescription()
    {
        return description;
    }
    public void getDescription(String DisciplineDescription)
    {
        System.out.println("Description: " + DisciplineDescription);
    }
    
    public float[] getWorldRecord()
    {
        return worldRecord;
    }
    public void getWorldRecord(float[] DisciplineWorldRecord)
    {
        System.out.println("World Record: " + DisciplineWorldRecord);
    }
}
