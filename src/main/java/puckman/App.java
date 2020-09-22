package puckman;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.application.Application;

// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import puckman.creatures.Jelly;
import puckman.creatures.Puck;

/**
 * The puckman.App class is the main class from where the application will run.
 * The GUI will be updated from this class.
 * Author: Joel (butterplup)
 */
public class App extends Application {

    //Define any fields here
    // Game characters
    private Puck _puckman;
    private List<Jelly> jellies = new ArrayList<>();
    //private GameMap maze = new GameMap();
    // Starting coordinates for puckman and the jellys
    private int _puckStartXCoord = 50;
    private int _puckStartYCoord = 50;
    private int jellyStartXCoord = 75;
    private int jellyStartYCoord = 75;

    // Game init info
    private boolean gameOver = false;
    private boolean gameStart = true;
    private boolean setUpSuccess = false;
    // GUI Fields
    private Stage _primaryStage;
    private Scene _levelOneScene, _menuScene;
    private Pane _root = new Pane();


    public App() {
        //Instantiate any objects here
        // new Jellys
        // new Map
        // new Puck

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        _primaryStage = primaryStage;

        setup();

        _levelOneScene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case W:
                    _puckman.moveUp();
                    break;
                case A:
                    _puckman.moveLeft();
                case S:
                    _puckman.moveDown();
                case D:
                    _puckman.moveRight();
                    break;
            }
        });

        _primaryStage.setScene(_levelOneScene);
        _primaryStage.show();

    }

    /**
     * This method runs to set up the initial state
     */
    public void setup() {
        _primaryStage.setTitle("Puckman!");

        _primaryStage.setMinHeight(500);
        _primaryStage.setMinWidth(500);
        _primaryStage.setMaxHeight(1000);
        _primaryStage.setMaxWidth(1000);

        _puckman = new Puck(50, 50, 25, 25);

        _root.setPrefSize(600, 600);
        _root.getChildren().add(_puckman);
        _levelOneScene = new Scene(_root);
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
     * Just to set this class as the main class, launches app
     * @param args - :shrugs:
     */
    public static void main(String[] args) {
        launch(args);
    }

    public void stop() {
        // Save any game state
    }

}
