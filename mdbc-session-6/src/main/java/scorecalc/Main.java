package scorecalc;

public class Main {
    static void main() {
        ScoreCalc season1 = new ScoreCalc();
        int numOfGame = 38;
        String[] games = generateGameScore(numOfGame);
        try {
            System.out.println(season1.seasonHomePoints(games));
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public static String[] generateGameScore(int numOfGames) {
        String[] output = new String[numOfGames];
        final int maxScore = 4;
        final int minScore = 0;

        for (int i = 0; i < numOfGames; i++) {
            int homeScore = (int)Math.floor(Math.random() * ((maxScore - minScore) + 1));
            int awayScore = (int)Math.floor(Math.random() * ((maxScore - minScore) + 1));

            String gameScore = homeScore + ":" + awayScore;
            System.out.println(gameScore);
            output[i] = gameScore;
        }
        return output;
    }
}
