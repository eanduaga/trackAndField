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
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Person
{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    // Define the members
    private String name;
    private String surname;
    private String code;
    private String country;
    private String phoneNum;
    private String email;
    private Date birthDate;
    private String nationality;
    private String address;
    private String homeTown;
    
    // Define the constructor
    public Person()
    {
        setName();
        setSurname();
        setCode();
        setCountry();
        setPhoneNum();
        setEmail();
        setBirthDate();
        setNationality();
        setAddress();
        setHomeTown();
    }
    public Person(boolean bl)
    {
        
    }
    
    // Define a method to print the information
    public void printInfo()
    {
        getName(name);
        getSurname(surname);
        getCode(code);
        getCountry(country);
        getPhoneNum(phoneNum);
        getEmail(email);
        getBirthDate(birthDate);
        getNationality(nationality);
        getAddress(address);
        getHomeTown(homeTown);
    }
    
    // Define the setters
    public void setName(String PersonName)
    {
        name = PersonName;
    }
    public void setName()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = in.nextLine();
    }
    
    public void setSurname(String PersonSurname)
    {
        surname = PersonSurname;
    }
    public void setSurname()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your surname: ");
        surname = in.nextLine();
    }
    
    public void setCode(String PersonCode)
    {
        code = PersonCode;
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
    
    public void setCountry(String PersonCountry)
    {
        country = PersonCountry;
    }
    public void setCountry()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your country: ");
        country = in.nextLine();
    }
    
    public void setPhoneNum(String PersonPhoneNum)
    {
        phoneNum = PersonPhoneNum;
    }
    public void setPhoneNum()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        phoneNum = in.nextLine();
    }
    
    public void setEmail(String PersonEmail)
    {
        email = PersonEmail;
    }
    public void setEmail()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your email: ");
        email = in.nextLine();
    }
    
    public void setBirthDate(Date PersonBirthDate)
    {
        birthDate = PersonBirthDate;
    }
    public void setBirthDate()
    {
        // Define the variables
        String line;
        
        Scanner in = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("DD/MM/YYYY");
        
        // Ask for the date and store the answer
        System.out.print("Enter your birth date (dd/mm/yyyy): ");
        line = in.nextLine();
        
        // Parse the information to date format
        try
        {
            birthDate = df.parse(line);
        }
        catch (ParseException ex)
        {
            System.out.println(ANSI_RED + "Incorrect date format. Please, enter the information again." + ANSI_RESET);
            setBirthDate();
        }
    }
    
    public void setNationality(String PersonNationality)
    {
        nationality = PersonNationality;
    }
    public void setNationality()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your nationality: ");
        nationality = in.nextLine();
    }
    
    public void setAddress(String PersonAddress)
    {
        address = PersonAddress;
    }
    public void setAddress()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your address: ");
        address = in.nextLine();
    }
    
    public void setHomeTown(String PersonHomeTown)
    {
        homeTown = PersonHomeTown;
    }
    public void setHomeTown()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your home town: ");
        homeTown = in.nextLine();
    }
    
    
    // Define the getters
    public String getName()
    {
        return name;
    }
    public void getName(String PersonName)
    {
        System.out.println("Name: " + PersonName);
    }
    
    public String getSurname()
    {
        return surname;
    }
    public void getSurname(String PersonSurname)
    {
        System.out.println("Surname: " + PersonSurname);
    }
    
    public String getCode()
    {
        return code;
    }
    public void getCode(String PersonCode)
    {
        System.out.println("Code: " + PersonCode);
    }
    
    public String getCountry()
    {
        return country;
    }
    public void getCountry(String PersonCountry)
    {
        System.out.println("Country: " + PersonCountry);
    }
    
    public String getPhoneNum()
    {
        return phoneNum;
    }
    public void getPhoneNum(String PersonPhoneNum)
    {
        System.out.println("Phone number: " + PersonPhoneNum);
    }
    
    public String getEmail()
    {
        return email;
    }
    public void getEmail(String PersonEmail)
    {
        System.out.println("Email: " + PersonEmail);
    }
    
    public Date getBirthDate()
    {
        return birthDate;
    }
    public void getBirthDate(Date PersonBirthDate)
    {
        System.out.println("Birth Date: " + PersonBirthDate);
    }
    
    public String getNationality()
    {
        return nationality;
    }
    public void getNationality(String PersonNationality)
    {
        System.out.println("Nationality: " + PersonNationality);
    }
    
    public String getAddress()
    {
        return address;
    }
    public void getAddress(String PersonAddress)
    {
        System.out.println("Address: " + PersonAddress);
    }
    
    public String getHomeTown()
    {
        return homeTown;
    }
    public void getHomeTown(String PersonHomeTown)
    {
        System.out.println("Home town: " + PersonHomeTown);
    }
}
