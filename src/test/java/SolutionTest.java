import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void setup() {
        this.solution = new Solution();
    }

    @Test
    public void example_1() {
        // Given
        String x = "III";

        // When
        int response = solution.romanToInt(x);

        // Then
        assertEquals(response, 3);
    }

    @Test
    public void example_2() {
        // Given
        String x = "IV";

        // When
        int response = solution.romanToInt(x);

        // Then
        assertEquals(response, 4);
    }

    @Test
    public void example_3() {
        // Given
        String x = "IX";

        // When
        int response = solution.romanToInt(x);

        // Then
        assertEquals(response, 9);
    }

    @Test
    public void example_4() {
        // Given
        String x = "LVIII";

        // When
        int response = solution.romanToInt(x);

        // Then
        assertEquals(response, 58);
    }

    @Test
    public void example_5() {
        // Given
        String x = "MCMXCIV";

        // When
        int response = solution.romanToInt(x);

        // Then
        assertEquals(response, 1994);
    }
}