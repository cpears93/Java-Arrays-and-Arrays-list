import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ScoreCardTest {
    private ScoreCard scoreCard;

    @Before
    public void before() {
        ArrayList<Integer> testScores = new ArrayList<Integer>();
        testScores.add(1);
        testScores.add(2);
        testScores.add(3);
        testScores.add(4);
        scoreCard = new ScoreCard(testScores);
    }

    @Test
    public void hasNumberOfScores() {
        assertEquals(4, scoreCard.getNumberOfScores());
    }

    @Test
    public void canAddScore() {
        scoreCard.addScore(12);
        assertEquals(5, scoreCard.getNumberOfScores());
    }

    @Test
    public void canGetScore() {
        assertEquals(1, scoreCard.getScoreAtIndex(0));
    }

    @Test
    public void canGetTotal() {
        assertEquals(10, scoreCard.getTotal());
    }
}
