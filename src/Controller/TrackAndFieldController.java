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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TrackAndFieldController implements ActionListener, MouseListener, MouseMotionListener, KeyListener
{
    // Define the model members
    Athlete athModel;
    Coach chModel;
    Competition compModel;
    Discipline disModel;
    // Person perModel;
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
    private addAthlete addAthView;
    private addCoach addChView;
    private addCompetition addCompView;
    private addDiscipline addDisView;
    private addRegistration addRegView;
    private addResult addRsView;
    private addSchedule addSchView;
    private addTeam addTmView;
    private manageAthlete mgAthView;
    private manageCoach mgChView;
    private manageCompetition mgCompView;
    private manageDiscipline mgDisView;
    private manageRegistration mgRegView;
    private manageResult mgRsView;
    private manageSchedule mgSchView;
    private manageTeam mgTmView;
    
    // Define the constructor
    public TrackAndFieldController(Athlete ath, Coach ch, Competition comp, Discipline dis, /*Person per,*/ Registration reg, Result rs,
    Schedule sch, Team tm, AthleteDataAccess ada, CoachDataAccess chda, CompetitionDataAccess cda, DisciplineDataAccess dda, 
    RegistrationDataAccess rda, ResultDataAccess rsda, ScheduleDataAccess sda, TeamDataAccess tda, PasswordGenerator pg, login lgm, 
    newAccount nav, mainPage mp, mainPageGuest mpg, addAthlete aAth, addCoach aCh, addCompetition aComp, addDiscipline aDis, addRegistration aReg, 
    addResult aRs, addSchedule aSch, addTeam aTm, manageAthlete mgAth, manageCoach mgCh, manageCompetition mgComp, manageDiscipline mgDis, 
    manageRegistration mgReg, manageResult mgRs, manageSchedule mgSch, manageTeam mgTm)
    {
        // Giving values to the model members
        athModel = ath;
        chModel = ch;
        compModel = comp;
        disModel = dis;
        // perModel = per;
        regModel = reg;
        rsModel = rs;
        schModel = sch;
        tmModel = tm;
        
        athMeth = ada;
        chMeth = chda;
        compMeth = cda;
        disMeth = dda;
        regMeth = rda;
        rsMeth = rsda;
        schMeth = sda;
        tmMeth = tda;
        passwdGen = pg;
        
        // Giving values to the view members
        loginMenu = lgm;
        newAccView = nav;
        mainPage = mp;
        mpGuest = mpg;
        addAthView = aAth;
        addChView = aCh;
        addCompView = aComp;
        addDisView = aDis;
        addRegView = aReg;
        addRsView = aRs;
        addSchView = aSch;
        addTmView = aTm;
        mgAthView = mgAth;
        mgChView = mgCh;
        mgCompView = mgComp;
        mgDisView = mgDis;
        mgRegView = mgReg;
        mgRsView = mgRs;
        mgSchView = mgSch;
        mgTmView = mgTm;
        
        // ActionListeners and MouseListeners
        /* Login, New Account, MainPage */
        loginMenu.jButton_login.addActionListener(this);
        loginMenu.jLabel_newAccount.addMouseListener(this);
        loginMenu.jLabel_continueToApp.addMouseListener(this);
        newAccView.jButton_send.addActionListener(this);
        newAccView.jLabel_back.addMouseListener(this);
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
        addAthView.jButton_save.addActionListener(this);
        addChView.jButton_save.addActionListener(this);
        addCompView.jButton_save.addActionListener(this);
        addDisView.jButton_save.addActionListener(this);
        addRegView.jButton_save.addActionListener(this);
        addRsView.jButton_save.addActionListener(this);
        addSchView.jButton_save.addActionListener(this);
        addTmView.jButton_save.addActionListener(this);
        
        /* Management Pages */
        mgAthView.jLabel_add.addMouseListener(this);
        mgAthView.jLabel_change.addMouseListener(this);
        mgAthView.jLabel_delete.addMouseListener(this);
        mgAthView.jLabel_viewAth.addMouseListener(this);
        mgChView.jLabel_add.addMouseListener(this);
        mgChView.jLabel_change.addMouseListener(this);
        mgChView.jLabel_delete.addMouseListener(this);
        mgChView.jLabel_viewCoach.addMouseListener(this);
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
        mgRsView.jLabel_add.addMouseListener(this);
        mgRsView.jLabel_change.addMouseListener(this);
        mgRsView.jLabel_delete.addMouseListener(this);
        mgRsView.jLabel_viewRs.addMouseListener(this);
        mgSchView.jLabel_add.addMouseListener(this);
        mgSchView.jLabel_change.addMouseListener(this);
        mgSchView.jLabel_delete.addMouseListener(this);
        mgSchView.jLabel_viewSch.addMouseListener(this);
        mgTmView.jLabel_add.addMouseListener(this);
        mgTmView.jLabel_change.addMouseListener(this);
        mgTmView.jLabel_delete.addMouseListener(this);
        mgTmView.jLabel_viewTeams.addMouseListener(this);
        
        // KeyListeners
        loginMenu.jPasswordField_password.addKeyListener(this);
        loginMenu.jTextField_username.addKeyListener(this);
        loginMenu.jButton_login.addKeyListener(this);
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
                loginMenu.setVisible(false);
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
        
        else if(ae.getSource() == addAthView.jButton_save)
        {
            // Create an empty object
            Athlete ath = new Athlete(false);
            
            // Give values to the object using the information the user has entered in the textfields
            ath.setID(addAthView.jTextField_id.getText());
            ath.setName(addAthView.jTextField_name.getText());
            ath.setSurname(addAthView.jTextField_surname.getText());
            ath.setCountry(addAthView.jTextField_country.getText());
            ath.setHomeTown(addAthView.jTextField_homeTown.getText());
            ath.setAddress(addAthView.jTextField_address.getText());
            ath.setNationality(addAthView.jTextField_nationality.getText());
            ath.setBirthDate(addAthView.jXDatePicker_birthDate.getDate());
            ath.setEmail(addAthView.jTextField_email.getText());
            ath.setPhoneNum(addAthView.jTextField_phoneNum.getText());
            ath.setFavouriteDiscipline(addAthView.jTextField_favDiscipline.getText());
            ath.setSeasonBest(Float.parseFloat(addAthView.jTextField_seasonBest.getText()));
            ath.setPersonalBest(Float.parseFloat(addAthView.jTextField_personalBest.getText()));
            ath.setNumMedals(Integer.parseInt(addAthView.jTextField_numMedals.getText()));
            ath.setTeam(addAthView.jComboBox_team.getName());
            
            // Write the object in a file using the method WriteCompetition
            try
            {
                athMeth.writeAthlete(ath);
            }
            catch(Exception ex)
            {
                System.out.println("Error.");
            }
            
            // Erase the values of the textfields
            addAthView.jTextField_id.setText(null);
            addAthView.jTextField_name.setText(null);
            addAthView.jTextField_surname.setText(null);
            addAthView.jTextField_country.setText(null);
            addAthView.jTextField_homeTown.setText(null);
            addAthView.jTextField_address.setText(null);
            addAthView.jTextField_nationality.setText(null);
            addAthView.jXDatePicker_birthDate.setDate(null);
            addAthView.jTextField_email.setText(null);
            addAthView.jTextField_phoneNum.setText(null);
            addAthView.jTextField_favDiscipline.setText(null);
            addAthView.jTextField_seasonBest.setText(null);
            addAthView.jTextField_personalBest.setText(null);
            addAthView.jTextField_numMedals.setText(null);
        }
        
        else if(ae.getSource() == addChView.jButton_save)
        {
            
        }
        
        else if(ae.getSource() == addCompView.jButton_save)
        {
            // Create an empty object
            Competition cmp = new Competition(false);
            
            // Give values to the object using the information the user has entered in the textfields
            cmp.setCode();
            cmp.setName(addCompView.jTextField_name.getText());
            cmp.setDescription(addCompView.jTextField_description.getText());
            cmp.setLocation(addCompView.jTextField_location.getText());
            cmp.setStartDate(addCompView.jTextField_startDate.getText());
            cmp.setEndDate(addCompView.jTextField_endDate.getText());
            
            // Write the object in a file using the method WriteCompetition
            try
            {
                compMeth.writeCompetition(cmp);
            }
            catch(Exception ex)
            {
                System.out.println("Error.");
            }
            
            // Erase the values of the textfields
            addCompView.jTextField_name.setText(null);
            addCompView.jTextField_description.setText(null);
            addCompView.jTextField_location.setText(null);
            addCompView.jTextField_startDate.setText(null);
            addCompView.jTextField_endDate.setText(null);
        }
        
        else if(ae.getSource() == addDisView.jButton_save)
        {
            // Create an empty object
            Discipline dis = new Discipline(false);
            
            // Give values to the object using the information the user has entered in the textfields
            dis.setCode();
            dis.setName(addDisView.jTextField_name.getText());
            dis.setDescription(addDisView.jTextField_description.getText());
            dis.setWorldRecord(Float.parseFloat(addDisView.jTextField_maleWR.getText()));
            
            // Write the object in a file using the method WriteCompetition
            try
            {
                disMeth.writeDiscipline(dis);
            }
            catch(Exception ex)
            {
                System.out.println("Error.");
            }
            
            // Erase the values of the textfields
            addDisView.jTextField_name.setText(null);
            addDisView.jTextField_description.setText(null);
            addDisView.jTextField_maleWR.setText(null);
            addDisView.jTextField_femaleWR.setText(null);
        }
        
        else if(ae.getSource() == addRegView.jButton_save)
        {
            // Create an empty object
            Registration reg = new Registration(false);
            
            // Give values to the object using the information the user has entered in the textfields
            reg.setCode();
            reg.setAthlete(addRegView.jComboBox_athlete.getSelectedItem().toString());
            reg.setCompetition(addRegView.jComboBox_competition.getSelectedItem().toString());
            
            // Write the object in a file using the method WriteCompetition
            try
            {
                regMeth.writeRegistration(reg);
            }
            catch(Exception ex)
            {
                System.out.println("Error.");
            }
            
            // Erase the values of the textfields
            addRegView.jComboBox_athlete.setSelectedIndex(0);
            addRegView.jComboBox_competition.setSelectedIndex(0);

        }
        
        else if(ae.getSource() == addRsView.jButton_save)
        {
            // Create an empty object
            Result rs = new Result(false);
            
            // Give values to the object using the information the user has entered in the textfields
            rs.setCode();
            rs.setCompetition(addRsView.jComboBox_competition.getSelectedItem().toString());
            rs.setDiscipline(addRsView.jComboBox_discipline.getSelectedItem().toString());
            rs.setGender(addRsView.jComboBox_gender.getSelectedItem().toString());
            rs.setAthlete(addRsView.jComboBox_athlete.getSelectedItem().toString());
            rs.setRound(addRsView.jComboBox_round.getSelectedItem().toString());
            rs.setPosition(Integer.parseInt(addRsView.jTextField_position.getText()));
            rs.setTime(Float.parseFloat(addRsView.jTextField_time.getText()));
            rs.setDate(addRsView.jXDatePicker_rsDate.getDate());
            
            
            // Write the object in a file using the method WriteCompetition
            try
            {
                rsMeth.writeResult(rs);
            }
            catch(Exception ex)
            {
                System.out.println("Error.");
            }
            
            // Erase the values of the textfields
            
            addRsView.jComboBox_competition.setSelectedIndex(0);
            addRsView.jComboBox_discipline.setSelectedIndex(0);
            addRsView.jComboBox_gender.setSelectedIndex(0);
            addRsView.jComboBox_athlete.setSelectedIndex(0);
            addRsView.jComboBox_round.setSelectedIndex(0);
            addRsView.jTextField_position.setText(null);
            addRsView.jTextField_time.setText(null);
            addRsView.jXDatePicker_rsDate.setDate(null);
                    
        }
        
        else if(ae.getSource() == addSchView.jButton_save)
        {
            
        }
        
        else if(ae.getSource() == addTmView.jButton_save)
        {
            
        }
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
        
        else if(me.getSource() == newAccView.jLabel_back)
        {
            newAccView.setVisible(false);
            loginMenu.setVisible(true);
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuAth)
        {
            // Open Athlete Management view
            mgAthView.setVisible(true);
            
            // Show athlete info on the table of the management view
            ArrayList <Athlete> alAth = new ArrayList();
            int i;
            
            try
            {
                alAth = athMeth.writeAthleteArrayList();
            } 
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel athTb = (DefaultTableModel) mgAthView.jTable_athleteData.getModel();
            
            /*
            for(i = 0; i < alAth.size(); ++i)
            {
                Athlete ath = alAth.get(i);
                athTb.setValueAt(ath.getAddress(), i, 0);
                athTb.setValueAt(ath.getName(), i, 1);
                athTb.setValueAt(ath.getSurname(), i, 2);
                athTb.setValueAt(ath.getEmail(), i, 3);
                athTb.setValueAt(ath.getPhoneNum(), i, 4);
            }
*/
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuCoach)
        {
            mgChView.setVisible(true);
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuComp)
        {
            // Open the Competition Management view
            mgCompView.setVisible(true);
            
            // Show competition info on the table of the management view
            ArrayList <Competition> alComp = new ArrayList();
            int i;
            
            try
            {
                alComp = compMeth.writeCompetitionArrayList();
            } 
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel compTb = (DefaultTableModel) mgCompView.jTable_competitionData.getModel();
            
            for(i = 0; i < alComp.size(); ++i)
            {
                Competition comp = alComp.get(i);
                compTb.setValueAt(comp.getCode(), i, 0);
                compTb.setValueAt(comp.getName(), i, 1);
                compTb.setValueAt(comp.getDescription(), i, 2);
                compTb.setValueAt(comp.getLocation(), i, 3);
                compTb.setValueAt(comp.getStartDate(), i, 4);
                compTb.setValueAt(comp.getEndDate(), i, 5);
            }
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuDis)
        {
            mgDisView.setVisible(true);
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuReg)
        {
            mgRegView.setVisible(true);
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuRs)
        {
            mgRsView.setVisible(true);
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuSch)
        {
            mgSchView.setVisible(true);
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuTm)
        {
            mgTmView.setVisible(true);
        }
        
        else if(me.getSource() == mpGuest.jLabel_leftMenuAthGuest)
        {
            
        }
        
        else if(me.getSource() == mpGuest.jLabel_leftMenuCoachGuest)
        {
            
        }
        
        else if(me.getSource() == mpGuest.jLabel_leftMenuCompGuest)
        {
            
        }
        
        else if(me.getSource() == mpGuest.jLabel_leftMenuDisGuest)
        {
            
        }
        
        else if(me.getSource() == mpGuest.jLabel_leftMenuRegGuest)
        {
            
        }
        
        else if(me.getSource() == mpGuest.jLabel_leftMenuRsGuest)
        {
            
        }
        
        else if(me.getSource() == mpGuest.jLabel_leftMenuSchGuest)
        {
            
        }
        
        else if(me.getSource() == mpGuest.jLabel_leftMenuTmGuest)
        {
            
        }
        
        else if(me.getSource() == mgAthView.jLabel_add)
        {
            addAthView.setVisible(true);
        }
        
        else if(me.getSource() == mgAthView.jLabel_change)
        {
            
        }
        
        else if(me.getSource() == mgAthView.jLabel_delete)
        {
            
        }
        
        else if(me.getSource() == mgAthView.jLabel_viewAth)
        {
            
        }
        
        else if(me.getSource() == mgChView.jLabel_add)
        {
            addChView.setVisible(true);
        }
        
        else if(me.getSource() == mgChView.jLabel_change)
        {
            
        }
        
        else if(me.getSource() == mgChView.jLabel_delete)
        {
            
        }
        
        else if(me.getSource() == mgChView.jLabel_viewCoach)
        {
            
        }
        
        else if(me.getSource() == mgCompView.jLabel_add)
        {
            addCompView.setVisible(true);
        }
        
        else if(me.getSource() == mgCompView.jLabel_change)
        {
            
        }
        
        else if(me.getSource() == mgCompView.jLabel_delete)
        {
            
        }
        
        else if(me.getSource() == mgCompView.jLabel_viewComp)
        {
            
        }
        
        else if(me.getSource() == mgDisView.jLabel_add)
        {
            addDisView.setVisible(true);
        }
        
        else if(me.getSource() == mgDisView.jLabel_change)
        {
            
        }
        
        else if(me.getSource() == mgDisView.jLabel_delete)
        {
            
        }
        
        else if(me.getSource() == mgDisView.jLabel_viewDis)
        {
            
        }
        
        else if(me.getSource() == mgRegView.jLabel_add)
        {
            addRegView.setVisible(true);
        }
        
        else if(me.getSource() == mgRegView.jLabel_change)
        {
            
        }
        
        else if(me.getSource() == mgRegView.jLabel_delete)
        {
            
        }
        
        else if(me.getSource() == mgRegView.jLabel_viewReg)
        {
            
        }
        
        else if(me.getSource() == mgRsView.jLabel_add)
        {
            addRsView.setVisible(true);
        }
        
        else if(me.getSource() == mgRsView.jLabel_change)
        {
            
        }
        
        else if(me.getSource() == mgRsView.jLabel_delete)
        {
            
        }
        
        else if(me.getSource() == mgRsView.jLabel_viewRs)
        {
            
        }
        
        else if(me.getSource() == mgSchView.jLabel_add)
        {
            addSchView.setVisible(true);
        }
        
        else if(me.getSource() == mgSchView.jLabel_change)
        {
            
        }
        
        else if(me.getSource() == mgSchView.jLabel_delete)
        {
            
        }
        
        else if(me.getSource() == mgSchView.jLabel_viewSch)
        {
            
        }
        
        else if(me.getSource() == mgTmView.jLabel_add)
        {
            addTmView.setVisible(true);
        }
        
        else if(me.getSource() == mgTmView.jLabel_change)
        {
            
        }
        
        else if(me.getSource() == mgTmView.jLabel_delete)
        {
            
        }
        
        else if(me.getSource() == mgTmView.jLabel_viewTeams)
        {
            
        }
    }

    @Override
    public void mousePressed(MouseEvent me)
    {
        
    }

    @Override
    public void mouseReleased(MouseEvent me)
    {
        
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
    public void mouseDragged(MouseEvent me)
    {
        
    }

    @Override
    public void mouseMoved(MouseEvent me)
    {
        
    }

    @Override
    public void keyTyped(KeyEvent ke)
    {
        
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
        if (ke.getKeyChar() == KeyEvent.VK_ENTER)
        {
            loginMenu.jButton_login.doClick();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
        
    }
}
