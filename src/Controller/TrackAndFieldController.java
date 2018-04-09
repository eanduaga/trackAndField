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
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;

public class TrackAndFieldController implements ActionListener, MouseListener, MouseMotionListener
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
    private PasswordGenerator passwdGen;
    
    // Define the view members
    private login loginMenu;
    private newAccount newAccView;
    private mainPage mainPage;
    private mainPageGuest mpGuest;
    private addCompetition addCompView;
    private addDiscipline addDisView;
    private addRegistration addRegView;
    private addSchedule addSchView;
    private addTeam addTmView;
    private manageAthlete mgAthView;
    private manageCompetition mgCompView;
    private manageDiscipline mgDisView;
    private manageRegistration mgRegView;
    private manageSchedule mgSchView;
    private manageTeam mgTmView;
    
    // Define the constructor
    public TrackAndFieldController(Competition comp, CompetitionDataAccess cda, PasswordGenerator pg, login lgm, newAccount nav, mainPage mp, 
    mainPageGuest mpg, addCompetition aComp, addDiscipline aDis, addRegistration aReg, addSchedule aSch, addTeam aTm, 
    manageAthlete mgAth, manageCompetition mgComp, manageDiscipline mgDis, manageRegistration mgReg, manageSchedule mgSch, 
    manageTeam mgTm)
    {
        // Giving values to the model members
        compModel = comp;
        compMeth = cda;
        passwdGen = pg;
        
        // Giving values to the view members
        loginMenu = lgm;
        newAccView = nav;
        mainPage = mp;
        mpGuest = mpg;
        addCompView = aComp;
        addDisView = aDis;
        addRegView = aReg;
        addSchView = aSch;
        addTmView = aTm;
        mgAthView = mgAth;
        mgCompView = mgComp;
        mgDisView = mgDis;
        mgRegView = mgReg;
        mgSchView = mgSch;
        mgTmView = mgTm;
        
        // ActionListeners and MouseListeners
        /* Login, New Account, MainPage */
        loginMenu.jButton_login.addActionListener(this);
        loginMenu.jLabel_newAccount.addMouseListener(this);
        loginMenu.jLabel_continueToApp.addMouseListener(this);
        newAccView.jButton_send.addActionListener(this);
        mainPage.jLabel_leftMenuAth.addMouseListener(this);
        mainPage.jLabel_leftMenuCoach.addMouseListener(this);
        mainPage.jLabel_leftMenuComp.addMouseListener(this);
        mainPage.jLabel_leftMenuDis.addMouseListener(this);
        mainPage.jLabel_leftMenuReg.addMouseListener(this);
        mainPage.jLabel_leftMenuRs.addMouseListener(this);
        mainPage.jLabel_leftMenuSch.addMouseListener(this);
        mainPage.jLabel_leftMenuTm.addMouseListener(this);
        mpGuest.jLabel_leftMenuAthGuest.addMouseListener(this);
        mpGuest.jLabel_leftMenuCoachGuest.addMouseListener(this);
        mpGuest.jLabel_leftMenuCompGuest.addMouseListener(this);
        mpGuest.jLabel_leftMenuDisGuest.addMouseListener(this);
        mpGuest.jLabel_leftMenuRegGuest.addMouseListener(this);
        mpGuest.jLabel_leftMenuRsGuest.addMouseListener(this);
        mpGuest.jLabel_leftMenuSchGuest.addMouseListener(this);
        mpGuest.jLabel_leftMenuTmGuest.addMouseListener(this);
        
        /* Add Pages */
        addCompView.jButton_save.addActionListener(this);
        addDisView.jButton_save.addActionListener(this);
        addRegView.jButton_save.addActionListener(this);
        addSchView.jButton_save.addActionListener(this);
        addTmView.jButton_save.addActionListener(this);
        
        /* Management Pages */
        mgAthView.jLabel_add.addMouseListener(this);
        mgAthView.jLabel_change.addMouseListener(this);
        mgAthView.jLabel_delete.addMouseListener(this);
        mgAthView.jLabel_viewAth.addMouseListener(this);
        mgCompView.jLabel_add.addMouseListener(this);
        mgCompView.jLabel_change.addMouseListener(this);
        mgCompView.jLabel_delete.addMouseListener(this);
        mgCompView.jLabel_viewComp.addMouseListener(this);
        mgDisView.jLabel_add.addMouseListener(this);
        mgDisView.jLabel_change.addMouseListener(this);
        mgDisView.jLabel_delete.addMouseListener(this);
        mgDisView.jLabel_viewDis.addMouseListener(this);
        mgRegView.jLabel_add.addMouseListener(this);
        mgRegView.jLabel_change.addMouseListener(this);
        mgRegView.jLabel_delete.addMouseListener(this);
        mgRegView.jLabel_viewReg.addMouseListener(this);
        mgSchView.jLabel_add.addMouseListener(this);
        mgSchView.jLabel_change.addMouseListener(this);
        mgSchView.jLabel_delete.addMouseListener(this);
        mgSchView.jLabel_viewSch.addMouseListener(this);
        mgTmView.jLabel_add.addMouseListener(this);
        mgTmView.jLabel_change.addMouseListener(this);
        mgTmView.jLabel_delete.addMouseListener(this);
        mgTmView.jLabel_viewTeams.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == loginMenu.jButton_login)
        {
            // Get the values from the textfields
            String username = loginMenu.jTextField_username.getText();
            String password = loginMenu.jPasswordField_password.getText();
            
            // Call the method readPassword with the information above
            boolean result = passwdGen.readPassword(username, password);
            
            // Check if the username and password are correct
            if(result == true)
            {
                mainPage.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(newAccView, "Incorrect username / password combination.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else if(ae.getSource() == newAccView.jButton_send)
        {
            // Get the values from the textfields 
            String username = newAccView.jTextField_username.getText();
            String passwd = newAccView.jPasswordField_password.getText();
            String fullName = newAccView.jTextField_fullName.getText();
            String emailAcc = newAccView.jTextField_email.getText();
            
            // Call the method writePassword with the information above
            boolean result = passwdGen.writePassword(username, passwd, fullName, emailAcc);
            
            // Show a message if the username already exists
            if(result == false)
            {
                JOptionPane.showMessageDialog(newAccView, "That username already exists.", "Incorrect", JOptionPane.ERROR_MESSAGE);
            }
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

    @Override
    public void mouseClicked(MouseEvent me)
    {
        if(me.getSource() == loginMenu.jLabel_newAccount)
        {
            newAccView.setVisible(true);
            loginMenu.setVisible(false);
        }
        else if(me.getSource() == loginMenu.jLabel_continueToApp)
        {
            mpGuest.setVisible(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent me)
    {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me)
    {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me)
    {
        
    }

    @Override
    public void mouseExited(MouseEvent me)
    {
        
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
