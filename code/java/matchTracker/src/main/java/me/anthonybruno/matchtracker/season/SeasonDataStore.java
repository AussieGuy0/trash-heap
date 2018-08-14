package me.anthonybruno.matchtracker.season;

import me.anthonybruno.matchtracker.data.AbstractDataStore;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

@Repository
public class SeasonDataStore extends AbstractDataStore<Season> {


    @Override
    public Season add(Season item) {
        dataSource.execute("INSERT INTO season(id) values('"+ item.getId()+"')");
        return item;
    }

    @Override
    protected RowMapper<Season> createRowMapper() {
        return (rs, rowNum) -> new Season(rs.getInt("id"));
    }

    @Override
    protected String getEntityName() {
        return "season";
    }
}
