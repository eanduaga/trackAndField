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
public class AthleteMethods
{    
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
    
    public static void writeAthFileFromArrayList(ArrayList <Athlete> alAth) throws IOException
    {
        // Define the variables
        int i;
        File athFl = new File("files/athlete.ser");
        
        try
        {
            FileOutputStream fs = new FileOutputStream(athFl);
            ObjectOutputStream os = new ObjectOutputStream(fs);

            // Write the objects of the ArrayList and close the file
            for(i = 0; i < alAth.size(); ++i)
            {
                Athlete ath = alAth.get(i);
                os.writeObject(ath);
            }
            
            os.close();
            fs.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
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
                    
                    if(ath.getName().toLowerCase().contains(search) || ath.getSurname().toLowerCase().contains(search))
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
}
