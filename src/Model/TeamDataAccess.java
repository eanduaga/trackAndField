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
public class TeamDataAccess
{
    public static void writeTeam(Team tm) throws IOException
    {
        // Define the variables
        File tmFl = new File("files/team.ser");
        
        try
        {
            // If the file doesn't exist, create a new ObjectOutputStream to write the header
            if(!tmFl.exists())
            {
                FileOutputStream fs1 = new FileOutputStream(tmFl);
                ObjectOutputStream os1 = new ObjectOutputStream(fs1);
                os1.close();
            }

            // Create another ObjectOutputStream without the header to be able to write objects without overwriting
            FileOutputStream fs = new FileOutputStream(tmFl, true);
            ObjectOutputStream os = new ObjectOutputStream(fs)
            {
                @Override
                protected void writeStreamHeader() throws IOException
                {
                    reset();
                }
            };
            
            // Write the object and close the file
            os.writeObject(tm);
            os.close();
            fs.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
    }
    
    public static ArrayList <Team> writeTeamArrayList() throws IOException
    {
        // Define the variables
        File tmFl = new File("files/team.ser");
        ArrayList <Team> alTm = new ArrayList();
        
        try
        {
            FileInputStream fs = new FileInputStream(tmFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            try
            {
                while(true)
                {
                    Team tm = new Team(false);
                    tm = (Team) os.readObject();
                    alTm.add(tm);                    
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
        
        return alTm;
    }
    
    public static void writeTmFileFromArrayList(ArrayList <Team> alTm) throws IOException
    {
        // Define the variables
        int i;
        File tmFl = new File("files/team.ser");
        
        try
        {
            FileOutputStream fs = new FileOutputStream(tmFl);
            ObjectOutputStream os = new ObjectOutputStream(fs);

            // Write the objects of the ArrayList and close the file
            for(i = 0; i < alTm.size(); ++i)
            {
                Team tm = alTm.get(i);
                os.writeObject(tm);
            }
            
            os.close();
            fs.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
    }
    
    public static ArrayList <Team> searchTeamArrayList(String search) throws IOException
    {
        // Define the variables
        File tmFl = new File("files/team.ser");
        ArrayList <Team> alTmSearch = new ArrayList();
        
        try
        {
            FileInputStream fs = new FileInputStream(tmFl);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            try
            {
                while(true)
                {
                    Team tm = new Team(false);
                    tm = (Team) os.readObject();
                    
                    if(tm.getName().contains(search))
                    {
                        alTmSearch.add(tm); 
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
        
        return alTmSearch;
    }
}
