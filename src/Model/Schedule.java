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

public class Schedule implements Serializable
{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    // Define the members
    private String code;
    private String competition;
    private String discipline;
    private Date sDate;
    
    // Define the constructor
    public Schedule()
    {
        setCode();
        setCompetition();
        setDiscipline();
        setDate();
    }
            
    // Define a method to print the information
    public void printInfo()
    {
        getCode(code);
        getCompetition(competition);
        getDiscipline(discipline);
        getDate(sDate);
    }
    
    // Define the setters
    public void setCode(String ScheduleCode)
    {
        code = ScheduleCode;
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

    public void setCompetition(String ScheduleCompetition)
    {
        competition = ScheduleCompetition;
    }
    public void setCompetition()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            System.out.print("Enter the competition: ");
            competition = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
    }
    
    public void setDiscipline(String ScheduleDiscipline)
    {
        discipline = ScheduleDiscipline;
    }
    public void setDiscipline()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            System.out.print("Enter the discipline: ");
            discipline = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
    }
    
    public void setDate(Date ScheduleDate)
    {
        sDate = ScheduleDate;
    }
    public void setDate()
    {
        // Define the variables
        String line = null;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat df = new SimpleDateFormat("DD/MM");
        
        // Ask for the date and store the answer
        System.out.print("Enter the date (dd/mm): ");
        
        try
        {
            line = reader.readLine();
        }
        catch(IOException ex1)
        {
            System.out.println("Couldn't read.");
        }
        
        // Parse the information to date format
        try
        {
            sDate = df.parse(line);
        }
        catch(ParseException ex2)
        {
            System.out.println(ANSI_RED + "Incorrect date format. Please, enter the information again." + ANSI_RESET);
            setDate();
        }
    }
    
    // Define the getters
    public String getCode()
    {
        return code;
    }
    public void getCode(String ScheduleCode)
    {
        System.out.println("Code: " + ScheduleCode);
    }
    
   public String getCompetition()
   {
       return competition;
   }
   public void getCompetition(String ScheduleCompetition)
   {
       System.out.println("Competition: " + ScheduleCompetition);
   }
   
   public String getDiscipline()
   {
       return discipline;
   }
   public void getDiscipline(String ScheduleDiscipline)
   {
       System.out.println("Discipline: " + ScheduleDiscipline);
   }
   
   public Date getDate()
   {
       return sDate;
   }
   public void getDate(Date ScheduleDate)
   {
       System.out.println("Date: " + ScheduleDate);
   }
}
