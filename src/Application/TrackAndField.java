/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Model.*;
import View.*;
import Controller.TrackAndFieldController;

/**
 *
 * @author DM3-1-03
 */
public class TrackAndField
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
    private SendMailMethods sendMailMeth;
    
    // Define the view members
    private login loginMenu;
    private newAccount newAccView;
    private accountRecovery accRecovery;
    private mainPage mainPage;
    private mainPageGuest mpGuest;
    private addChangeAthlete addAthView;
    private addChangeCoach addChView;
    private addChangeCompetition addCompView;
    private addChangeDiscipline addDisView;
    private addChangeRegistration addRegView;
    private addChangeResult addRsView;
    private addChangeSchedule addSchView;
    private addChangeTeam addTmView;
    private manageAthlete mgAthView;
    private manageCoach mgChView;
    private manageCompetition mgCompView;
    private manageDiscipline mgDisView;
    private manageRegistration mgRegView;
    private manageResult mgRsView;
    private manageSchedule mgSchView;
    private manageTeam mgTmView;
    private showOneAth shOneAth;
    
    // Define the controller
    TrackAndFieldController ctrl;
    
    public static void main(String[] args)
    {
        TrackAndField tfApp = new TrackAndField();
        tfApp.start();
    }
    
    private void start()
    {
        // Initialize the model members
        athModel = new Athlete(false);
        chModel = new Coach(false);
        compModel = new Competition(false);
        disModel = new Discipline(false);
        // perModel = new Person(false);
        regModel = new Registration(false);
        rsModel = new Result(false);
        schModel = new Schedule(false);
        tmModel = new Team(false);
        athMeth = new AthleteDataAccess();
        chMeth = new CoachDataAccess();
        compMeth = new CompetitionDataAccess();
        disMeth = new DisciplineDataAccess();
        regMeth = new RegistrationDataAccess();
        rsMeth = new ResultDataAccess();
        schMeth = new ScheduleDataAccess();
        tmMeth = new TeamDataAccess();
        passwdGen = new PasswordGenerator();
        sendMailMeth = new SendMailMethods();
        
        // Initialize the view members
        loginMenu = new login();
        newAccView = new newAccount();
        accRecovery = new accountRecovery();
        mainPage = new mainPage();
        mpGuest = new mainPageGuest();
        addAthView = new addChangeAthlete();
        addChView = new addChangeCoach();
        addCompView = new addChangeCompetition();
        addDisView = new addChangeDiscipline();
        addRegView = new addChangeRegistration();
        addRsView = new addChangeResult();
        addSchView = new addChangeSchedule();
        addTmView = new addChangeTeam();
        mgAthView = new manageAthlete();
        mgChView = new manageCoach();
        mgCompView = new manageCompetition();
        mgDisView = new manageDiscipline();
        mgRegView = new manageRegistration();
        mgRsView = new manageResult();
        mgSchView = new manageSchedule();
        mgTmView = new manageTeam();
        shOneAth = new showOneAth();
        
        ctrl = new TrackAndFieldController(athModel, chModel, compModel, disModel, /*perModel,*/ regModel, rsModel, schModel, tmModel, 
        athMeth, chMeth, compMeth, disMeth, regMeth, rsMeth, schMeth, tmMeth, passwdGen, sendMailMeth, loginMenu, newAccView, accRecovery, mainPage, 
        mpGuest, addAthView, addChView, addCompView, addDisView, addRegView, addRsView, addSchView, addTmView, mgAthView, mgChView, mgCompView, 
        mgDisView, mgRegView, mgRsView, mgSchView, mgTmView, shOneAth);
        
        loginMenu.setVisible(true);
    }
}
