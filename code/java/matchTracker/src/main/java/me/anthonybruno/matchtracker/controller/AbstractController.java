package me.anthonybruno.matchtracker.controller;


import java.util.Collection;

public abstract class AbstractController<T> {

    public abstract Collection<T> list();

    public abstract T getById(long id);

    public abstract T add(T item);

    public abstract T deleteById(long id);
}
