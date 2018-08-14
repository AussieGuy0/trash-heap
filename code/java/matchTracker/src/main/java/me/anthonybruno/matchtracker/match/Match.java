package me.anthonybruno.matchtracker.match;


public class Match {

    private long matchId;

    private int seasonId;
    private int homePlayerId;
    private String homeTeam;
    private int homeScore;
    private int awayPlayerId;
    private String awayTeam;
    private int awayScore;

    public Match() {
    }

    public Match(long matchId, int seasonId, int homePlayerId, String homeTeam, int homeScore, int awayPlayerId, String awayTeam, int awayScore) {
        this.matchId = matchId;
        this.seasonId = seasonId;
        this.homePlayerId = homePlayerId;
        this.homeTeam = homeTeam;
        this.homeScore = homeScore;
        this.awayPlayerId = awayPlayerId;
        this.awayTeam = awayTeam;
        this.awayScore = awayScore;
    }

    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public int getHomePlayerId() {
        return homePlayerId;
    }

    public void setHomePlayerId(int homePlayerId) {
        this.homePlayerId = homePlayerId;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayPlayerId() {
        return awayPlayerId;
    }

    public void setAwayPlayerId(int awayPlayerId) {
        this.awayPlayerId = awayPlayerId;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", seasonId=" + seasonId +
                ", homePlayerId=" + homePlayerId +
                ", homeTeam='" + homeTeam + '\'' +
                ", homeScore=" + homeScore +
                ", awayPlayerId=" + awayPlayerId +
                ", awayTeam='" + awayTeam + '\'' +
                ", awayScore=" + awayScore +
                '}';
    }
}
