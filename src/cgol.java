/**
 * 
 */

/**
 * @author vamsi
 *
 */
public class cgol {
	
	public cgol(Integer dimen) {
	}
	
	public cgol(Integer dimen, int[][] startmatrix) {
	}
	
	@SuppressWarnings("unused")
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
		return new int[1][1];
	}
	
	// Contains the logic for the startingWorld.
	// Creates cells that are alive or dead in Gen 0.
	// Allocated and return the starting matrix of size 'dimen'.
	
	
	private int[][] createRandomStart(Integer dimen) {
		return new int[1][1];
	}
	
	// Copy the values of "Next" matrix to "current" matrix as Gen.
	// And then Zero Out the contents of "Next" matrix.
	
	public void copyAndZeroOut(int [][] next, int [][] current) {
	}
	
	// calculate if any individual cell should be alive in the next gen
	// Based on the my game logic :
	/*
	   Any live cell with fewer than two live neighbors dies, as if by needs caused by underpopulation.
	   Any live cell with more than three live neighbors dies, as if by overcrowding.
       Any live cell with two or three live neighbors lives, unchanged, to the next generation.
       Any dead cell with exactly three live neighbors cells will come to life.
	 */
	
	private int isAlive(int row, int col, int[][] world) {
		return 0;
	}
	
	

}
