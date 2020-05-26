import java.util.ArrayList;

public class ScoreCard {

    public int getScoreAtIndex;
    private ArrayList<Integer> scores;

    public ScoreCard(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public int getNumberOfScores() {
        return this.scores.size();
    }

    public void addScore(int score) {
        this.scores.add(score);
    }

    public int getScoreAtIndex(int index) {
        return this.scores.get(index);
    }

    public int getTotal() {
        int total = 0;

//        for (int i = 0; i < getNumberOfScores(); i++) {
//            total += getScoreAtIndex(i);
//        }

        for (int score : this.scores) {
            total += score;
        }



        return total;
    }
}
