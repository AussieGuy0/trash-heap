package me.anthonybruno.matchtracker.player;

import me.anthonybruno.matchtracker.data.AbstractDataStore;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDataStore extends AbstractDataStore<Player> {


    @Override
    public Player add(Player player) {
        dataSource.execute("INSERT INTO Player(name) values('"+ player.getName()+"')");

        return player;
    }

    @Override
    protected RowMapper<Player> createRowMapper() {
       return (resultSet, rowNum) -> new Player(resultSet.getLong("id"), resultSet.getString("name"));
    }

    @Override
    protected String getEntityName() {
        return "Player";
    }
}
