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
        
        // Initialize the view members
        loginMenu = new login();
        newAccView = new newAccount();
        mainPage = new mainPage();
        mpGuest = new mainPageGuest();
        addAthView = new addAthlete();
        addChView = new addCoach();
        addCompView = new addCompetition();
        addDisView = new addDiscipline();
        addRegView = new addRegistration();
        addRsView = new addResult();
        addSchView = new addSchedule();
        addTmView = new addTeam();
        mgAthView = new manageAthlete();
        mgChView = new manageCoach();
        mgCompView = new manageCompetition();
        mgDisView = new manageDiscipline();
        mgRegView = new manageRegistration();
        mgRsView = new manageResult();
        mgSchView = new manageSchedule();
        mgTmView = new manageTeam();
        
        ctrl = new TrackAndFieldController(athModel, chModel, compModel, disModel, /*perModel,*/ regModel, rsModel, schModel, tmModel, 
        athMeth, chMeth, compMeth, disMeth, regMeth, rsMeth, schMeth, tmMeth, passwdGen, loginMenu, newAccView, mainPage, mpGuest, 
        addAthView, addChView, addCompView, addDisView, addRegView, addRsView, addSchView, addTmView, mgAthView, mgChView, mgCompView, 
        mgDisView, mgRegView, mgRsView, mgSchView, mgTmView);
        loginMenu.setVisible(true);
    }
}
