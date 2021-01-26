package xwmtp.bingoleaderboard.racetime.model.leaderboard;

import xwmtp.bingoleaderboard.racetime.model.RacetimeUser;

public class RacetimeRanking {
    private int score = 0;
    private int timesRaced = 0;
    private RacetimeUser user = new RacetimeUser();

    public int getScore() {
        return score;
    }

    public int getTimesRaced() {
        return timesRaced;
    }

    public RacetimeUser getUser() {
        return user;
    }

    public String toString() {
        return "\n\nscore: " + score +
                "\ntimesRaced: " + timesRaced +
                "\nid: " + user.getId() +
                "\nname: " + user.getName();
    }
}