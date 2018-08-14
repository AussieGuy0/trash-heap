package me.anthonybruno.matchtracker.service;

import me.anthonybruno.matchtracker.data.AbstractDataStore;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public abstract class AbstractService<R, T extends AbstractDataStore<R>> {

    @Autowired
    protected T dataStore;

    public Collection<R> getAll() {
        return dataStore.getAll();
    }

    public void add(R item) {
        dataStore.add(item);
    }

    public R getById(long id) {
        return dataStore.getById(id);
    }

    public R deleteById(long id) {
        return dataStore.deleteById(id);
    }
}
