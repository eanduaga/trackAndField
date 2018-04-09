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
public class ResultDataAccess
{
    public static void writeResult(Result rs) throws IOException
    {
        // Define the variables
        File rsFl = new File("G:/DAM/Program/Files/result.ser");
        
        try
        {
            // If the file doesn't exist, create a new ObjectOutputStream to write the header
            if(!rsFl.exists())
            {
                FileOutputStream fs1 = new FileOutputStream(rsFl);
                ObjectOutputStream os1 = new ObjectOutputStream(fs1);
                os1.close();
            }

            // Create another ObjectOutputStream without the header to be able to write objects without overwriting
            FileOutputStream fs = new FileOutputStream(rsFl, true);
            ObjectOutputStream os = new ObjectOutputStream(fs)
            {
                @Override
                protected void writeStreamHeader() throws IOException
                {
                    reset();
                }
            };
            
            // Write the object and close the file
            os.writeObject(rs);
            os.close();
            fs.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
    }
    
    
    
}
