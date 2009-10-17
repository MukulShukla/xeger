package nl.flotsam.xeger;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import org.hamcrest.Matchers;
import dk.brics.automaton.RegExp;

import java.util.Random;

public class XegerUtilsTest {

    @Test
    public void shouldGenerateRandomNumberCorrectly() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int number = XegerUtils.getRandomInt(3, 7, random);
            assertThat(number, Matchers.greaterThanOrEqualTo(3));
            assertThat(number, Matchers.lessThanOrEqualTo(7));
        }
    }

}
