package scorecalc;

public class ScoreCalc {

    public int seasonHomePoints(String[] fullSeasonGamesScores) {
        final int numOfGamesPerSeason = 38;

        if (fullSeasonGamesScores.length != numOfGamesPerSeason) {
            throw new IllegalArgumentException("not a valid Score length");
        }

        int totalScore = 0;
        for (int i = 0; i < fullSeasonGamesScores.length; i++) {
            String gameScore = fullSeasonGamesScores[i];
            totalScore += this.oneGamesPoints(gameScore);
        }

        return  totalScore;
    }

    public int oneGamesPoints(String score) throws IllegalArgumentException {
        if (score.length() != 3) {
            throw new IllegalArgumentException("not a valid Score length");
        }
        String rawHomeScore = String.valueOf(score.charAt(0));
        int homeScore = Integer.parseInt(rawHomeScore);

        if (!rawHomeScore.equals(String.valueOf(homeScore))) {
            throw new IllegalArgumentException("not a valid home score");
        }

        if (!String.valueOf(score.charAt(1)).equals(":")) {
            throw new IllegalArgumentException("Separate is invalid");
        }

        String rawAwayScore = String.valueOf(score.charAt(2));
        int awayScore = Integer.parseInt(rawAwayScore);

        if (!rawAwayScore.equals(String.valueOf(awayScore))) {
            throw new IllegalArgumentException("not a valid away score");
        }

        final int winPoints = 3;
        final int drawPoints = 1;
        final int losesPoints = 0;

        if (homeScore > awayScore) {
            // home team wins
            return winPoints;
        } else if (homeScore < awayScore) {
            // away team wins
            return losesPoints;
        } else {
            return drawPoints;
        }
    }
}
