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

public class Result implements Serializable
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
    private String gender;
    private String athlete;
    private String round;
    private float time;
    private int position;
    private Date rDate;
    
    // Define the constructor
    public Result()
    {
        setCode();
        setCompetition();
        setDiscipline();
        setGender();
        setAthlete();
        setRound();
        setTime();
        setPosition();
        setDate();
    }
    public Result(int a)
    {
        
    }
            
    // Define a method to print the information
    public void printInfo()
    {
        getCode(code);
        getCompetition(competition);
        getDiscipline(discipline);
        getGender(gender);
        getAthlete(athlete);
        getRound(round);
        getTime(time);
        getPosition(position);
        getDate(rDate);
    }
    
    // Define the setters
    public void setCode(String ResultCode)
    {
        code = ResultCode;
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

    public void setCompetition(String ResultCompetition)
    {
        competition = ResultCompetition;
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
	
    public void setDiscipline(String ResultDiscipline)
    {
        discipline = ResultDiscipline;
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
	
    public void setGender(String ResultGender)
    {
        gender = ResultGender;
    }
    public void setGender()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            System.out.print("Enter the gender: ");
            gender = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
    }

    public void setAthlete(String ResultAthlete)
    {
        athlete = ResultAthlete;
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

    public void setRound(String ResultRound)
    {
        round = ResultRound;
    }
    public void setRound()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            System.out.print("Enter the round: ");
            round = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
    }

    public void setTime(float ResultTime)
    {
        time = ResultTime;
    }
    public void setTime()
    {
        String line = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the time: ");
        
        try
        {
            line = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
        
        try
        {
            time = Float.parseFloat(line);
        }
        catch(NumberFormatException ex1)
        {
            System.out.println(ANSI_RED + "Please, enter a float number using the dot." + ANSI_RESET);
            setTime();
        }
    }

    public void setPosition(int ResultPosition)
    {
        position = ResultPosition;
    }
    public void setPosition()
    {
        String line = null;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the position: ");
        
        try
        {
            line = reader.readLine();
        }
        catch(IOException er1)
        {
            System.out.println("Couldn't read.");
        }
        
        try
        {
            position = Integer.parseInt(line);
        }
        catch(NumberFormatException ex1)
        {
            System.out.println(ANSI_RED + "Please, enter an integer number." + ANSI_RESET);
            setPosition();
        }
    }

    public void setDate(Date ResultDate)
    {
        rDate = ResultDate;
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
            rDate = df.parse(line);
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
    public void getCode(String ResultCode)
    {
        System.out.println("Code: " + ResultCode);
    }
    
    public String getCompetition()
    {
        return competition;
    }
    public void getCompetition(String ResultCompetition)
    {
        System.out.println("Competition: " + ResultCompetition);
    }

    public String getDiscipline()
    {
        return discipline;
    }
    public void getDiscipline(String ResultDiscipline)
    {
        System.out.println("Discipline: " + ResultDiscipline);
    }

    public String getGender()
    {
        return gender;
    }
    public void getGender(String ResultGender)
    {
        System.out.println("Gender: " + ResultGender);
    }

    public String getAthlete()
    {
        return athlete;
    }
    public void getAthlete(String ResultAthlete)
    {
        System.out.println("Athlete: " + ResultAthlete);
    }

    public String getRound()
    {
        return round;
    }
    public void getRound(String ResultRound)
    {
        System.out.println("Round: " + ResultRound);
    }

    public float getTime()
    {
        return time;
    }
    public void getTime(float ResultTime)
    {
        System.out.println("Time: " + ResultTime);
    }

    public int getPosition()
    {
        return position;
    }
    public void getPosition(int ResultPosition)
    {
        System.out.println("Position: " + ResultPosition);
    }

    public Date getDate()
    {
        return rDate;
    }
    public void getDate(Date ResultDate)
    {
        System.out.println("Date: " + ResultDate);
    }   
}
