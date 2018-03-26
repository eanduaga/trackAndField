/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Eider
 */

// Import the libraries
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

public class Registration implements Serializable
{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    // Define the members
    private String code;
    private String athlete;
    private String competition;
    private Date regDate;
    
    // Define the constructor
    public Registration()
    {
        setCode();
        setAthlete();
        setCompetition();
        setRegDate();
    }
    
    // Define a method to print the information
    public void printInfo()
    {
        getCode();
        getAthlete();
        getCompetition();
        getRegDate();
    }
    
    // Define a method to be able to register the athletes
    
    
    // Define the setters
    public void setCode(String RegistrationCode)
    {
        code = RegistrationCode;
    }
    public void setCode()
    {
        // Define the variables
        int i, digit;
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
    
    public void setAthlete(String RegistrationAthlete)
    {
        athlete = RegistrationAthlete;
    }
    public void setAthlete()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            System.out.print("Enter the athlete: ");
            athlete = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
    }
    
    public void setCompetition(String RegistrationCompetition)
    {
        competition = RegistrationCompetition;
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
    
    // Funtziño hau aldatu, erabiltzailiak fetxia sartu biharrian, egun horretako
    // fetxia hartzeko eta bariablian gordeteko.
    public void setRegDate(Date RegistrationDate)
    {
        regDate = RegistrationDate;
    }
    public void setRegDate()
    {
        // Define the variables
        String line;
        
        Scanner in = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("DD/MM/YYYY");
        
        // Ask for the date and store the answer
        System.out.print("Enter the registration date (dd/mm/yyyy): ");
        line = in.nextLine();
        
        // Parse the information to date format
        try
        {
            regDate = df.parse(line);
        }
        catch (ParseException ex)
        {
            System.out.println(ANSI_RED + "Incorrect date format. Please, enter the information again." + ANSI_RESET);
            setRegDate();
        }
    }
    
    // Define the getters
    public String getCode()
    {
        return code;
    }
    public void getCode(String RegistrationCode)
    {
        System.out.println("Code: " + RegistrationCode);
    }
    
    public String getAthlete()
    {
        return athlete;
    }
    public void getAthlete(String RegistrationAthlete)
    {
        System.out.println("Athlete: " + RegistrationAthlete);
    }
    
    public String getCompetition()
    {
        return competition;
    }
    public void getCompetition(String RegistrationCompetition)
    {
        System.out.println("Competition: " + RegistrationCompetition);
    }
    
    public Date getRegDate()
    {
        return regDate;
    }
    public void getRegDate(Date RegistrationDate)
    {
        System.out.println("Date: " + RegistrationDate);
    }
}
