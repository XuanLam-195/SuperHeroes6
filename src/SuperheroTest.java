import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroTest {
    Superhero testHero;

    @BeforeEach
    void setup() {
        testHero = new Superhero("Testman", "Test Testerson",
                "Testing",2023, "No", 0);
    }

    @Test
    void constructSuperhero() {
        assertAll("Testing superhero construction:",
                () -> assertEquals("Testman", testHero.getName()),
                () -> assertEquals("Test Testerson", testHero.getRealName()),
                () -> assertEquals("Testing", testHero.getSuperPower()),
                () -> assertEquals(2023, testHero.getYearCreated()),
                () -> assertEquals("No", testHero.getIsHuman()),
                () -> assertEquals(0, testHero.getStrength())
        );
    }

    @Test
    void testToString() {
        String resultStringExpected =
                "Superhero Name: " + testHero.getName() +
                        "\nReal Name: " + testHero.getRealName() +
                        "\nsuperPower: " + testHero.getSuperPower() +
                        "\nyearCreate: " + testHero.getYearCreated() +
                        "\nisHuman: " + testHero.getIsHuman() +
                        "\nstrength: " + testHero.getStrength();
        assertEquals(resultStringExpected, testHero.toString());
    }
}

