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
        
        // Initialize the view members
        loginMenu = new login();
        newAccView = new newAccount();
        mainPage = new mainPage();
        mpGuest = new mainPageGuest();
        addCompView = new addCompetition();
        addDisView = new addDiscipline();
        addRegView = new addRegistration();
        addSchView = new addSchedule();
        addTmView = new addTeam();
        mgAthView = new manageAthlete();
        mgCompView = new manageCompetition();
        mgDisView = new manageDiscipline();
        mgRegView = new manageRegistration();
        mgSchView = new manageSchedule();
        mgTmView = new manageTeam();
        
        ctrl = new TrackAndFieldController(compModel, compMeth, passwdGen, loginMenu, newAccView, mainPage, mpGuest, addCompView, addDisView, addRegView,
        addSchView, addTmView, mgAthView, mgCompView, mgDisView, mgRegView, mgSchView, mgTmView);
        loginMenu.setVisible(true);
    }
}
