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
import java.util.Date;

public class Person implements Serializable
{
    // Define the members
    private String ID;
    private String name;
    private String surname;
    private String country;
    private String homeTown;
    private String address;
    private String nationality;
    private Date birthDate;
    private String email;
    private String phoneNum;
    
    // Define the constructor
    public Person(boolean bl)
    {
        
    }
    
    // Define the setters
    public void setID(String PersonID)
    {
        ID = PersonID;
    }
    /*
    public void setID()
    {
        // Define the variables
        int i;
        
        // Ask for the ID
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        ID = in.nextLine();
        
        // Check if the ID is correct
        if(ID.length() == 9)
        {
            for(i = 0; i <= ID.length() - 1; ++i)
            {
                char c = ID.charAt(i);
                if(!Character.isDigit(c))
                {
                    System.out.println("Incorrect format.");
                    setID();
                }
            }
            
            int ln = ID.length();
            char cr = ID.charAt(ln);
            if(!Character.isLetter(cr))
            {
                System.out.println("Incorrect format.");
                setID();
            }
        }
        else
        {
            System.out.println("Please enter an ID with 9 characters.");
            setID();
        }
    }
    */
    public void setName(String PersonName)
    {
        name = PersonName;
    }
    
    public void setSurname(String PersonSurname)
    {
        surname = PersonSurname;
    }
    
    public void setCountry(String PersonCountry)
    {
        country = PersonCountry;
    }
    
    public void setHomeTown(String PersonHomeTown)
    {
        homeTown = PersonHomeTown;
    }
    
    public void setAddress(String PersonAddress)
    {
        address = PersonAddress;
    }
    
    public void setNationality(String PersonNationality)
    {
        nationality = PersonNationality;
    }
    
    public void setBirthDate(Date PersonBirthDate)
    {
        birthDate = PersonBirthDate;
    }
    
    public void setEmail(String PersonEmail)
    {
        email = PersonEmail;
    }
    
    public void setPhoneNum(String PersonPhoneNum)
    {
        phoneNum = PersonPhoneNum;
    }
    
    
    // Define the getters
    public String getID()
    {
        return ID;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getSurname()
    {
        return surname;
    }
    
    public String getCountry()
    {
        return country;
    }
    
    public String getHomeTown()
    {
        return homeTown;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getNationality()
    {
        return nationality;
    }
    
    public Date getBirthDate()
    {
        return birthDate;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPhoneNum()
    {
        return phoneNum;
    }
}
