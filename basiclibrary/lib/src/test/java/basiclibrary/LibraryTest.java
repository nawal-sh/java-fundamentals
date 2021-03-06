/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();

        // TEST roll()
        assertEquals(3, classUnderTest.roll(3).length, "Roll method test failed");

        // TEST containsDuplicate()
        assertTrue(classUnderTest.containsDuplicates(new int[]{5, 5, 4, 2}), "Contain duplicate method failed");

        //TEST averageCalculator()
        assertEquals(5, classUnderTest.averageCalculator(new int[]{6, 4, 2, 8}), "Average calculator method failed");

        // TEST lowestAverage()
        int[][] weeklyMonthTemperatures = {
                {64, 66, 57, 71, 60, 57, 65},//62
                {59, 65, 63, 51, 72, 57, 70},//62
                {56, 60, 55, 59, 58, 60, 61},//58
                {59, 62, 52, 54, 60, 57, 55}//57
        };
        int[] arr = new int[]{59, 62, 52, 54, 60, 57, 55};
        assertEquals(Arrays.toString(arr), Arrays.toString(classUnderTest.lowestAverage(weeklyMonthTemperatures)));

        // TEST analyzingWeatherData()
        int[][] array = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertNotNull(classUnderTest.analyzingWeatherData(array));

        // TEST tally()
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = classUnderTest.tally(votes);
        assertEquals("Bush received the most votes", winner + " received the most votes", "test failed we will get them next time");
    }
}
