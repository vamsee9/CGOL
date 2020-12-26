/**
 * 
 */

/**
 * @author vamsi
 *
 */

public class cgol {

	private Integer edge;
	int[][] currentGen;
	int[][] nextGen;
	private cgolWindow winDisplay;

	public cgol(Integer dimen) {
		this.winDisplay = new cgolWindow(dimen);
		this.edge = dimen - 1;
		this.nextGen = new int[dimen][dimen];
		currentGen = createRandomStart(dimen);
	}

	public cgol(Integer dimen, int[][] startmatrix) {
		this.winDisplay = new cgolWindow(dimen);
		this.edge = dimen - 1;
		this.nextGen = new int[dimen][dimen];

	}

	public static void main(String[] args) {
		cgol simule = new cgol(50);
		int[][] endingWorld = simule.simulate(50);
	}

	/**
	 * @param maxGen
	 * @return
	 */
	private int[][] simulate(Integer maxGen) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= maxGen; i++) {
			this.winDisplay.display(currentGen, i);
			this.winDisplay.sleep(125);
			copyAndZeroOut(nextGen, currentGen);
		}
		return currentGen;
	}

	// Contains the logic for the startingWorld.
	// Creates cells that are alive or dead in Gen 0.
	// Allocated and return the starting matrix of size 'dimen'.

	private int[][] createRandomStart(Integer dimen) {
		// create Random Start

		currentGen = new int[dimen][dimen];
		for (int i = 0; i < dimen; i++) {
			for (int j = 0; j < dimen; j++) {
				if (Math.random() * 100 > 50) {
					currentGen[i][j] = 1;
				} else {
					currentGen[i][j] = 0;
				}
			}
		}
		return currentGen;
	}

	// Copy the values of "Next" matrix to "current" matrix as Gen.
	// And then Zero Out the contents of "Next" matrix.

	public void copyAndZeroOut(int[][] next, int[][] current) {
		for (int i = 0; i < next.length; i++) {
			for (int j = 0; j < next.length; j++) {
				next[i][j] = isAlive(i, j, current);
			}
		}
		for (int i = 0; i < next.length; i++) {
			for (int j = 0; j < next.length; j++) {
				current[i][j] = next[i][j];
				next[i][j] = 0;
			}
		}
	}

	// calculate if any individual cell should be alive in the next gen
	// Based on the my game logic :
	/*
	 * Any live cell with fewer than two live neighbors dies, as if by needs caused
	 * by underpopulation. Any live cell with more than three live neighbors dies,
	 * as if by overcrowding. Any live cell with two or three live neighbors lives,
	 * unchanged, to the next generation. Any dead cell with exactly three live
	 * neighbors cells will come to life.
	 */

	private int isAlive(int row, int col, int[][] world) {
		return 0;
	}

}
