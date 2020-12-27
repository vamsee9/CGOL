
package cgol;

/*
 * @author vamsi
 * 
 */
import java.awt.Dimension;

import javax.swing.JApplet;

public class LifeApplet extends JApplet {

	private static final long serialVersionUID = 7359156116065111805L;
	private static final int cellSize = 5;

	private Board board;

	public void init() {
		Dimension size = getSize();
		board = new Board(cellSize, size.width / cellSize, size.height / cellSize, new BasicCell());
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
