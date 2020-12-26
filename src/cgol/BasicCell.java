package cgol;
/**
 * 
 */

import java.awt.Color;

/**
 * @author vamsi
 *
 */
public class BasicCell extends Cell {
	
	private Color live, dead;

    public BasicCell() {
        this(rand.nextInt(2));
    }

    public BasicCell(int initState) {
        curState = nextState = initState;
        live = new Color(0, 0, 0);
        dead = new Color(255, 255, 255);
    }

    public Color getColor() {
        if (curState == 1)
            return live;
        return dead;
    }

}
