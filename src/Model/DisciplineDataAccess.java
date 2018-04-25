/*
 * To change this license header, choose License Headers in Project Properties.
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
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DisciplineDataAccess
{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public static void writeDiscipline(Discipline dis) throws IOException
    {
        // Define the variables
        File disFl = new File("files/discipline.ser");
        
        try
        {
            // If the file doesn't exist, create a new ObjectOutputStream to write the header
            if(!disFl.exists())
            {
                FileOutputStream fs1 = new FileOutputStream(disFl);
                ObjectOutputStream os1 = new ObjectOutputStream(fs1);
                os1.close();
            }

            // Create another ObjectOutputStream without the header to be able to write objects without overwriting
            FileOutputStream fs = new FileOutputStream(disFl, true);
            ObjectOutputStream os = new ObjectOutputStream(fs)
            {
                @Override
                protected void writeStreamHeader() throws IOException
                {
                    reset();
                }
            };
            
            // Write the object and close the file
            os.writeObject(dis);
            os.close();
            fs.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
    }
    
    public static ArrayList <Discipline> writeDisciplineArrayList() throws IOException
    {
        // Define the variables
        File disFl = new File("files/discipline.ser");
        ArrayList <Discipline> alDis = new ArrayList();
        
        try
        {
            FileInputStream fs = new FileInputStream(disFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            try
            {
                while(true)
                {
                    Discipline dis = new Discipline(false);
                    dis = (Discipline) os.readObject();
                    alDis.add(dis);                    
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
        
        return alDis;
    }
    
    public static ArrayList <Discipline> searchDisciplineArrayList(String search) throws IOException
    {
        // Define the variables
        File disFl = new File("files/discipline.ser");
        ArrayList <Discipline> alDisSearch = new ArrayList();
        
        try
        {
            FileInputStream fs = new FileInputStream(disFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            try
            {
                while(true)
                {
                    Discipline dis = new Discipline(false);
                    dis = (Discipline) os.readObject();
                    
                    if(dis.getName().contains(search))
                    {
                        alDisSearch.add(dis); 
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
        
        return alDisSearch;
    }
    
    public static void readAll() throws IOException
    {
        // Define the variables
        File disFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/discipline.ser");
        
        try
        {
            FileInputStream fs = new FileInputStream(disFl);
            ObjectInputStream os = new ObjectInputStream(fs);

            try
            {
                while(true)
                {
                    Discipline dis = (Discipline) os.readObject();
                    dis.printInfo();
                    System.out.println();
                }
            }
            catch(EOFException eof)
            {
                fs.close();
                os.close();
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
    
    public static void readOne() throws IOException
    {
        // Define the variables
        String name, uName = null, code, uCode;
        boolean result = false;
        File disFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/discipline.ser");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            // Ask for the name
            System.out.print("Enter the name of the discipline: ");
            try
            {
                uName = reader.readLine().toLowerCase();
            }
            catch(IOException ex1)
            {
                System.out.println("Couldn't read.");
            }
            System.out.println();
            
            FileInputStream fs = new FileInputStream(disFl);
            ObjectInputStream os = new ObjectInputStream(fs);

            try
            {
                while(true)
                {
                    Discipline dis = (Discipline) os.readObject();
                    name = dis.getName().toLowerCase();
                    
                    if(name.equals(uName))
                    {
                        System.out.println(dis.getCode() + " - " + dis.getName() + ", " + dis.getDescription());
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
                System.out.println(ANSI_RED + "There is no discipline with that name." + ANSI_RESET);
            }
            else
            {
                System.out.println();
                uCode = InputMethods.readString("Choose the discipline (enter the code): ").toLowerCase();

                FileInputStream fs2 = new FileInputStream(disFl);
                ObjectInputStream os2 = new ObjectInputStream(fs2);
                    
                try
                {
                    while(true)
                    {
                        Discipline dis = (Discipline) os2.readObject();
                        code = dis.getCode().toLowerCase();

                        if(code.equals(uCode))
                        {
                            System.out.println();
                            System.out.println("This is the information of the discipline: ");
                            System.out.println();
                            dis.printInfo();
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
    
    public static void searchDiscipline() throws IOException
    {
        // Define the variables
        String uName = null, name;
        boolean result = false;
        File disFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/discipline.ser");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            // Ask for the name
            System.out.print("Enter the name of the discipline: ");
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
                while(true)
                {
                    Discipline dis = (Discipline) os.readObject();
                    name = dis.getName().toLowerCase();
                    
                    // Check if there is a discipline with the name the user has entered and show the result
                    if(name.contains(uName))
                    {
                        System.out.println();
                        System.out.println(dis.getCode() + " - " + dis.getName() + ", " + dis.getDescription());
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
                System.out.println(ANSI_RED + "There is no discipline with that name." + ANSI_RESET);
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
    
/*
    public static void deleteDiscipline() throws IOException
    {
        // Define the variables
        String name, uName = null;
        File disFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/discipline.ser");
        File tempFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/disciplineCopy.ser");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            // Define a new ObjectInputStream and a new ObjectOutputStream
            FileInputStream fs = new FileInputStream(disFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            // Create another ObjectOutputStream without the header to be able to write objects without overwriting
            FileOutputStream fos = new FileOutputStream(tempFl, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        
            try
            {
                // Ask for the name
                System.out.print("Enter the name of the discipline you want to delete: ");
                try
                {
                    uName = reader.readLine().toLowerCase();
                }
                catch(IOException ex1)
                {
                    System.out.println("Couldn't read.");
                }
                
                while(true)
                {
                    Discipline dis = (Discipline) os.readObject();
                    name = dis.getName().toLowerCase();
                    
                    // Check if there is a discipline with the name the user has entered and show the result
                    if(!name.equals(uName))
                    {
                        oos.writeObject(dis);
                    }
                }
            }
            catch(EOFException eof)
            {
                fs.close();
                os.close();
                fos.close();
                oos.close();
                disFl.delete();
                tempFl.renameTo(disFl);
                System.out.println();
                System.out.print(ANSI_GREEN + "The discipline has been removed." + ANSI_RESET);
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
*/    

    public static void changeDiscipline() throws IOException
    {
        // Define the variables
        String code, uCode = null, line = null;
        int number = 0;
        boolean back, repeat;
        File disFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/discipline.ser");
        File tempFl = new File("F:/DAM/Program/TrackAndFieldProyect/Files/disciplineCopy.ser");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            // Define a new ObjectInputStream and a new ObjectOutputStream
            FileInputStream fs = new FileInputStream(disFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            // Create another ObjectOutputStream without the header to be able to write objects without overwriting
            FileOutputStream fos = new FileOutputStream(tempFl, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        
            try
            {
                // Ask for the code
                System.out.print("Enter the code of the discipline you want to change: ");
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
                    Discipline dis = (Discipline) os.readObject();
                    code = dis.getCode().toLowerCase();
                    
                    // Check if there is a discipline with the name the user has entered and show the result
                    if(code.equals(uCode))
                    {
                        do
                        {
                            back = false;

                            System.out.println("Choose the information you want to change for the discipline " + dis.getName() + ".");

                            // Show the menu and ask for the number
                            System.out.println();
                            System.out.println();
                            System.out.println("ATRIBUTES");
                            System.out.println("*********");
                            System.out.println("1. World Record");
                            System.out.println("2. Back");
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
                            while((number < 1 || number > 2) || repeat == true);

                            switch(number)
                            {
                                case 1:
                                    System.out.println();
                                    dis.setWorldRecord();
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
                                    number = 1;
                                    oos.writeObject(dis);
                                    back = true;
                                    break;
                            }
                        }
                        while(back == false);
                    }
                    else
                    {
                        oos.writeObject(dis);
                    }
                }
            }
            catch(EOFException eof)
            {
                fs.close();
                os.close();
                fos.close();
                oos.close();
                disFl.delete();
                tempFl.renameTo(disFl);
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
