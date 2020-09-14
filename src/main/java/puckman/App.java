package puckman;

import processing.core.PApplet;
import processing.core.PFont;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The puckman.App class is the main class from where the application will run.
 * The GUI will be updated from this class.
 * Author: Joel (butterplup)
 */
public class App extends PApplet {

    //Define any fields here
    // Game characters
    //private Puck puckman
    //private List<Jelly> jellies = new ArrayList<>();
    //private GameMap maze = new GameMap();
    // Starting coordinates for puckman and the jellys
    private int puckStartXCoord;
    private int puckStartYCoord;
    private int jellyStartXCoord;
    private int jellyStartYCoord;
    // Font for GUI
    private PFont font;
    // Game init info
    private boolean gameOver = false;
    private boolean gameStart = true;
    private boolean setUpSuccess = false;

    public App() {
        //Instantiate any objects here
        // new Jellys
        // new Map
        // new Puck

    }

    /**
     * This method runs once setting up the initial status
     */
    public void setup() {

    }

    /**
     * This method is called repeatedly
     */
    public void draw() {

        //Advance the game state by 1 tick
        tick();
        // Display the updated appropriate game state to the screen
        paint();

    }

    /**
     * A method to update the game state every tick
     */
    public void tick() {

    }

    /**
     * A method to update the game view every tick
     */
    public void paint() {

    }

    /**
     * This method resets all fields back to initial values
     */
    public void resetGame() {
        // Basically clear everything and return all to base state
    }

    /**
     * This should update game state based on menu selection
     */
    public void startGame() {
        // Logic for menu screen
    }

    /**
     * Just to set this class as the main class
     * @param args
     */
    public static void main(String[] args) {
        PApplet.main("puckman.App");
    }

}
