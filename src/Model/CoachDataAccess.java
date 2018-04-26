/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Eider
 */
public class CoachDataAccess
{
    public static void writeCoach(Coach ch) throws IOException
    {
        // Define the variables
        File chFl = new File("files/coach.ser");
        
        try
        {
            // If the file doesn't exist, create a new ObjectOutputStream to write the header
            if(!chFl.exists())
            {
                FileOutputStream fs1 = new FileOutputStream(chFl);
                ObjectOutputStream os1 = new ObjectOutputStream(fs1);
                os1.close();
            }

            // Create another ObjectOutputStream without the header to be able to write objects without overwriting
            FileOutputStream fs = new FileOutputStream(chFl, true);
            ObjectOutputStream os = new ObjectOutputStream(fs)
            {
                @Override
                protected void writeStreamHeader() throws IOException
                {
                    reset();
                }
            };
            
            // Write the object and close the file
            os.writeObject(ch);
            os.close();
            fs.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
    }
    
    public static ArrayList <Coach> writeCoachArrayList() throws IOException
    {
        // Define the variables
        File chFl = new File("files/coach.ser");
        ArrayList <Coach> alCh = new ArrayList();
        
        try
        {
            FileInputStream fs = new FileInputStream(chFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            try
            {
                while(true)
                {
                    Coach ch = new Coach(false);
                    ch = (Coach) os.readObject();
                    alCh.add(ch);                    
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
        
        return alCh;
    }
    
    public static void writeChFileFromArrayList(ArrayList <Coach> alCh) throws IOException
    {
        // Define the variables
        int i;
        File chFl = new File("files/coach.ser");
        
        try
        {
            FileOutputStream fs = new FileOutputStream(chFl);
            ObjectOutputStream os = new ObjectOutputStream(fs);

            // Write the objects of the ArrayList and close the file
            for(i = 0; i < alCh.size(); ++i)
            {
                Coach ch = alCh.get(i);
                os.writeObject(ch);
            }
            
            os.close();
            fs.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
    }
    
    public static ArrayList <Coach> searchCoachArrayList(String search) throws IOException
    {
        // Define the variables
        File chFl = new File("files/coach.ser");
        ArrayList <Coach> alChSearch = new ArrayList();
        
        try
        {
            FileInputStream fs = new FileInputStream(chFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            try
            {
                while(true)
                {
                    Coach ch = new Coach(false);
                    ch = (Coach) os.readObject();
                    
                    if(ch.getName().contains(search))
                    {
                        alChSearch.add(ch); 
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
        
        return alChSearch;
    }
}
