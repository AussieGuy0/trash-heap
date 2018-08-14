package me.anthonybruno.matchtracker.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Collection;
import java.util.List;

public abstract class AbstractDataStore<T> {

    protected JdbcTemplate dataSource;
    protected String entityName = getEntityName();
    protected RowMapper<T> rowMapper = createRowMapper();


    @Autowired
    public void setDataSource(JdbcTemplate dataSource) {
        this.dataSource = dataSource;
    }

    public Collection<T> getAll() {
        return dataSource.query("SELECT * FROM " + entityName, rowMapper);
    }

    public abstract T add(T item);

    public T getById(long id) {
        List<T> result = dataSource.query("SELECT * FROM " + entityName + " WHERE id=" + id, rowMapper);
        if (result.size() > 0) {
            return result.get(0);
        } else {
            return null;
        }
    }

    public T deleteById(long id) {
        dataSource.execute("DELETE FROM "+ entityName +" WHERE id=" + id);
        return null;
    }

    protected abstract RowMapper<T> createRowMapper();

    protected abstract String getEntityName();
}
