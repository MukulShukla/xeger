package nl.flotsam.xeger;

import java.util.Random;

/**
 * Potentially a huge collection of utilities; now limited to only one method.
 */
public class XegerUtils {

    /**
     * Generates a random number within the given bounds.
     *
     * @param min The minimum number (inclusive).
     * @param max The maximum number (inclusive).
     * @param random The object used as the randomizer.
     * @return A random number in the given range.
     */
    public final static int getRandomInt(int min, int max, Random random) {
        int dif = max - min;
        float number = random.nextFloat();              // 0 <= number < 1
        return min + Math.round(number * dif);
    }

}
