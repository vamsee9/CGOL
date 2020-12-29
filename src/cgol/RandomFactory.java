package cgol;

import java.awt.*;

/**
 * Spawns off random cells on divide().
 * 
 * @author vamsi 
 * 
 * This cell type doesn't actually do anything itself.
 */
public class RandomFactory extends Cell {

	interface Factory {
		Cell create();
	}

	Factory[] types = null;

	public RandomFactory() {
		types = new Factory[2];
		types[0] = new Factory() {
			public Cell create() {
				return new BasicCell();
			}
		};
		types[1] = new Factory() {
			public Cell create() {
				return new GrowthCell();
			}
		};
		curState = nextState = 0;
	}

	public Color getColor() {
		return new Color(255, 0, 0);
	}

	public void update() {
		/* Nothing */
	}

	public Cell divide() {
		return types[rand.nextInt(types.length)].create();
	}

	public Cell divide(int state) {
		return types[rand.nextInt(types.length)].create();
	}
}
