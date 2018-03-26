/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author DM3-1-03
 */

// Import the libraries
import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrackAndFieldController implements ActionListener
{
    // Define the model members
    Athlete athModel;
    Coach chModel;
    Competition compModel;
    Discipline disModel;
    Registration regModel;
    Result rsModel;
    Schedule schModel;
    Team tmModel;
    private AthleteDataAccess athMeth;
    private CoachDataAccess chMeth;
    private CompetitionDataAccess compMeth; // = new CompetitionDataAccess();
    private DisciplineDataAccess disMeth;
    private RegistrationDataAccess regMeth;
    private ResultDataAccess rsMeth;
    private ScheduleDataAccess schMeth;
    private TeamDataAccess tmMeth;
    
    // Define the view members
    private login loginMenu;
    private newAccount newAccView;
    private addCompetition addCompView;
    
    // Define the constructor
    public TrackAndFieldController(login lgm, newAccount nav, Competition comp, CompetitionDataAccess cda)
    {
        loginMenu = lgm;
        newAccView = nav;
        compModel = comp;
        compMeth = cda;
        
        loginMenu.jButton_login.addActionListener(this);
        //loginMenu.jLabel_newAccount.addActionListener(this);
        //loginMenu.jLabel_continueToApp.addActionListener(this);
        newAccView.jButton_send.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == loginMenu.jButton_login)
        {
            // compView.setVisible(true);
        }
        
        else if(ae.getSource() == loginMenu.jLabel_newAccount)
        {
            newAccView.setVisible(true);
        }
        
        else if(ae.getSource() == loginMenu.jLabel_continueToApp)
        {
            // compView.setVisible(true);
        }
        
        else if(ae.getSource() == newAccView.jButton_send)
        {
            
        }
        
        /*
        else if(ae.getSource() == compView.jButton_send)
        {
            // Create an empty object
            Competition cmp = new Competition(false);
            
            // Give values to the object using the information the user has entered in the textfields
            cmp.setCode();
            cmp.setName(compView.jTextField_name.getText());
            cmp.setDescription(compView.jTextField_description.getText());
            cmp.setLocation(compView.jTextField_location.getText());
            cmp.setStartDate(compView.jTextField_startDate.getText());
            cmp.setEndDate(compView.jTextField_endDate.getText());
            
            // Write the object in a file using the method WriteCompetition
            try
            {
                compFunc.writeCompetition(cmp);
            }
            catch(Exception ex)
            {
                System.out.println("Error.");
            }
            
            // Erase the values of the textfields
            compView.jTextField_name.setText(null);
            compView.jTextField_description.setText(null);
            compView.jTextField_location.setText(null);
            compView.jTextField_startDate.setText(null);
            compView.jTextField_endDate.setText(null);
        }
*/
    }
}
