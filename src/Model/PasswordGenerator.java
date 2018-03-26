/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Eider
 */
public class PasswordGenerator
{
    public static void writePassword(String username, String password)
    {
        // Define the variables
        String flUser, flPasswd;
        boolean result = true;
        File flPass = new File("G:/DAM/Program/Files/htpasswd.dat");
        
        try
        {
            username = InputMethods.readString("Enter the username: ");
            password = InputMethods.readString("Enter the password: ");
            
            FileInputStream fis = new FileInputStream(flPass);
            DataInputStream dis = new DataInputStream(fis);
                
            try
            {
                while(true)
                {
                    flUser = dis.readUTF();
                    flPasswd = dis.readUTF();
                    
                    if(username.equals(flUser))
                    {
                        result = false;
                    }
                }
            }
            catch(EOFException eof)
            {
                fis.close();
                dis.close();
            }
            
            FileOutputStream fs = new FileOutputStream(flPass, true);
            DataOutputStream ds = new DataOutputStream(fs);
            
            if(result == true)
            {
                ds.writeUTF(username);
                ds.writeUTF(password);
                ds.close();
                fs.close();
            }
            else
            {
                System.out.println("That username already exists. Please, enter the information again.");
            }
        }
        catch(IOException ex1)
        {
            System.out.println("Couldn't read.");
        }
    }
}
