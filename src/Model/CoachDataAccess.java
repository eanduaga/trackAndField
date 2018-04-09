/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Eider
 */
public class CoachDataAccess
{
    public static void writeCoach(Coach ch) throws IOException
    {
        // Define the variables
        File chFl = new File("G:/DAM/Program/Files/coach.ser");
        
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
    
    
    
    
}
