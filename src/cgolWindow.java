import java.awt.*;
import javax.swing.*;

/**
 * @author vamsi
 *
 */
public class cgolWindow {
	static JPanel panel;
	static JFrame frame;
	private Integer dimn = 0;
	
	public cgolWindow(Integer dimen) {
		this.dimn = dimen * 10;
		panel = new JPanel();
		Dimension dimn = new Dimension(this.dimn, this.dimn);
		panel.setPreferredSize(dimn);
		frame = new JFrame();
		Integer framesize = (this.dimn < 100) ? 100 : this.dimn;
		frame.setSize(framesize, framesize);
		Container contentPane = frame.getContentPane();
		contentPane.add(panel);
		frame.setVisible(false);
	}
	
	public void sleep(Integer ms) {
		try {
			Thread.sleep(ms);
			Graphics v = panel.getGraphics();
			v.dispose();
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void display(int[][] array, Integer n) {
        frame.setTitle(String.format("Generation: %6d", n));
        Graphics g = panel.getGraphics();
        int BOX_DIM = 10;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                g.drawRect(i * BOX_DIM, j * BOX_DIM, 10, 10);
                if (array[i][j] == 0) {
                    g.setColor(Color.WHITE);
                    g.fillRect(i * BOX_DIM, j * BOX_DIM, 10, 10);
                }
                if (array[i][j] == 1) {
                    g.setColor(Color.BLACK);
                    g.fillRect(i * BOX_DIM, j * BOX_DIM, 10, 10);
                }
            }
        }

    }
}
