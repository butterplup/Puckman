package puckman.creatures;

import javafx.scene.paint.*;
import javafx.scene.shape.*;

public abstract class Creature extends Rectangle {

    // Declare any common fields here
    private Color _colour;
    private String _name;
    private boolean _alive = true;

    /**
     * Constructor
     * @param xpos - initial x position
     * @param ypos - initial y position
     * @param width - width of shape
     * @param height - height of shape
     */
    public Creature(int xpos, int ypos, int width, int height) {
        super(xpos,ypos,width,height);

    }
    // Set up different values depending on which Creature is being made
    public void setColour(Color colour) { _colour = colour; }
    public void setName(String name) {
        _name = name;
    }

    // Declare non-abstract methods
    public void moveLeft() {
        setTranslateX(getTranslateX() - 5);
    }
    public void moveRight() {
        setTranslateX(getTranslateX() + 5);
    }
    public void moveUp() {
        setTranslateY(getTranslateY() - 5);
    }
    public void moveDown() {
        setTranslateY(getTranslateY() + 5);
    }

    // Declare any abstract methods

}
