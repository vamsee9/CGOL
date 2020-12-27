/**
 * 
 */
package cgol;

import java.awt.Dimension;

import javax.swing.JApplet;

/**
 * @author vamsi
 *
 */
@SuppressWarnings("deprecation")
public class LifeApplet extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int cellSize = 5;
	
	private Board board;

    public void init() {
        Dimension size = getSize();
        board = new Board(cellSize, size.width / cellSize,
                          size.height / cellSize, new BasicCell());
        add(board);
    }

    public void start() {
        board.start();
    }

    public void stop() {
        board.stop();
    }

    public void destroy() {
        stop();
    }
}
