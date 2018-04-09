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
import java.util.Scanner;
import java.io.Serializable;
import java.util.InputMismatchException;

public class Athlete extends Person implements Serializable
{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    // Define the members
    private String favouriteDiscipline;
    private float personalBest;
    private float seasonBest;
    private int numMedals;
    private String team;
    
    // Define the constructor
    public Athlete()
    {
        super();
        setFavouriteDiscipline();
        setPersonalBest();
        setSeasonBest();
        setNumMedals();
        setTeam();
    }
    public Athlete(boolean bl)
    {
        super(false);
    }
        
    // Define a method to print the information
    @Override
    public void printInfo()
    {
        super.printInfo();
        getFavouriteDiscipline(favouriteDiscipline);
        getPersonalBest(personalBest);
        getSeasonBest(seasonBest);
        getNumMedals(numMedals);
        getTeam(team);
    }
    
    // Define the setters
    public void setFavouriteDiscipline(String AthleteFavDiscipline)
    {
        favouriteDiscipline = AthleteFavDiscipline;
    }
    public void setFavouriteDiscipline()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your favourite discipline: ");
        favouriteDiscipline = in.nextLine();
    }
    
    public void setPersonalBest(float AthletePersonalBest)
    {
        personalBest = AthletePersonalBest;
    }
    public void setPersonalBest()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your personal best: ");
        
        try
        {
            personalBest = in.nextFloat();
        }
        catch(InputMismatchException ex1)
        {
            System.out.println(ANSI_RED + "Please, enter a float number using the comma." + ANSI_RESET);
            setPersonalBest();
        }
    }
    
    public void setSeasonBest(float AthleteSeasonBest)
    {
        seasonBest = AthleteSeasonBest;
    }
    public void setSeasonBest()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your season best: ");
        
        try
        {
            seasonBest = in.nextFloat();
        }
        catch(InputMismatchException ex1)
        {
            System.out.println(ANSI_RED + "Please, enter a float number using the comma." + ANSI_RESET);
            setSeasonBest();
        }
    }
    
    public void setNumMedals(int AthleteNumMedals)
    {
        numMedals = AthleteNumMedals;
    }
    public void setNumMedals()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number of medals: ");
        
        try
        {
            numMedals = in.nextInt();
        }
        catch(InputMismatchException ex1)
        {
            System.out.println(ANSI_RED + "Please, enter an integer number." + ANSI_RESET);
            setNumMedals();
        }
    }

    public void setTeam(String AthleteTeam)
    {
        team = AthleteTeam;
    }
    public void setTeam()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your team: ");
        team = in.nextLine();
    }
    
    // Define the getters
    public String getFavouriteDiscipline()
    {
        return favouriteDiscipline;
    }
    public void getFavouriteDiscipline(String AthleteFavDiscipline)
    {
        System.out.println("Favourite Discipline: " + AthleteFavDiscipline);
    }
    
    public float getPersonalBest()
    {
        return personalBest;
    }
    public void getPersonalBest(float AthletePersonalBest)
    {
        System.out.println("Personal Best (PB): " + AthletePersonalBest);
    }
    
    public float getSeasonBest()
    {
        return seasonBest;
    }
    public void getSeasonBest(float AthleteSeasonBest)
    {
        System.out.println("Season Best (SB): " + AthleteSeasonBest);
    }
    
    public int getNumMedals()
    {
        return numMedals;
    }
    public void getNumMedals(int AthleteNumMedals)
    {
        System.out.println("Number of medals: " + AthleteNumMedals);
    }
    
    public String getTeam()
    {
        return team;
    }
    public void getTeam(String AthleteTeam)
    {
        System.out.println("Team: " + AthleteTeam);
    }    
}
