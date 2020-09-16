package puckman.creatures;

import javafx.scene.paint.Color;

public class Jelly extends Creature {

    // Fields
    private int _type;

    // Constructor
    public Jelly(int xpos, int ypos, int width, int height, int type) {
        // Call to abstract constructor
        super(xpos, ypos, width, height);
        _type = type;

        switch(_type) {
            case 1:
                setName("Karl");
                setColour(Color.GREEN);
                break;

            case 2:
                setName("Terence");
                setColour(Color.RED);
                break;

            case 3:
                setName("Marc");
                setColour(Color.MAGENTA);
                break;

            case 4:
                setName("Oliver");
                setColour(Color.BLUE);
                break;
        }
    }

    // Implemented abstract methods
}
