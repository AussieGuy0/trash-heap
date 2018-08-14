package me.anthonybruno.matchtracker.match;

import me.anthonybruno.matchtracker.data.AbstractDataStore;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MatchDataStore extends AbstractDataStore<Match> {

//    private static Map<Long, Match> matches;
//
//    static {
//        matches = new HashMap<>();
//        matches.put(0L, new Match(1,1,0,"Manchester City", 3, 1, "Adelaide United", 0));
//    }


    @Override
    public Match add(Match match) {
        dataSource.execute("INSERT INTO " + entityName + "(seasonId, homePlayerId, homeTeam, homeScore, awayPlayerId, awayTeam, awayScore)" +
                " VALUES("+createCommaSeparatedList(match.getSeasonId(), match.getHomePlayerId(), match.getHomeTeam(), match.getHomeScore(), match.getAwayPlayerId(), match.getAwayTeam(), match.getAwayScore())+")");
        return match;
    }

    @Override
    protected RowMapper<Match> createRowMapper() {
        return (rs, rowNum) -> {
            return new Match(rs.getLong("id"), rs.getInt("seasonId"), rs.getInt("homePlayerId"), rs.getString("homeTeam"),
                    rs.getInt("homeScore"), rs.getInt("awayPlayerId"), rs.getString("awayTeam"), rs.getInt("awayScore"));
        };
    }

    @Override
    protected String getEntityName() {
        return "`match`";
    }

    private String createCommaSeparatedList(Object... values) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (Object value : values) {
            if (value instanceof String) {
               builder.append("'").append(value).append("'");
            } else {
               builder.append(value);
            }
            if (count != values.length - 1) {
                builder.append(", ");
            }
            count++;
        }
        return builder.toString();
    }
}
