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
    
    
    // Define the view members
    private login loginMenu;
    private newAccount newAccView;
    private addCompetition addCompView;
    
    // Define the controller
    TrackAndFieldController ctrl;
    
    public static void main(String[] args)
    {
        TrackAndField tfApp = new TrackAndField();
        tfApp.start();
    }
    
    private void start()
    {
        loginMenu = new login();
        newAccView = new newAccount();
        compModel = new Competition(false);
        compMeth = new CompetitionDataAccess();
        
        ctrl = new TrackAndFieldController(loginMenu, newAccView, compModel, compMeth);
        loginMenu.setVisible(true);
    }
}
