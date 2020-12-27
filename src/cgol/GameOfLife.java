package cgol;

import javax.swing.JFrame;

public class GameOfLife {

    static int width = 50;
    static int height = 50;
    static int unitSize = 10;

    public static void main(String args[]) {
        /* Fix for poor OpenJDK performance. */
        System.setProperty("sun.java2d.pmoffscreen", "false");

        /* Parse command line arguments */
        Cell cellType = new BasicCell();
        if (args.length >= 1) {
            if (args[0].equals("growth"))
                cellType = new GrowthCell();
            else if (args[0].equals("basic"))
                cellType = new BasicCell();
            else if (args[0].equals("random"))
                cellType = new RandomFactory();
            else {
                System.out.println("error: unknown cell type " + args[0]);
                System.exit(-1);
            }
        }
        if (args.length >= 3) {
            width = Integer.parseInt(args[1]);
            height = Integer.parseInt(args[2]);
        }
        if (args.length >= 4) {
            unitSize = Integer.parseInt(args[3]);
        }

        /* Initialize GUI */
        JFrame frame = new JFrame("Game of Life");
        Board board = new Board(unitSize, width, height, cellType);
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}
