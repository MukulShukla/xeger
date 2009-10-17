package nl.flotsam.xeger;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import org.hamcrest.Matchers;
import org.hamcrest.CoreMatchers;
import dk.brics.automaton.RegExp;

import java.util.Random;

public class XegerTest {

    @Test
    public void shouldGenerateTextCorrectly() {
        String regex = "[ab]{4,6}c";
        Xeger generator = new Xeger(regex);
        for (int i = 0; i < 100; i++) {
            String text = generator.generate();
            assertTrue(text.matches(regex));
        }
    }

}
