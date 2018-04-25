/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Eider
 */
public class AthleteDataAccess
{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public static void writeAthlete(Athlete ath) throws IOException
    {
        // Define the variables
        File athFl = new File("files/athlete.ser");
        
        try
        {
            // If the file doesn't exist, create a new ObjectOutputStream to write the header
            if(!athFl.exists())
            {
                FileOutputStream fs1 = new FileOutputStream(athFl);
                ObjectOutputStream os1 = new ObjectOutputStream(fs1);
                os1.close();
            }
            
            // Create another ObjectOutputStream without the header to be able to write objects without overwriting
            FileOutputStream fs = new FileOutputStream(athFl, true);
            ObjectOutputStream os = new ObjectOutputStream(fs)
            {
                @Override
                protected void writeStreamHeader() throws IOException
                {
                    reset();
                }
            };

            // Create a new object and write it in the file
            os.writeObject(ath);
            os.close();
            fs.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
    }
    
    public static ArrayList <Athlete> writeAthleteArrayList() throws IOException
    {
        // Define the variables
        File athFl = new File("files/athlete.ser");
        ArrayList <Athlete> alAth = new ArrayList();
        
        try
        {
            FileInputStream fs = new FileInputStream(athFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            try
            {
                while(true)
                {
                    Athlete ath = new Athlete(false);
                    ath = (Athlete) os.readObject();
                    alAth.add(ath);                    
                }
            }
            catch(EOFException ex1)
            {
                fs.close();
                os.close();
            }
        }
        catch(IOException | ClassNotFoundException ex1)
        {
            
        }
        
        return alAth;
    }
    
    public static ArrayList <Athlete> searchAthleteArrayList(String search) throws IOException
    {
        // Define the variables
        File athFl = new File("files/athlete.ser");
        ArrayList <Athlete> alAthSearch = new ArrayList();
        
        try
        {
            FileInputStream fs = new FileInputStream(athFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            try
            {
                while(true)
                {
                    Athlete ath = new Athlete(false);
                    ath = (Athlete) os.readObject();
                    
                    if(ath.getName().contains(search))
                    {
                        alAthSearch.add(ath); 
                    }                
                }
            }
            catch(EOFException ex1)
            {
                fs.close();
                os.close();
            }
        }
        catch(IOException | ClassNotFoundException ex1)
        {
            
        }
        
        return alAthSearch;
    }
    
    public static void readAll() throws IOException
    {
        // Define the variables
        File athFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/athlete.ser");
        
        try
        {
            FileInputStream fs = new FileInputStream(athFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            try
            {
                while(true)
                {
                    Athlete ath = (Athlete) os.readObject();
                    ath.printInfo();
                    System.out.println();
                }
            }
            catch(EOFException ex1)
            {
                fs.close();
                os.close();
                
                System.out.println();
                System.out.println("Press Enter key to continue...");
                try
                {
                    System.in.read();
                }
                catch(IOException ex2)
                {
                    System.out.println("Couldn't read.");
                }
                System.out.println();
                System.out.println();
            }
        }
        catch(IOException ex1)
        {
            System.out.println("Couldn't read.");
        }
        catch(ClassNotFoundException cnf)
        {
            System.out.println("Class not found.");
        }
    }
    
    public static void readOne() throws IOException
    {
        // Define the variables
        String name, uName = null, code, uCode;
        boolean result = false;
        File disFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/athlete.ser");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            // Ask for the name
            System.out.print("Enter the name of the athlete: ");
            try
            {
                uName = reader.readLine().toLowerCase();
            }
            catch(IOException ex1)
            {
                System.out.println("Couldn't read.");
            }
            
            FileInputStream fs = new FileInputStream(disFl);
            ObjectInputStream os = new ObjectInputStream(fs);

            try
            {
                while(true)
                {
                    Athlete ath = (Athlete) os.readObject();
                    name = ath.getName().toLowerCase();
                    
                    if(name.equals(uName))
                    {
                        System.out.println(ath.getID() + " - " + ath.getName() + " " + ath.getSurname());
                        result = true;
                    }
                }
            }
            catch(EOFException eof)
            {
                fs.close();
                os.close();
            }
            
            if(result == false)
            {
                System.out.println(ANSI_RED + "There is no athlete with that name." + ANSI_RESET);
            }
            else
            {
                System.out.println();
                uCode = InputMethods.readString("Choose the athlete (enter the code): ").toLowerCase();

                FileInputStream fs2 = new FileInputStream(disFl);
                ObjectInputStream os2 = new ObjectInputStream(fs2);
                    
                try
                {
                    while(true)
                    {
                        Athlete ath = (Athlete) os2.readObject();
                        code = ath.getID().toLowerCase();

                        if(code.equals(uCode))
                        {
                            System.out.println();
                            System.out.println("This is the information of the athlete: ");
                            System.out.println();
                            ath.printInfo();
                        }
                    }
                }
                catch(EOFException eof2)
                {
                    fs2.close();
                    os2.close();
                    
                    System.out.println();
                    System.out.println("Press Enter key to continue...");
                    try
                    {
                        System.in.read();
                    }
                    catch(IOException ex2)
                    {
                        System.out.println("Couldn't read.");
                    }
                    System.out.println();
                    System.out.println();
                }
            }
        }
        catch(ClassNotFoundException ex1)
        {
            System.out.println("Class not found.");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
    }
    
    public static void searchAthlete() throws IOException
    {
        // Define the variables
        String uName = null, name;
        boolean result = false;
        File disFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/athlete.ser");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            // Ask for the name
            System.out.print("Enter the name of the athlete: ");
            try
            {
                uName = reader.readLine().toLowerCase();
            }
            catch(IOException ex1)
            {
                System.out.println("Couldn't read.");
            }
        
            // Define a new ObjectInputStream
            FileInputStream fs = new FileInputStream(disFl);
            ObjectInputStream os = new ObjectInputStream(fs);

            try
            {
//                System.out.println();
//                System.out.println("This are the athletes with the name " + Character.toUpperCase(uName.charAt(0)) + uName.substring(1) + ":");
                System.out.println();
                
                while(true)
                {
                    Athlete ath = (Athlete) os.readObject();
                    name = ath.getName().toLowerCase();
                    
                    // Check if there is a discipline with the name the user has entered and show the result
                    if(name.contains(uName))
                    {
                        System.out.println(ath.getID() + " - " + ath.getName() + " " + ath.getSurname());
                        result = true;
                    }
                }
            }
            catch(EOFException eof)
            {
                fs.close();
                os.close();
            }
            
            if(result == false)
            {
                System.out.println();
                System.out.println(ANSI_RED + "There is no athlete with that name." + ANSI_RESET);
                
                System.out.println();
                System.out.println("Press Enter key to continue...");
                try
                {
                    System.in.read();
                }
                catch(IOException ex2)
                {
                    System.out.println("Couldn't read.");
                }
                System.out.println();
                System.out.println();
            }
            else
            {
                System.out.println();
                System.out.println("Press Enter key to continue...");
                try
                {
                    System.in.read();
                }
                catch(IOException ex2)
                {
                    System.out.println("Couldn't read.");
                }
                System.out.println();
                System.out.println();
            }
        }
        catch(ClassNotFoundException ex1)
        {
            System.out.println("Class not found.");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
    }
    
    public static void deleteAthlete() throws IOException
    {
        // Define the variables
        String code, uCode = null;
        boolean result = false;
        File athFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/athlete.ser");
        File tempFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/athleteCopy.ser");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            // Define a new ObjectInputStream and a new ObjectOutputStream
            FileInputStream fs = new FileInputStream(athFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            // Create another ObjectOutputStream without the header to be able to write objects without overwriting
            FileOutputStream fos = new FileOutputStream(tempFl, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        
            // Ask for the name
            System.out.print("Enter the code of the athlete you want to delete: ");
            try
            {
                uCode = reader.readLine().toLowerCase();
            }
            catch(IOException ex1)
            {
                System.out.println("Couldn't read.");
            }
                
            try
            {
                while(true)
                {
                    Athlete ath = (Athlete) os.readObject();
                    code = ath.getID().toLowerCase();

                    // Check if there is a discipline with the name the user has entered and show the result
                    if(!code.equals(uCode))
                    {
                        oos.writeObject(ath);
                    }
                    else
                        result = true;
                }
            }
            catch(EOFException eof)
            {
                fs.close();
                os.close();
                fos.close();
                oos.close();
                athFl.delete();
                tempFl.renameTo(athFl);
            }
            
            if(result == false)
            {
                System.out.println();
                System.out.println(ANSI_RED + "There is no athlete with that code." + ANSI_RESET);

                System.out.println();
                System.out.println("Press Enter key to continue...");
                try
                {
                    System.in.read();
                }
                catch(IOException ex2)
                {
                    System.out.println("Couldn't read.");
                }
                System.out.println();
                System.out.println();
            }
            else
            {
                System.out.println();
                System.out.println(ANSI_GREEN + "The athlete has been removed." + ANSI_RESET);
                
                System.out.println();
                System.out.println("Press Enter key to continue...");
                try
                {
                    System.in.read();
                }
                catch(IOException ex2)
                {
                    System.out.println("Couldn't read.");
                }
                System.out.println();
                System.out.println();
            }
        }
        catch(ClassNotFoundException ex1)
        {
            System.out.println("Class not found.");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
    }
    
    public static void changeDiscipline() throws IOException
    {
        // Define the variables
        String code, uCode = null, line = null;
        int number = 0;
        boolean back, repeat, result = false;
        File athFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/athlete.ser");
        File tempFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/athleteCopy.ser");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            // Define a new ObjectInputStream and a new ObjectOutputStream
            FileInputStream fs = new FileInputStream(athFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            // Create another ObjectOutputStream without the header to be able to write objects without overwriting
            FileOutputStream fos = new FileOutputStream(tempFl, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        
            try
            {
                // Ask for the code
                System.out.print("Enter the code of the athlete you want to change: ");
                try
                {
                    uCode = reader.readLine().toLowerCase();
                }
                catch(IOException ex1)
                {
                    System.out.println("Couldn't read.");
                }
            
                while(true)
                {
                    Athlete ath = (Athlete) os.readObject();
                    code = ath.getID().toLowerCase();
                    
                    // Check if there is a discipline with the name the user has entered and show the result
                    if(code.equals(uCode))
                    {
                        result = true;
                        
                        do
                        {
                            back = false;

                            System.out.println();
                            System.out.println("Choose the information you want to change for the athlete " + ath.getName() + " " + ath.getSurname() + ".");

                            // Show the menu and ask for the number
                            System.out.println();
                            System.out.println("ATRIBUTES");
                            System.out.println("*********");
                            System.out.println("1. Name");
                            System.out.println("2. Surname");
                            System.out.println("3. Phone number");
                            System.out.println("4. Email");
                            System.out.println("5. Nationality");
                            System.out.println("6. Address");
                            System.out.println("7. Personal best");
                            System.out.println("8. Season best");
                            System.out.println("9. Number of medals");
                            System.out.println("10. Back");
                            System.out.println();
                            
                            do
                            {
                                repeat = false;

                                System.out.print("Choose an option: ");
                                try
                                {
                                    line = reader.readLine();
                                }
                                catch(IOException ex1)
                                {
                                    System.out.println(ANSI_RED + "Couldn't read." + ANSI_RESET);
                                }

                                try
                                {
                                    number = Integer.parseInt(line);
                                }
                                catch(NumberFormatException ex2)
                                {
                                    System.out.println(ANSI_RED + "Please, enter a valid number." + ANSI_RESET);
                                    repeat = true;
                                } 
                            }
                            while((number < 1 || number > 10) || repeat == true);
                            
                            switch(number)
                            {
                                case 1:
                                    System.out.println();
                                    ath.setName();
                                    System.out.println();
                                    System.out.println(ANSI_BLUE + "The information has been updated." + ANSI_RESET);

                                    System.out.println();
                                    System.out.println("Press Enter key to continue...");
                                    try
                                    {
                                        System.in.read();
                                    }
                                    catch(IOException ex1)
                                    {
                                        System.out.println("Couldn't read.");
                                    }
                                    System.out.println();
                                    System.out.println();
                                    break;
                                case 2:
                                    System.out.println();
                                    ath.setSurname();
                                    System.out.println();
                                    System.out.println(ANSI_BLUE + "The information has been updated." + ANSI_RESET);

                                    System.out.println();
                                    System.out.println("Press Enter key to continue...");
                                    try
                                    {
                                        System.in.read();
                                    }
                                    catch(IOException ex1)
                                    {
                                        System.out.println("Couldn't read.");
                                    }
                                    System.out.println();
                                    System.out.println();
                                    break;
                                case 3:
                                    System.out.println();
                                    ath.setPhoneNum();
                                    System.out.println();
                                    System.out.println(ANSI_BLUE + "The information has been updated." + ANSI_RESET);

                                    System.out.println();
                                    System.out.println("Press Enter key to continue...");
                                    try
                                    {
                                        System.in.read();
                                    }
                                    catch(IOException ex1)
                                    {
                                        System.out.println("Couldn't read.");
                                    }
                                    System.out.println();
                                    System.out.println();
                                    break;
                                case 4:
                                    System.out.println();
                                    ath.setEmail();
                                    System.out.println();
                                    System.out.println(ANSI_BLUE + "The information has been updated." + ANSI_RESET);

                                    System.out.println();
                                    System.out.println("Press Enter key to continue...");
                                    try
                                    {
                                        System.in.read();
                                    }
                                    catch(IOException ex1)
                                    {
                                        System.out.println("Couldn't read.");
                                    }
                                    System.out.println();
                                    System.out.println();
                                    break;
                                case 5:
                                    System.out.println();
                                    ath.setNationality();
                                    System.out.println();

                                    System.out.println();
                                    System.out.println("Press Enter key to continue...");
                                    try
                                    {
                                        System.in.read();
                                    }
                                    catch(IOException ex1)
                                    {
                                        System.out.println("Couldn't read.");
                                    }
                                    System.out.println();
                                    System.out.println();
                                    break;
                                case 6:
                                    System.out.println();
                                    ath.setAddress();
                                    System.out.println();
                                    System.out.println(ANSI_BLUE + "The information has been updated." + ANSI_RESET);

                                    System.out.println();
                                    System.out.println("Press Enter key to continue...");
                                    try
                                    {
                                        System.in.read();
                                    }
                                    catch(IOException ex1)
                                    {
                                        System.out.println("Couldn't read.");
                                    }
                                    System.out.println();
                                    System.out.println();
                                    break;
                                case 7:
                                    System.out.println();
                                    ath.setPersonalBest();
                                    System.out.println();
                                    System.out.println(ANSI_BLUE + "The information has been updated." + ANSI_RESET);

                                    System.out.println();
                                    System.out.println("Press Enter key to continue...");
                                    try
                                    {
                                        System.in.read();
                                    }
                                    catch(IOException ex1)
                                    {
                                        System.out.println("Couldn't read.");
                                    }
                                    System.out.println();
                                    System.out.println();
                                    break;
                                case 8:
                                    System.out.println();
                                    ath.setSeasonBest();
                                    System.out.println();
                                    System.out.println(ANSI_BLUE + "The information has been updated." + ANSI_RESET);

                                    System.out.println();
                                    System.out.println("Press Enter key to continue...");
                                    try
                                    {
                                        System.in.read();
                                    }
                                    catch(IOException ex1)
                                    {
                                        System.out.println("Couldn't read.");
                                    }
                                    System.out.println();
                                    System.out.println();
                                    break;
                                case 9:
                                    System.out.println();
                                    ath.setNumMedals();
                                    System.out.println();
                                    System.out.println(ANSI_BLUE + "The information has been updated." + ANSI_RESET);

                                    System.out.println();
                                    System.out.println("Press Enter key to continue...");
                                    try
                                    {
                                        System.in.read();
                                    }
                                    catch(IOException ex1)
                                    {
                                        System.out.println("Couldn't read.");
                                    }
                                    System.out.println();
                                    System.out.println();
                                    break;
                                case 10:
                                    number = 1;
                                    oos.writeObject(ath);
                                    back = true;
                                    break;
                            }
                        }
                        while(back == false);  
                    }
                    else
                    {
                        oos.writeObject(ath);
                    }
                }
            }
            catch(EOFException eof)
            {
                fs.close();
                os.close();
                fos.close();
                oos.close();
                athFl.delete();
                tempFl.renameTo(athFl);
            }
            
            if(result == false)
            {
                System.out.println();
                System.out.println(ANSI_RED + "There is no athlete with that code." + ANSI_RESET);
                
                System.out.println();
                System.out.println("Press Enter key to continue...");
                try
                {
                    System.in.read();
                }
                catch(IOException ex1)
                {
                    System.out.println("Couldn't read.");
                }
                System.out.println();
                System.out.println();
            }
        }
        catch(ClassNotFoundException ex1)
        {
            System.out.println("Class not found.");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
    }
}
