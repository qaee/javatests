package de.vf.jdk10.interfaces;

public class PersonImpl implements Named, Person  {

    @Override
    public String getName() {
        return Named.super.getName();
    }

    @Override
    public int nextId() {
        return 0;
    }
}
