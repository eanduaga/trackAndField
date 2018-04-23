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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TrackAndFieldController implements ActionListener, MouseListener, KeyListener
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
    private addChangeAthlete addChgAthView;
    private addChangeCoach addChgChView;
    private addChangeCompetition addChgCompView;
    private addChangeDiscipline addChgDisView;
    private addChangeRegistration addChgRegView;
    private addChangeResult addChgRsView;
    private addChangeSchedule addChgSchView;
    private addChangeTeam addChgTmView;
    private manageAthlete mgAthView;
    private manageCoach mgChView;
    private manageCompetition mgCompView;
    private manageDiscipline mgDisView;
    private manageRegistration mgRegView;
    private manageResult mgRsView;
    private manageSchedule mgSchView;
    private manageTeam mgTmView;
    private showOneAth shOneAth;
    
    // Define the constructor
    public TrackAndFieldController(Athlete ath, Coach ch, Competition comp, Discipline dis, /*Person per,*/ Registration reg, Result rs,
    Schedule sch, Team tm, AthleteDataAccess ada, CoachDataAccess chda, CompetitionDataAccess cda, DisciplineDataAccess dda, 
    RegistrationDataAccess rda, ResultDataAccess rsda, ScheduleDataAccess sda, TeamDataAccess tda, PasswordGenerator pg, login lgm, 
    newAccount nav, mainPage mp, mainPageGuest mpg, addChangeAthlete aAth, addChangeCoach aCh, addChangeCompetition aComp, addChangeDiscipline aDis, addChangeRegistration aReg, 
    addChangeResult aRs, addChangeSchedule aSch, addChangeTeam aTm, manageAthlete mgAth, manageCoach mgCh, manageCompetition mgComp, manageDiscipline mgDis, 
    manageRegistration mgReg, manageResult mgRs, manageSchedule mgSch, manageTeam mgTm, showOneAth shAth)
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
        addChgAthView = aAth;
        addChgChView = aCh;
        addChgCompView = aComp;
        addChgDisView = aDis;
        addChgRegView = aReg;
        addChgRsView = aRs;
        addChgSchView = aSch;
        addChgTmView = aTm;
        mgAthView = mgAth;
        mgChView = mgCh;
        mgCompView = mgComp;
        mgDisView = mgDis;
        mgRegView = mgReg;
        mgRsView = mgRs;
        mgSchView = mgSch;
        mgTmView = mgTm;
        shOneAth = shAth;
        
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
        addChgAthView.jButton_save.addActionListener(this);
        addChgChView.jButton_save.addActionListener(this);
        addChgCompView.jButton_save.addActionListener(this);
        addChgDisView.jButton_save.addActionListener(this);
        addChgRegView.jButton_save.addActionListener(this);
        addChgRsView.jButton_save.addActionListener(this);
        addChgSchView.jButton_save.addActionListener(this);
        addChgTmView.jButton_save.addActionListener(this);
        
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
        
        mgAthView.jTable_athleteData.addMouseListener(this);
        
        // KeyListeners
        loginMenu.jPasswordField_password.addKeyListener(this);
        loginMenu.jTextField_username.addKeyListener(this);
        loginMenu.jButton_login.addKeyListener(this);
        addChgAthView.jButton_save.addKeyListener(this);
        addChgAthView.jComboBox_team.addKeyListener(this);
        mgAthView.jTextField_search.addKeyListener(this);
        addChgChView.jButton_save.addKeyListener(this);
        addChgChView.jTextField_startYear.addKeyListener(this);
        mgChView.jTextField_search.addKeyListener(this);
        addChgCompView.jButton_save.addKeyListener(this);
        addChgCompView.jXDatePicker_endDate.addKeyListener(this);
        mgCompView.jTextField_search.addKeyListener(this);
        addChgDisView.jButton_save.addKeyListener(this);
        addChgDisView.jTextField_femaleWR.addKeyListener(this);
        mgDisView.jTextField_search.addKeyListener(this);
        addChgRegView.jButton_save.addKeyListener(this);
        addChgRegView.jComboBox_competition.addKeyListener(this);
        mgRegView.jTextField_search.addKeyListener(this);
        addChgRsView.jButton_save.addKeyListener(this);
        addChgRsView.jXDatePicker_rsDate.addKeyListener(this);
        mgRsView.jTextField_search.addKeyListener(this);
        addChgSchView.jButton_save.addKeyListener(this);
        addChgSchView.jComboBox_gender.addKeyListener(this);
        mgSchView.jTextField_search.addKeyListener(this);
        addChgTmView.jButton_save.addKeyListener(this);
        addChgTmView.jTextField_town.addKeyListener(this);
        mgTmView.jTextField_search.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == loginMenu.jButton_login)
        {
            // Define the variables
            ArrayList <Result> alRs = new ArrayList();
            Result rs = new Result(false);
            
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
                
                try
                {
                    alRs = rsMeth.writeResultArrayList();
                } 
                catch(IOException ex)
                {
                    Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                rs = alRs.get(0);
                mainPage.jLabel_result1DisciplineGender.setText(rs.getDiscipline() + "  -  " + rs.getGender());
                mainPage.jLabel_result1Athlete.setText(rs.getAthlete());
                mainPage.jLabel_result1Time.setText(Float.toString(rs.getTime()));
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
        
        else if(ae.getSource() == addChgAthView.jButton_save)
        {
            // Create an empty object
            Athlete ath = new Athlete(false);
            
            // Give values to the object using the information the user has entered in the textfields
            ath.setID(addChgAthView.jTextField_id.getText());
            ath.setName(addChgAthView.jTextField_name.getText());
            ath.setSurname(addChgAthView.jTextField_surname.getText());
            ath.setCountry(addChgAthView.jTextField_country.getText());
            ath.setHomeTown(addChgAthView.jTextField_homeTown.getText());
            ath.setAddress(addChgAthView.jTextField_address.getText());
            ath.setNationality(addChgAthView.jTextField_nationality.getText());
            ath.setBirthDate(addChgAthView.jXDatePicker_birthDate.getDate());
            ath.setEmail(addChgAthView.jTextField_email.getText());
            ath.setPhoneNum(addChgAthView.jTextField_phoneNum.getText());
            ath.setFavouriteDiscipline(addChgAthView.jTextField_favDiscipline.getText());
            ath.setSeasonBest(Float.parseFloat(addChgAthView.jTextField_seasonBest.getText()));
            ath.setPersonalBest(Float.parseFloat(addChgAthView.jTextField_personalBest.getText()));
            ath.setNumMedals(Integer.parseInt(addChgAthView.jTextField_numMedals.getText()));
            ath.setTeam(addChgAthView.jComboBox_team.getSelectedItem().toString());
            
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
            addChgAthView.jTextField_id.setText(null);
            addChgAthView.jTextField_name.setText(null);
            addChgAthView.jTextField_surname.setText(null);
            addChgAthView.jTextField_country.setText(null);
            addChgAthView.jTextField_homeTown.setText(null);
            addChgAthView.jTextField_address.setText(null);
            addChgAthView.jTextField_nationality.setText(null);
            addChgAthView.jXDatePicker_birthDate.setDate(null);
            addChgAthView.jTextField_email.setText(null);
            addChgAthView.jTextField_phoneNum.setText(null);
            addChgAthView.jTextField_favDiscipline.setText(null);
            addChgAthView.jTextField_seasonBest.setText(null);
            addChgAthView.jTextField_personalBest.setText(null);
            addChgAthView.jTextField_numMedals.setText(null);
        }
        
        else if(ae.getSource() == addChgChView.jButton_save)
        {
            // Create an empty object
            Coach ch = new Coach(false);
            
            // Give values to the object using the information the user has entered in the textfields
            ch.setID(addChgChView.jTextField_id.getText());
            ch.setName(addChgChView.jTextField_name.getText());
            ch.setSurname(addChgChView.jTextField_surname.getText());
            ch.setCountry(addChgChView.jTextField_country.getText());
            ch.setHomeTown(addChgChView.jTextField_homeTown.getText());
            ch.setAddress(addChgChView.jTextField_address.getText());
            ch.setNationality(addChgChView.jTextField_nationality.getText());
            ch.setBirthDate(addChgChView.jXDatePicker_birthDate.getDate());
            ch.setEmail(addChgChView.jTextField_email.getText());
            ch.setPhoneNum(addChgChView.jTextField_phoneNum.getText());
            ch.setStartYear(Year.parse(addChgChView.jTextField_startYear.getText()));
            
            // Write the object in a file using the method WriteCompetition
            try
            {
                chMeth.writeCoach(ch);
            }
            catch(Exception ex)
            {
                System.out.println("Error.");
            }
            
            // Erase the values of the textfields
            addChgChView.jTextField_id.setText(null);
            addChgChView.jTextField_name.setText(null);
            addChgChView.jTextField_surname.setText(null);
            addChgChView.jTextField_country.setText(null);
            addChgChView.jTextField_homeTown.setText(null);
            addChgChView.jTextField_address.setText(null);
            addChgChView.jTextField_nationality.setText(null);
            addChgChView.jXDatePicker_birthDate.setDate(null);
            addChgChView.jTextField_email.setText(null);
            addChgChView.jTextField_phoneNum.setText(null);
            addChgChView.jTextField_startYear.setText(null);
        }
        
        else if(ae.getSource() == addChgCompView.jButton_save)
        {
            // Create an empty object
            Competition cmp = new Competition(false);
            
            // Give values to the object using the information the user has entered in the textfields
            cmp.setCode();
            cmp.setName(addChgCompView.jTextField_name.getText());
            cmp.setDescription(addChgCompView.jTextField_description.getText());
            cmp.setLocation(addChgCompView.jTextField_location.getText());
            cmp.setStartDate(addChgCompView.jXDatePicker_startDate.getDate());
            cmp.setEndDate(addChgCompView.jXDatePicker_endDate.getDate());
            
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
            addChgCompView.jTextField_name.setText(null);
            addChgCompView.jTextField_description.setText(null);
            addChgCompView.jTextField_location.setText(null);
            addChgCompView.jXDatePicker_startDate.setDate(null);
            addChgCompView.jXDatePicker_endDate.setDate(null);
        }
        
        else if(ae.getSource() == addChgDisView.jButton_save)
        {
            // Create an empty object
            float[] wr = new float[2];
            Discipline dis = new Discipline(false);
            
            // Give values to the object using the information the user has entered in the textfields
            dis.setCode();
            dis.setName(addChgDisView.jTextField_name.getText());
            dis.setDescription(addChgDisView.jTextField_description.getText());
            wr[0] = Float.parseFloat(addChgDisView.jTextField_maleWR.getText());
            wr[1] = Float.parseFloat(addChgDisView.jTextField_femaleWR.getText());
            dis.setWorldRecord(wr);
            
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
            addChgDisView.jTextField_name.setText(null);
            addChgDisView.jTextField_description.setText(null);
            addChgDisView.jTextField_maleWR.setText(null);
            addChgDisView.jTextField_femaleWR.setText(null);
        }
        
        else if(ae.getSource() == addChgRegView.jButton_save)
        {
            // Create an empty object
            Registration reg = new Registration(false);
            
            // Give values to the object using the information the user has entered in the textfields
            reg.setCode();
            reg.setAthlete(addChgRegView.jComboBox_athlete.getSelectedItem().toString());
            reg.setCompetition(addChgRegView.jComboBox_competition.getSelectedItem().toString());
            
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
            addChgRegView.jComboBox_athlete.setSelectedIndex(0);
            addChgRegView.jComboBox_competition.setSelectedIndex(0);

        }
        
        else if(ae.getSource() == addChgRsView.jButton_save)
        {
            // Create an empty object
            Result rs = new Result(false);
            
            // Give values to the object using the information the user has entered in the textfields
            rs.setCode();
            rs.setCompetition(addChgRsView.jComboBox_competition.getSelectedItem().toString());
            rs.setDiscipline(addChgRsView.jComboBox_discipline.getSelectedItem().toString());
            rs.setGender(addChgRsView.jComboBox_gender.getSelectedItem().toString());
            rs.setAthlete(addChgRsView.jComboBox_athlete.getSelectedItem().toString());
            rs.setRound(addChgRsView.jComboBox_round.getSelectedItem().toString());
            rs.setPosition(Integer.parseInt(addChgRsView.jTextField_position.getText()));
            rs.setTime(Float.parseFloat(addChgRsView.jTextField_time.getText()));
            rs.setDate(addChgRsView.jXDatePicker_rsDate.getDate());
            
            
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
            
            addChgRsView.jComboBox_competition.setSelectedIndex(0);
            addChgRsView.jComboBox_discipline.setSelectedIndex(0);
            addChgRsView.jComboBox_gender.setSelectedIndex(0);
            addChgRsView.jComboBox_athlete.setSelectedIndex(0);
            addChgRsView.jComboBox_round.setSelectedIndex(0);
            addChgRsView.jTextField_position.setText(null);
            addChgRsView.jTextField_time.setText(null);
            addChgRsView.jXDatePicker_rsDate.setDate(null);     
        }
        
        else if(ae.getSource() == addChgSchView.jButton_save)
        {
            // Create an empty object
            Schedule sch = new Schedule(false);
            
            // Give values to the object using the information the user has entered in the textfields
            sch.setCode();
            sch.setCompetition(addChgSchView.jComboBox_competition.getSelectedItem().toString());
            sch.setDiscipline(addChgSchView.jComboBox_discipline.getSelectedItem().toString());
            sch.setDate(addChgSchView.jXDatePicker_schDate.getDate());
            sch.setRound(addChgSchView.jComboBox_round.getSelectedItem().toString());
            sch.setGender(addChgSchView.jComboBox_gender.getSelectedItem().toString());
            
            // Write the object in a file using the method WriteCompetition
            try
            {
                schMeth.writeSchedule(sch);
            }
            catch(Exception ex)
            {
                System.out.println("Error.");
            }
            
            // Erase the values of the textfields
            
            addChgSchView.jComboBox_competition.setSelectedIndex(0);
            addChgSchView.jComboBox_discipline.setSelectedIndex(0);
            addChgSchView.jXDatePicker_schDate.setDate(null);
            addChgSchView.jComboBox_round.setSelectedIndex(0);
            addChgSchView.jComboBox_gender.setSelectedIndex(0);
        }
        
        else if(ae.getSource() == addChgTmView.jButton_save)
        {
            // Create an empty object
            Team tm = new Team(false);
            
            // Give values to the object using the information the user has entered in the textfields
            tm.setCode();
            tm.setName(addChgTmView.jTextField_name.getText());
            tm.setCountry(addChgTmView.jTextField_country.getText());
            tm.setTown(addChgTmView.jTextField_town.getText());
            
            // Write the object in a file using the method WriteCompetition
            try
            {
                tmMeth.writeTeam(tm);
            }
            catch(Exception ex)
            {
                System.out.println("Error.");
            }
            
            // Erase the values of the textfields
            addChgTmView.jTextField_name.setText(null);
            addChgTmView.jTextField_country.setText(null);
            addChgTmView.jTextField_town.setText(null);
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
            int rowCount = athTb.getRowCount();
            
            for(i = rowCount - 1; i >= 0; --i)
            {
                athTb.removeRow(i);
            }
            
            for(i = 0; i < alAth.size(); ++i)
            {
                Athlete ath = alAth.get(i);
                Vector os = null;
                athTb.addRow(os);
                athTb.setValueAt(ath.getID(), i, 0);
                athTb.setValueAt(ath.getName(), i, 1);
                athTb.setValueAt(ath.getSurname(), i, 2);
                athTb.setValueAt(ath.getEmail(), i, 3);
                athTb.setValueAt(ath.getPhoneNum(), i, 4);
            }
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuCoach)
        {
            // Open Coach Management view
            mgChView.setVisible(true);
            
            // Show coach info on the table of the management view
            ArrayList <Coach> alCh = new ArrayList();
            int i;
            
            try
            {
                alCh = chMeth.writeCoachArrayList();
            } 
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel chTb = (DefaultTableModel) mgChView.jTable_coachData.getModel();
            int rowCount = chTb.getRowCount();
            
            for(i = rowCount - 1; i >= 0; --i)
            {
                chTb.removeRow(i);
            }
            
            for(i = 0; i < alCh.size(); ++i)
            {
                Coach ch = alCh.get(i);
                Vector os = null;
                chTb.addRow(os);
                chTb.setValueAt(ch.getID(), i, 0);
                chTb.setValueAt(ch.getName(), i, 1);
                chTb.setValueAt(ch.getSurname(), i, 2);
                chTb.setValueAt(ch.getEmail(), i, 3);
                chTb.setValueAt(ch.getPhoneNum(), i, 4);
            }
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
            int rowCount = compTb.getRowCount();
            
            for(i = rowCount - 1; i >= 0; --i)
            {
                compTb.removeRow(i);
            }
            
            for(i = 0; i < alComp.size(); ++i)
            {
                Competition comp = alComp.get(i);
                Vector os = null;
                compTb.addRow(os);
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
            // Open the Discipline Management view
            mgDisView.setVisible(true);
            
            // Show discipline info on the table of the management view
            float[] wr = new float[2];
            ArrayList <Discipline> alDis = new ArrayList();
            int i;
            
            try
            {
                alDis = disMeth.writeDisciplineArrayList();
            } 
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel disTb = (DefaultTableModel) mgDisView.jTable_disciplineData.getModel();
            int rowCount = disTb.getRowCount();
            
            for(i = rowCount - 1; i >= 0; --i)
            {
                disTb.removeRow(i);
            }
            
            for(i = 0; i < alDis.size(); ++i)
            {
                Discipline dis = alDis.get(i);
                wr = dis.getWorldRecord();
                Vector os = null;
                disTb.addRow(os);
                disTb.setValueAt(dis.getCode(), i, 0);
                disTb.setValueAt(dis.getName(), i, 1);
                disTb.setValueAt(dis.getDescription(), i, 2);
                disTb.setValueAt(wr[0], i, 3);
                disTb.setValueAt(wr[1], i, 4);
            }
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuReg)
        {
            // Open the Registration Management view
            mgRegView.setVisible(true);
            
            // Show registration info on the table of the management view
            ArrayList <Registration> alReg = new ArrayList();
            int i;
            
            try
            {
                alReg = regMeth.writeRegistrationArrayList();
            }
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel regTb = (DefaultTableModel) mgRegView.jTable_registrationData.getModel();
            int rowCount = regTb.getRowCount();
            
            for(i = rowCount - 1; i >= 0; --i)
            {
                regTb.removeRow(i);
            }
            
            for(i = 0; i < alReg.size(); ++i)
            {
                Registration reg = alReg.get(i);
                Vector os = null;
                regTb.addRow(os);
                regTb.setValueAt(reg.getCode(), i, 0);
                regTb.setValueAt(reg.getAthlete(), i, 1);
                regTb.setValueAt(reg.getCompetition(), i, 2);
                regTb.setValueAt(reg.getRegDate(), i, 3);
            }
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuRs)
        {
            // Open Result Management view
            mgRsView.setVisible(true);
            
            // Show result info on the table of the management view
            ArrayList <Result> alRs = new ArrayList();
            int i;
            
            try
            {
                alRs = rsMeth.writeResultArrayList();
            } 
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel rsTb = (DefaultTableModel) mgRsView.jTable_resultData.getModel();
            int rowCount = rsTb.getRowCount();
            
            for(i = rowCount - 1; i >= 0; --i)
            {
                rsTb.removeRow(i);
            }
            
            for(i = 0; i < alRs.size(); ++i)
            {
                Result rs = alRs.get(i);
                Vector os = null;
                rsTb.addRow(os);
                rsTb.setValueAt(rs.getCode(), i, 0);
                rsTb.setValueAt(rs.getCompetition(), i, 1);
                rsTb.setValueAt(rs.getDiscipline(), i, 2);
                rsTb.setValueAt(rs.getGender(), i, 3);
                rsTb.setValueAt(rs.getAthlete(), i, 4);
                rsTb.setValueAt(rs.getRound(), i, 5);
                rsTb.setValueAt(rs.getTime(), i, 6);
                rsTb.setValueAt(rs.getDate(), i, 7);
            }
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuSch)
        {
            // Open the Schedule Management view
            mgSchView.setVisible(true);
            
            // Show schedule info on the table of the management view
            ArrayList <Schedule> alSch = new ArrayList();
            int i;
            
            try
            {
                alSch = schMeth.writeScheduleArrayList();
            } 
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel schTb = (DefaultTableModel) mgSchView.jTable_scheduleData.getModel();
            int rowCount = schTb.getRowCount();
            
            for(i = rowCount - 1; i >= 0; --i)
            {
                schTb.removeRow(i);
            }
            
            for(i = 0; i < alSch.size(); ++i)
            {
                Schedule sch = alSch.get(i);
                Vector os = null;
                schTb.addRow(os);
                schTb.setValueAt(sch.getCode(), i, 0);
                schTb.setValueAt(sch.getCompetition(), i, 1);
                schTb.setValueAt(sch.getDiscipline(), i, 2);
                schTb.setValueAt(sch.getDate(), i, 3);
                schTb.setValueAt(sch.getRound(), i, 4);
                schTb.setValueAt(sch.getGender(), i, 5);
            }
        }
        
        else if(me.getSource() == mainPage.jLabel_leftMenuTm)
        {
            // Open the Team Management view
            mgTmView.setVisible(true);
            
            // Show team info on the table of the management view
            ArrayList <Team> alTm = new ArrayList();
            int i;
            
            try
            {
                alTm = tmMeth.writeTeamArrayList();
            } 
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel tmTb = (DefaultTableModel) mgTmView.jTable_teamData.getModel();
            int rowCount = tmTb.getRowCount();
            
            for(i = rowCount - 1; i >= 0; --i)
            {
                tmTb.removeRow(i);
            }
            
            for(i = 0; i < alTm.size(); ++i)
            {
                Team tm = alTm.get(i);
                Vector os = null;
                tmTb.addRow(os);
                tmTb.setValueAt(tm.getCode(), i, 0);
                tmTb.setValueAt(tm.getName(), i, 1);
                tmTb.setValueAt(tm.getCountry(), i, 2);
                tmTb.setValueAt(tm.getTown(), i, 3);
            }
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
            addChgAthView.setVisible(true);
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
            addChgChView.setVisible(true);
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
            addChgCompView.setVisible(true);
        }
        
        else if(me.getSource() == mgCompView.jLabel_change)
        {
            addChgCompView.setVisible(true);
            
            // Define the variables
            ArrayList <Competition> alComp = new ArrayList();
            
            // Get the information from the file and store it in the ArrayList
            try
            {
                alComp = compMeth.writeCompetitionArrayList();
            } 
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel compTb = (DefaultTableModel) mgCompView.jTable_competitionData.getModel();
            
            int rowNum = mgCompView.jTable_competitionData.getSelectedRow();
            Competition comp = alComp.get(rowNum);
            
            //
            addChgCompView.jTextField_name.setText(comp.getName());
            addChgCompView.jTextField_description.setText(comp.getDescription());
            addChgCompView.jTextField_location.setText(comp.getLocation());
            addChgCompView.jXDatePicker_startDate.setDate(comp.getStartDate());
            addChgCompView.jXDatePicker_endDate.setDate(comp.getEndDate());
            
            //
            addChgCompView.jTextField_name.setEditable(false);
            addChgCompView.jTextField_description.setEditable(false);
        }
        
        else if(me.getSource() == mgCompView.jLabel_delete)
        {
            // Define the variables
            ArrayList <Competition> alComp = new ArrayList();
            int i;
            
            // Get the information from the file and store it in the ArrayList
            try
            {
                alComp = compMeth.writeCompetitionArrayList();
            }
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel compTb = (DefaultTableModel) mgCompView.jTable_competitionData.getModel();
            
            int rowNum = mgCompView.jTable_competitionData.getSelectedRow();
            compTb.removeRow(rowNum);
            Competition comp = alComp.get(rowNum);
            alComp.remove(comp);
            
            try
            {
                compMeth.writeCompFileFromArrayList(alComp);
            } 
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            int rowCount = compTb.getRowCount();
            
            for(i = rowCount - 1; i >= 0; --i)
            {
                compTb.removeRow(i);
            }
            
            for(i = 0; i < alComp.size(); ++i)
            {
                comp = alComp.get(i);
                Vector os = null;
                compTb.addRow(os);
                compTb.setValueAt(comp.getCode(), i, 0);
                compTb.setValueAt(comp.getName(), i, 1);
                compTb.setValueAt(comp.getDescription(), i, 2);
                compTb.setValueAt(comp.getLocation(), i, 3);
                compTb.setValueAt(comp.getStartDate(), i, 4);
                compTb.setValueAt(comp.getEndDate(), i, 5);
            }
        }
        
        else if(me.getSource() == mgCompView.jLabel_viewComp)
        {
            
        }
        
        else if(me.getSource() == mgDisView.jLabel_add)
        {
            addChgDisView.setVisible(true);
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
            addChgRegView.setVisible(true);
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
            /** Open Add Result view **/
            addChgRsView.setVisible(true);
            
            /** Set values to the ComboBoxes **/
            // Define the variables
            ArrayList <Competition> alCompRs = new ArrayList();
            ArrayList <Discipline> alDisRs = new ArrayList();
            ArrayList <Athlete> alAthRs = new ArrayList();
            int i;
            
            // Get the information from the file and store it in the ArrayList
            try
            {
                alCompRs = compMeth.writeCompetitionArrayList();
                alDisRs = disMeth.writeDisciplineArrayList();
                alAthRs = athMeth.writeAthleteArrayList();
            }
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            for(i = 0; i < alCompRs.size(); ++i)
            {
                Competition comp = alCompRs.get(i);
                addChgRsView.jComboBox_competition.addItem(comp.getName());
            }
            
            for(i = 0; i < alDisRs.size(); ++i)
            {
                Discipline dis = alDisRs.get(i);
                addChgRsView.jComboBox_discipline.addItem(dis.getName());
            }
            
            for(i = 0; i < alAthRs.size(); ++i)
            {
                Athlete ath = alAthRs.get(i);
                addChgRsView.jComboBox_athlete.addItem(ath.getName() + " " + ath.getSurname());
            }
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
            addChgSchView.setVisible(true);
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
            addChgTmView.setVisible(true);
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

        else if(me.getSource() == mgAthView.jTable_athleteData)
        {
            if(me.getClickCount() == 2)
            {
                // Open the Show One Athlete view
                shOneAth.setVisible(true);

                // Get the information about the selected athlete and show it in the view
                ArrayList <Athlete> alAth = new ArrayList();
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

                // Get the information from the file and store it in the ArrayList
                try
                {
                    alAth = athMeth.writeAthleteArrayList();
                }
                catch(IOException ex)
                {
                    Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                int rowNum = mgAthView.jTable_athleteData.getSelectedRow();
                Athlete ath = alAth.get(rowNum);
                
                // Give values to the labels
                shOneAth.jLabel_nameSurname.setText(ath.getName().toUpperCase() + " " + ath.getSurname().toUpperCase());
                shOneAth.jLabel_idAth.setText(ath.getID());
                shOneAth.jLabel_countryAth.setText(ath.getCountry());
                shOneAth.jLabel_homeTownAth.setText(ath.getHomeTown());
                shOneAth.jLabel_addressAth.setText(ath.getAddress());
                shOneAth.jLabel_nationalityAth.setText(ath.getNationality());
                shOneAth.jLabel_birthDateAth.setText(df.format(ath.getBirthDate()));
                shOneAth.jLabel_emailAth.setText(ath.getEmail());
                shOneAth.jLabel_phoneNumAth.setText(ath.getPhoneNum());
                shOneAth.jLabel_favDisciplineAth.setText(ath.getFavouriteDiscipline());
                shOneAth.jLabel_perBestAth.setText(Float.toString(ath.getPersonalBest()));
                shOneAth.jLabel_seBestAth.setText(Float.toString(ath.getSeasonBest()));
                shOneAth.jLabel_numMedalsAth.setText(Integer.toString(ath.getNumMedals()));
                shOneAth.jLabel_teamAth.setText(ath.getTeam());
            }
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
    public void keyTyped(KeyEvent ke)
    {
        if(ke.getSource() == mgCompView.jTextField_search)
        {
            // Define the variables
            ArrayList <Competition> alCompSearch = new ArrayList();
            int i;
            
            // Get the value of the textfield
            String search = mgCompView.jTextField_search.getText();
            
            try
            {
                alCompSearch = compMeth.searchCompetitionArrayList(search);
            } 
            catch(IOException ex)
            {
                Logger.getLogger(TrackAndFieldController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel compTb = (DefaultTableModel) mgCompView.jTable_competitionData.getModel();
            int rowCount = compTb.getRowCount();
            
            for(i = rowCount - 1; i >= 0; --i)
            {
                compTb.removeRow(i);
            }
            
            for(i = 0; i < alCompSearch.size(); ++i)
            {
                Competition comp = alCompSearch.get(i);
                Vector os = null;
                compTb.addRow(os);
                compTb.setValueAt(comp.getCode(), i, 0);
                compTb.setValueAt(comp.getName(), i, 1);
                compTb.setValueAt(comp.getDescription(), i, 2);
                compTb.setValueAt(comp.getLocation(), i, 3);
                compTb.setValueAt(comp.getStartDate(), i, 4);
                compTb.setValueAt(comp.getEndDate(), i, 5);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
        if(ke.getSource() == loginMenu.jButton_login || ke.getSource() == loginMenu.jPasswordField_password || ke.getSource() == loginMenu.jTextField_username)
        {
            if(ke.getKeyChar() == KeyEvent.VK_ENTER)
            {
                loginMenu.jButton_login.doClick();
            }
        }
        
        else if(ke.getSource() == addChgAthView.jButton_save || ke.getSource() == addChgAthView.jComboBox_team)
        {
            if(ke.getKeyChar() == KeyEvent.VK_ENTER)
            {
                addChgAthView.jButton_save.doClick();
            }
        }
        
        else if(ke.getSource() == addChgChView.jButton_save || ke.getSource() == addChgChView.jTextField_startYear)
        {
            if(ke.getKeyChar() == KeyEvent.VK_ENTER)
            {
                addChgChView.jButton_save.doClick();
            }
        }
        
        else if(ke.getSource() == addChgCompView.jButton_save || ke.getSource() == addChgCompView.jXDatePicker_endDate)
        {
            if(ke.getKeyChar() == KeyEvent.VK_ENTER)
            {
                addChgCompView.jButton_save.doClick();
            }
        }
        
        else if(ke.getSource() == addChgDisView.jButton_save || ke.getSource() == addChgDisView.jTextField_femaleWR)
        {
            if(ke.getKeyChar() == KeyEvent.VK_ENTER)
            {
                addChgDisView.jButton_save.doClick();
            }
        }
        
        else if(ke.getSource() == addChgRegView.jButton_save || ke.getSource() == addChgRegView.jComboBox_competition)
        {
            if(ke.getKeyChar() == KeyEvent.VK_ENTER)
            {
                addChgRegView.jButton_save.doClick();
            }
        }
        
        else if(ke.getSource() == addChgRsView.jButton_save || ke.getSource() == addChgRsView.jXDatePicker_rsDate)
        {
            if(ke.getKeyChar() == KeyEvent.VK_ENTER)
            {
                addChgRsView.jButton_save.doClick();
            }
        }
        
        else if(ke.getSource() == addChgSchView.jButton_save || ke.getSource() == addChgSchView.jComboBox_gender)
        {
            if(ke.getKeyChar() == KeyEvent.VK_ENTER)
            {
                addChgSchView.jButton_save.doClick();
            }
        }
        
        else if(ke.getSource() == addChgTmView.jButton_save || ke.getSource() == addChgTmView.jTextField_town)
        {
            if(ke.getKeyChar() == KeyEvent.VK_ENTER)
            {
                addChgTmView.jButton_save.doClick();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
        
    }
}
